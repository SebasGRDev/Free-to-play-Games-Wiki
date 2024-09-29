package com.sebasgrdev.freetoplaygameswiki.ui.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sebasgrdev.freetoplaygameswiki.R

@Composable
fun ImagesScreenshots() {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(dimensionResource(R.dimen.padding_medium)),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(4) {
            ItemScrenshots()
        }
    }
}

@Composable
fun ItemScrenshots() {
    Card(
        modifier = Modifier
            .width(350.dp)
    ) {
        Column() {
            Image(
                painter = painterResource(R.drawable.thumbnail),
                contentScale = ContentScale.Crop,
                contentDescription = "",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}