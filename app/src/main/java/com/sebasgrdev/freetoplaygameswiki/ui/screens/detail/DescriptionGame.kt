package com.sebasgrdev.freetoplaygameswiki.ui.screens.detail

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import com.sebasgrdev.freetoplaygameswiki.R

@Composable
fun DescriptionGame(description: String) {
    Text(
        text = description, color = Color.White, modifier = Modifier.padding(
            PaddingValues(
                dimensionResource(R.dimen.padding_medium)
            )
        )
    )
}