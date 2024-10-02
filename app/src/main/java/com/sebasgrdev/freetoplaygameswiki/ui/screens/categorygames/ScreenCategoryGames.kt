package com.sebasgrdev.freetoplaygameswiki.ui.screens.categorygames

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.sebasgrdev.freetoplaygameswiki.ui.navigation.GameCategory
import com.sebasgrdev.freetoplaygameswiki.ui.screens.tools.TopBar
import com.sebasgrdev.freetoplaygameswiki.viewmodel.GamesViewModel

@Composable
fun ScreenCategoryGames(
    modifier: Modifier,
    navController: NavHostController,
    viewModel: GamesViewModel = hiltViewModel(),
    category: String?
) {

    val games = when(category) {
        GameCategory.Popular.route -> viewModel.popularGames.collectAsState()
        GameCategory.All.route -> viewModel.allGames.collectAsState()
        GameCategory.Release.route -> viewModel.releaseGames.collectAsState()
        GameCategory.Pc.route -> viewModel.pcGames.collectAsState()
        GameCategory.Browser.route -> viewModel.browserGames.collectAsState()
        else -> {
            LaunchedEffect(key1 = category) {
                category?.let {
                    viewModel.getGamesByCategory(it)
                }
            }
            viewModel.gameCategory.collectAsState()
        }
    }

    val state by games

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
        TopBar("Category", navController)
        CardsCategoryGame(state, navController)
    }
}