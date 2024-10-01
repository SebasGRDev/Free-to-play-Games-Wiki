package com.sebasgrdev.freetoplaygameswiki.ui.screens.detail

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.sebasgrdev.freetoplaygameswiki.ui.screens.tools.TopBar
import com.sebasgrdev.freetoplaygameswiki.viewmodel.GamesViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ScreenDetail(
    modifier: Modifier = Modifier,
    viewModel: GamesViewModel = hiltViewModel(),
    gameId: Int,
    navController: NavHostController
) {
    LaunchedEffect(key1 = gameId) {
        viewModel.getGameDetails(gameId)
    }

    val gameDetails by viewModel.gameDetails.collectAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(Color.DarkGray, Color.Black),
                    start = Offset(0f, 0f),
                    end = Offset(1000f, 1000f)
                )
            )
    ) {
        TopBar("Details", navController)
        LazyColumn {
            gameDetails?.let { game ->
                item { PosterDetail(game.thumbnail) }
                item { TitleDetail(game.title) }
                item {
                    DetailsGame(
                        game.release_date,
                        game.genre,
                        game.platform,
                        game.publisher,
                        game.developer
                    )
                }
                item { TitleDetailsDivider("Description") }
                item { DescriptionGame(game.description) }
                item { TitleDetailsDivider("Screenshots") }
                item { ImagesScreenshots(game.screenshots) }
                if (game.minimum_system_requirements != null) {
                    item { TitleDetailsDivider("Minimum System Requirements") }
                    item {
                        MinimunRequirements(
                            game.minimum_system_requirements.os ?: "",
                            game.minimum_system_requirements.processor ?: "",
                            game.minimum_system_requirements.memory ?: "",
                            game.minimum_system_requirements.graphics ?: "",
                            game.minimum_system_requirements.storage ?: ""
                        )
                    }
                } else {
                    item { TitleDetailsDivider("Browser required") }
                    item { TextBrowserRequired() }
                }
                item { TitleDetailsDivider("Related Games") }
                item { CardsRelatedGames(genre = game.genre, navController = navController) }
            }
        }
    }
}
