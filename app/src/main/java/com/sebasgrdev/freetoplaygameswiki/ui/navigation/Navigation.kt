package com.sebasgrdev.freetoplaygameswiki.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.sebasgrdev.freetoplaygameswiki.model.data.response.DetailResponse
import com.sebasgrdev.freetoplaygameswiki.ui.screens.categorygames.ScreenCategoryGames
import com.sebasgrdev.freetoplaygameswiki.ui.screens.detail.ScreenDetail
import com.sebasgrdev.freetoplaygameswiki.ui.screens.main.ScreenMain

@Composable
fun NavigationComponent(navController: NavHostController, innerPadding: PaddingValues) {
    NavHost(navController = navController, startDestination = "screen_main") {
        composable("screen_main") { ScreenMain(modifier = Modifier.padding(innerPadding), navController = navController)}
        composable(
            route = "game?id={id}",
            arguments = listOf(navArgument("id") {type = NavType.IntType})
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id") ?: -1
            ScreenDetail(modifier = Modifier.padding(innerPadding), gameId = id, navController = navController)
        }
        composable(
            route = "category_games/{category}",
            arguments = listOf(navArgument("category") { type = NavType.StringType })
        ) { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category")
            ScreenCategoryGames(
                modifier = Modifier.padding(innerPadding),
                navController = navController,
                category = category
            )
        }
    }
}