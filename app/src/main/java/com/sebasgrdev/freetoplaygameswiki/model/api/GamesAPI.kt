package com.sebasgrdev.freetoplaygameswiki.model.api

import com.sebasgrdev.freetoplaygameswiki.model.data.response.DetailResponse
import com.sebasgrdev.freetoplaygameswiki.model.data.response.GameResponseItem
import com.sebasgrdev.freetoplaygameswiki.model.data.response.MinimumSystemRequirements
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GamesAPI {

    @GET("games")
    suspend fun getAllGames() : List<GameResponseItem>

    @GET("game")
    suspend fun getGameById(@Query("id") id: Int) : DetailResponse

    @GET("games?sort-by=release-date")
    suspend fun getGamesbyRelease() : List<GameResponseItem>

    @GET("games?sort-by=popularity")
    suspend fun getPopularGames()  : List<GameResponseItem>

    @GET("games")
    suspend fun getGamesByPlatform(@Query("platform") platform: String) : List<GameResponseItem>

    @GET("games")
    suspend fun getGamesByCategory(@Query("category") category_name: String) : List<GameResponseItem>

}