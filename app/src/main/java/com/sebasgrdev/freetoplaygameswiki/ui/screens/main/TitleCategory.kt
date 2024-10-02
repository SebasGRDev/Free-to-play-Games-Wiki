package com.sebasgrdev.freetoplaygameswiki.ui.screens.main

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.sebasgrdev.freetoplaygameswiki.R
import com.sebasgrdev.freetoplaygameswiki.ui.navigation.GameCategory

@Composable
fun TitleCategory(title: String, category: GameCategory, navController: NavHostController) {
    Row {
        Text(
            text = title,
            textAlign = TextAlign.Start,
            fontSize = 24.sp,
            modifier = Modifier.padding(PaddingValues(dimensionResource(R.dimen.padding_small))),
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        TextButton(
            onClick = {
                navController.navigate("category_games/${category.route}")
            },
            modifier = Modifier,
            contentPadding = PaddingValues(dimensionResource(R.dimen.padding_small))
        ) {
            Text(text = "Ver todo")
            Icon(imageVector = Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "")
        }
    }
    HorizontalDivider(
        Modifier
            .height(2.dp)
            .padding(PaddingValues(dimensionResource(R.dimen.padding_small)))
    )
}