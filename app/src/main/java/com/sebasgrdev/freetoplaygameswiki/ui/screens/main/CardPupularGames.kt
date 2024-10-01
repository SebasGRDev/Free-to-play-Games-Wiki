package com.sebasgrdev.freetoplaygameswiki.ui.screens.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.sebasgrdev.freetoplaygameswiki.R
import com.sebasgrdev.freetoplaygameswiki.model.api.response.DataResponseItem
import com.sebasgrdev.freetoplaygameswiki.viewmodel.GamesViewModel

@Composable
fun CardsPopularGames(viewModel: GamesViewModel = hiltViewModel()) {
    val state by viewModel.popularGames.collectAsState()
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(dimensionResource(R.dimen.padding_medium)),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(state) {
            ItemPopularGames(it)
        }
    }
}
