package com.sebasgrdev.freetoplaygameswiki.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.sebasgrdev.freetoplaygameswiki.ui.navigation.GameCategory
import com.sebasgrdev.freetoplaygameswiki.ui.screens.tools.MenuIcon
import com.sebasgrdev.freetoplaygameswiki.ui.screens.tools.SearchGame
import com.sebasgrdev.freetoplaygameswiki.viewmodel.GamesViewModel

@Composable
fun ScreenMain(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    viewModel: GamesViewModel = hiltViewModel()
) {
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
        Row(verticalAlignment = Alignment.CenterVertically) {
            MenuIcon()
            SearchGame()
        }

        LazyColumn {
            item { TitleCategory("Popular Games", GameCategory.Popular, navController) }
            item { CardsPopularGames(viewModel, navController) }
            item { TitleCategory("All Games", GameCategory.All, navController) }
            item { CardAllGames(viewModel, navController) }
            item { TitleCategory("Release Date", GameCategory.Release, navController) }
            item { CardReleaseGames(viewModel, navController) }
            item { TitleCategory("Pc Games", GameCategory.Pc, navController) }
            item { CardPcGames(viewModel, navController) }
            item { TitleCategory("Browser Games", GameCategory.Browser, navController) }
            item { CardBrowserGames(viewModel, navController) }
        }
    }
}