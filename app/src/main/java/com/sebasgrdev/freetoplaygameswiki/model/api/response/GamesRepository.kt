package com.sebasgrdev.freetoplaygameswiki.model.api.response

import com.sebasgrdev.freetoplaygameswiki.model.api.GamesAPI
import javax.inject.Inject

class GamesRepository @Inject constructor(private val api: GamesAPI) {
    suspend fun getPopularGames(): List<DataResponseItem> {
        return api.getPopularGames()
    }
    suspend fun getAllGames(): List<DataResponseItem> {
        return api.getAllGames()
    }
    suspend fun getReleaseGames(): List<DataResponseItem> {
        return api.getGamesbyRelease()
    }
    suspend fun getPcGames(): List<DataResponseItem> {
        return api.getGamesByPlatform("pc")
    }
    suspend fun getBrowserGames(): List<DataResponseItem> {
        return api.getGamesByPlatform("browser")
    }
}