package com.sebasgrdev.freetoplaygameswiki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.sebasgrdev.freetoplaygameswiki.model.api.GameClient
import com.sebasgrdev.freetoplaygameswiki.ui.navigation.NavigationComponent
import com.sebasgrdev.freetoplaygameswiki.ui.screens.main.ScreenMain
import com.sebasgrdev.freetoplaygameswiki.ui.theme.FreeToPlayGamesWikiTheme
import com.sebasgrdev.freetoplaygameswiki.viewmodel.GamesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FreeToPlayGamesWikiTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavigationComponent(navController = navController, innerPadding = innerPadding)
                    //ScreenMain(Modifier.padding(innerPadding), navController)
                }
            }
        }
    }
}