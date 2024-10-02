package com.sebasgrdev.freetoplaygameswiki.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sebasgrdev.freetoplaygameswiki.model.data.response.GameResponseItem
import com.sebasgrdev.freetoplaygameswiki.model.api.GamesRepository
import com.sebasgrdev.freetoplaygameswiki.model.data.response.DetailResponse
import com.sebasgrdev.freetoplaygameswiki.model.data.response.MinimumSystemRequirements
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GamesViewModel @Inject constructor(private val gamesRepo: GamesRepository) : ViewModel() {

    private val _popularGames = MutableStateFlow(emptyList<GameResponseItem>())
    val popularGames : StateFlow<List<GameResponseItem>> = _popularGames

    private val _allGames = MutableStateFlow(emptyList<GameResponseItem>())
    val allGames : StateFlow<List<GameResponseItem>> = _allGames

    private val _releaseGames = MutableStateFlow(emptyList<GameResponseItem>())
    val releaseGames : StateFlow<List<GameResponseItem>> = _releaseGames

    private val _pcGames = MutableStateFlow(emptyList<GameResponseItem>())
    val pcGames : StateFlow<List<GameResponseItem>> = _pcGames

    private val _browserGames = MutableStateFlow(emptyList<GameResponseItem>())
    val browserGames : StateFlow<List<GameResponseItem>> = _browserGames

    private val _gameDetails = MutableStateFlow<DetailResponse?>(null)
    val gameDetails : StateFlow<DetailResponse?>  = _gameDetails

    private val _gameCategory = MutableStateFlow(emptyList<GameResponseItem>())
    val gameCategory : StateFlow<List<GameResponseItem>>  = _gameCategory

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

    fun getGameDetails(gameId: Int) {
        viewModelScope.launch {
            _gameDetails.value = gamesRepo.getGamesById(gameId)
        }
    }

    fun getGamesByCategory(category: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _gameCategory.value = gamesRepo.getGamesByCategory(category)
        }
    }
}