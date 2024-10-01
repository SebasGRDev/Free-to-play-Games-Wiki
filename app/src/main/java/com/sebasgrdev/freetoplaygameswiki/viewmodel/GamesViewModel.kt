package com.sebasgrdev.freetoplaygameswiki.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sebasgrdev.freetoplaygameswiki.model.api.response.DataResponseItem
import com.sebasgrdev.freetoplaygameswiki.model.api.response.GamesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GamesViewModel @Inject constructor(private val gamesRepo: GamesRepository) : ViewModel() {

    private val _popularGames = MutableStateFlow(emptyList<DataResponseItem>())
    val popularGames : StateFlow<List<DataResponseItem>> = _popularGames

    private val _allGames = MutableStateFlow(emptyList<DataResponseItem>())
    val allGames : StateFlow<List<DataResponseItem>> = _allGames

    private val _releaseGames = MutableStateFlow(emptyList<DataResponseItem>())
    val releaseGames : StateFlow<List<DataResponseItem>> = _releaseGames

    private val _pcGames = MutableStateFlow(emptyList<DataResponseItem>())
    val pcGames : StateFlow<List<DataResponseItem>> = _pcGames

    private val _browserGames = MutableStateFlow(emptyList<DataResponseItem>())
    val browserGames : StateFlow<List<DataResponseItem>> = _browserGames

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                _popularGames.value = gamesRepo.getPopularGames()
                _allGames.value = gamesRepo.getAllGames()
                _releaseGames.value = gamesRepo.getReleaseGames()
                _pcGames.value = gamesRepo.getPcGames()
                _browserGames.value = gamesRepo.getBrowserGames()
            } catch (e: Exception) {
                //No interntet
            }

        }
    }
}