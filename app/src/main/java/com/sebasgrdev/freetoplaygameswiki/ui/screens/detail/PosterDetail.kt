package com.sebasgrdev.freetoplaygameswiki.ui.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.sebasgrdev.freetoplaygameswiki.R

@Composable
fun PosterDetail() {
    Image(
        painter = painterResource(R.drawable.thumbnail),
        contentDescription = "",
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
}