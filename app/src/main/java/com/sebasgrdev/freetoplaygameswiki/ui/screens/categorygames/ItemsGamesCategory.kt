package com.sebasgrdev.freetoplaygameswiki.ui.screens.categorygames

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.sebasgrdev.freetoplaygameswiki.R
import com.sebasgrdev.freetoplaygameswiki.model.data.response.GameResponseItem

@Composable
fun ItemsGamesCategory(game: GameResponseItem, navController : NavHostController) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .height(300.dp),
        border = BorderStroke(2.dp, color = Color.DarkGray),
        onClick = { navController.navigate("game?id=${game.id}") }
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
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier.padding(
                    PaddingValues(
                        dimensionResource(R.dimen.padding_small)
                    )
                )
            )
            Text(
                text = game.short_description,
                color = Color.White,
                modifier = Modifier.padding(
                    PaddingValues(
                        dimensionResource(R.dimen.padding_small)
                    )
                )
            )
        }
    }
}