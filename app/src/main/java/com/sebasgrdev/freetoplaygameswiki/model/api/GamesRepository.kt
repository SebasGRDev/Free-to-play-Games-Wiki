package com.sebasgrdev.freetoplaygameswiki.model.api

import com.sebasgrdev.freetoplaygameswiki.model.data.response.DetailResponse
import com.sebasgrdev.freetoplaygameswiki.model.data.response.GameResponseItem
import com.sebasgrdev.freetoplaygameswiki.model.data.response.MinimumSystemRequirements
import retrofit2.Call
import javax.inject.Inject

class GamesRepository @Inject constructor(private val api: GamesAPI) {
    suspend fun getPopularGames(): List<GameResponseItem> {
        return api.getPopularGames()
    }
    suspend fun getAllGames(): List<GameResponseItem> {
        return api.getAllGames()
    }
    suspend fun getReleaseGames(): List<GameResponseItem> {
        return api.getGamesbyRelease()
    }
    suspend fun getPcGames(): List<GameResponseItem> {
        return api.getGamesByPlatform("pc")
    }
    suspend fun getBrowserGames(): List<GameResponseItem> {
        return api.getGamesByPlatform("browser")
    }
    suspend fun getGamesById(gameId: Int): DetailResponse {
        return api.getGameById(gameId)
    }
    suspend fun getGamesByCategory(category: String): List<GameResponseItem> {
        return api.getGamesByCategory(category)
    }
}