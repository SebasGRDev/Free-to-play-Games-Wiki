package com.sebasgrdev.freetoplaygameswiki.ui.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import com.sebasgrdev.freetoplaygameswiki.R

@Composable
fun PosterDetail(imageUrl: String) {
    AsyncImage(
        model = imageUrl,
        contentDescription = "",
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
}