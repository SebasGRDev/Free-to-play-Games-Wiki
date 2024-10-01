package com.sebasgrdev.freetoplaygameswiki.ui.screens.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sebasgrdev.freetoplaygameswiki.R
import com.sebasgrdev.freetoplaygameswiki.viewmodel.GamesViewModel

@Composable
fun CardPcGames(viewModel: GamesViewModel = hiltViewModel()) {
    val state by viewModel.pcGames.collectAsState()
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(dimensionResource(R.dimen.padding_medium)),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(state) {
            ItemGames(it)
        }
    }
}