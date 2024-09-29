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
fun MinimunRequirements(
    os: String,
    processor: String,
    memory: String,
    graphics: String,
    storage: String
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                PaddingValues(
                    dimensionResource(R.dimen.padding_medium)
                )
            )
    ) {
        Text(text = "OS: $os", color = Color.White, fontSize = 12.sp)
        Text(text = "Processor: $processor", color = Color.White, fontSize = 12.sp)
        Text(text = "Memory: $memory", color = Color.White, fontSize = 12.sp)
        Text(text = "Graphics: $graphics", color = Color.White, fontSize = 12.sp)
        Text(text = "Storage: $storage", color = Color.White, fontSize = 12.sp)
    }
}