package com.sebasgrdev.freetoplaygameswiki.ui.navigation

sealed class GameCategory(val route: String) {
    object Popular : GameCategory("popular")
    object All : GameCategory("all")
    object Release : GameCategory("release")
    object Pc : GameCategory("pc")
    object Browser : GameCategory("browser")
}