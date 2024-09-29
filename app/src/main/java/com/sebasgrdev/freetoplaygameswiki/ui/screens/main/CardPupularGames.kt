package com.sebasgrdev.freetoplaygameswiki.ui.screens.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
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
import com.sebasgrdev.freetoplaygameswiki.R

@Composable
fun CardsPopularGames() {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(dimensionResource(R.dimen.padding_medium)),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(count = 9) {
            ItemPopularGames()
        }
    }
}

@Composable
fun ItemPopularGames() {
    Card(
        modifier = Modifier
            .width(350.dp),
        border = BorderStroke(2.dp, color = Color.DarkGray)
    ) {
        Column(Modifier.background(Color.Black)) {
            Image(
                painter = painterResource(R.drawable.thumbnail),
                contentScale = ContentScale.Crop,
                contentDescription = "",
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = "Tarisland",
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
                text = "A cross-platform MMORPG developed by Level Infinite and Published by Tencent.",
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
