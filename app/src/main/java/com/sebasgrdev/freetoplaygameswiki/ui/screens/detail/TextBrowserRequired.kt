package com.sebasgrdev.freetoplaygameswiki.ui.screens.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.sp
import com.sebasgrdev.freetoplaygameswiki.R

@Composable
fun TextBrowserRequired() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                PaddingValues(
                    dimensionResource(R.dimen.padding_medium)
                )
            )
    ) {
        Text(text = "To play this game, a web browser is required.", color = Color.White, fontSize = 12.sp)
    }
}