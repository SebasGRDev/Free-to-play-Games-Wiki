package com.sebasgrdev.freetoplaygameswiki.model.api

import com.sebasgrdev.freetoplaygameswiki.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object GameClient {

    @Provides
    @Singleton
     fun provideApi(): GamesAPI {
         return Retrofit.Builder()
             .baseUrl(Constants.BASE_URL)
             .addConverterFactory(GsonConverterFactory.create())
             .build()
             .create(GamesAPI::class.java)
     }
}