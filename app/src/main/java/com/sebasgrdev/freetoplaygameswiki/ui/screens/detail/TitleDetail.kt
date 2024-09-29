package com.sebasgrdev.freetoplaygameswiki.ui.screens.detail

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sebasgrdev.freetoplaygameswiki.R

@Composable
fun TitleDetail(title: String) {
    Text(
        text = title, color = Color.White, modifier = Modifier
            .fillMaxWidth()
            .padding(
                PaddingValues(
                    dimensionResource(R.dimen.padding_medium)
                )
            ), fontWeight = FontWeight.Bold, fontSize = 24.sp, fontStyle = FontStyle.Italic
    )
}