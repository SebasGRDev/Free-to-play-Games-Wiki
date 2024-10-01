package com.sebasgrdev.freetoplaygameswiki.ui.screens.categorygames

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.sebasgrdev.freetoplaygameswiki.ui.screens.tools.TopBar

@Composable
fun ScreenCategoryGames(modifier: Modifier, navController: NavHostController) {
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
        TopBar("Shooters", navController)
        CardsCategoryGame()
    }
}