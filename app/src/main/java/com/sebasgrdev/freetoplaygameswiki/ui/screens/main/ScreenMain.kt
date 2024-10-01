package com.sebasgrdev.freetoplaygameswiki.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.sebasgrdev.freetoplaygameswiki.ui.screens.tools.SearchGame
import com.sebasgrdev.freetoplaygameswiki.viewmodel.GamesViewModel

@Composable
fun ScreenMain(modifier: Modifier = Modifier, navController: NavHostController, viewModel: GamesViewModel = hiltViewModel()) {
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
        SearchGame()
        LazyColumn {
            item { TitleCategory("Popular Games") }
            item { CardsPopularGames(viewModel, navController) }
            item { TitleCategory("All Games") }
            item { CardAllGames(viewModel, navController) }
            item { TitleCategory("Release Date") }
            item { CardReleaseGames(viewModel, navController) }
            item { TitleCategory("Pc Games") }
            item { CardPcGames(viewModel, navController) }
            item { TitleCategory("Browser Games") }
            item { CardBrowserGames(viewModel, navController) }
        }
    }
}