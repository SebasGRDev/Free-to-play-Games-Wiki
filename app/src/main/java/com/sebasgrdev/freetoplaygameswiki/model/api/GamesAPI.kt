package com.sebasgrdev.freetoplaygameswiki.model.api

import com.sebasgrdev.freetoplaygameswiki.model.api.response.DataResponse
import com.sebasgrdev.freetoplaygameswiki.model.api.response.DataResponseItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GamesAPI {

    @GET("games")
    suspend fun getAllGames() : List<DataResponseItem>

    @GET("game")
    suspend fun getGameById(@Query("id") id: String)

    @GET("games?sort-by=release-date")
    suspend fun getGamesbyRelease() : List<DataResponseItem>

    @GET("games?sort-by=popularity")
    suspend fun getPopularGames()  : List<DataResponseItem>

    @GET("games")
    suspend fun getGamesByPlatform(@Query("platform") platform: String) : List<DataResponseItem>

    @GET("games")
    suspend fun getGamesByCategory(@Query("category") category_name: String) : DataResponseItem

}