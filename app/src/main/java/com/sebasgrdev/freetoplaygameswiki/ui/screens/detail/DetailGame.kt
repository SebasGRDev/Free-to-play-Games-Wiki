package com.sebasgrdev.freetoplaygameswiki.ui.screens.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sebasgrdev.freetoplaygameswiki.R

@Composable
fun DetailsGame(release: String, genre: String, platform: String, publisher: String, dev: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                PaddingValues(
                    dimensionResource(R.dimen.padding_medium)
                )
            ), horizontalArrangement = Arrangement.Start
    ) {
        Column {
            Text(text = "Release: $release", color = Color.White, fontSize = 12.sp)
            Text(text = "Genre: $genre", color = Color.White, fontSize = 12.sp)
            Text(text = "Platform: $platform", color = Color.White, fontSize = 12.sp)
        }
        Spacer(Modifier.width(24.dp))
        Column {
            Text(text = "Publisher: $publisher", color = Color.White, fontSize = 12.sp)
            Text(text = "Developer: $dev", color = Color.White, fontSize = 12.sp)
        }
    }
}