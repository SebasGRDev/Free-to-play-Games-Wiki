package com.sebasgrdev.freetoplaygameswiki.ui.screens.categorygames

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.sebasgrdev.freetoplaygameswiki.model.data.response.GameResponseItem

@Composable
fun CardsCategoryGame(games: List<GameResponseItem>, navController: NavHostController) {

    LazyVerticalGrid(
        columns = GridCells.Adaptive(150.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        items(games) { game ->
            ItemsGamesCategory(game, navController)
        }
    }
}
