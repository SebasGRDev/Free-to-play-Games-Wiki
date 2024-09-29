package com.sebasgrdev.freetoplaygameswiki.ui.screens.detail

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sebasgrdev.freetoplaygameswiki.R

@Composable
fun CardsRelatedGames() {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(dimensionResource(R.dimen.padding_medium)),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(count = 9) {
            ItemRelatedGames()
        }
    }
}

@Composable
fun ItemRelatedGames() {
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