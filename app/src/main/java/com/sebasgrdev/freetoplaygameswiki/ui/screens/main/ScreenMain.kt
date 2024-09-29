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
import androidx.compose.ui.tooling.preview.Preview
import com.sebasgrdev.freetoplaygameswiki.ui.screens.tools.SearchGame

@Preview(showSystemUi = true)
@Composable
fun ScreenMain(modifier: Modifier = Modifier) {
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
            item { CardsPopularGames() }
            item { TitleCategory("All Games") }
            item { CardsGames() }
            item { TitleCategory("Release Date") }
            item { CardsGames() }
            item { TitleCategory("Pc Games") }
            item { CardsGames() }
            item { TitleCategory("Browser Games") }
            item { CardsGames() }
        }
    }
}