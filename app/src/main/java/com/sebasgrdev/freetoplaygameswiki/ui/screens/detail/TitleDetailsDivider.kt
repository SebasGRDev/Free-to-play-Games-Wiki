package com.sebasgrdev.freetoplaygameswiki.ui.screens.detail

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sebasgrdev.freetoplaygameswiki.R

@Composable
fun TitleDetailsDivider(title: String) {
    Text(
        text = title,
        textAlign = TextAlign.Start,
        fontSize = 24.sp,
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        fontWeight = FontWeight.Bold,
        color = Color.White
    )
    HorizontalDivider(
        Modifier
            .height(2.dp)
            .padding(PaddingValues(dimensionResource(R.dimen.padding_small)))
    )
}