package com.sebasgrdev.freetoplaygameswiki.ui.screens.detail

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.sebasgrdev.freetoplaygameswiki.R
import com.sebasgrdev.freetoplaygameswiki.model.data.response.GameResponseItem
import com.sebasgrdev.freetoplaygameswiki.viewmodel.GamesViewModel

@Composable
fun CardsRelatedGames(
    viewModel: GamesViewModel = hiltViewModel(),
    navController: NavHostController,
    genre: String
) {
    val allGames by viewModel.allGames.collectAsState()
    val relatedGames = allGames.filter { it.genre == genre }
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(dimensionResource(R.dimen.padding_medium)),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(relatedGames) {
            ItemRelatedGames(game = it, navController = navController)
        }
    }
}

@Composable
fun ItemRelatedGames(navController: NavHostController, game: GameResponseItem) {
    Card(
        modifier = Modifier
            .width(350.dp)
            .height(250.dp),
        border = BorderStroke(2.dp, color = Color.DarkGray),
        onClick = {
            navController.navigate("game?id=${game.id}")
        }
    ) {
        Column(Modifier.background(Color.Black).fillMaxSize()) {
            AsyncImage(
                model = game.thumbnail,
                contentScale = ContentScale.FillWidth,
                contentDescription = "",
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = game.title,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(
                        PaddingValues(
                            dimensionResource(R.dimen.padding_small)
                        )
                    )
                    .fillMaxWidth()
            )
        }
    }
}