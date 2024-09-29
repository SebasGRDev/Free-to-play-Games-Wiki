package com.sebasgrdev.freetoplaygameswiki.ui.screens.detail

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.sebasgrdev.freetoplaygameswiki.ui.screens.tools.TopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun ScreenDetail(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(Color.DarkGray, Color.Black),
                    start = Offset(0f, 0f),
                    end = Offset(1000f, 1000f)
                )
            )
    ) {
        TopBar("Details")
        LazyColumn {
            item { PosterDetail() }
            item { TitleDetail("TarisLand") }
            item { DetailsGame("2024-06-22", "MMORGP", "Windows", "Tencent", "Level Infinite") }
            item { TitleDetailsDivider("Description") }
            item {
                DescriptionGame("Tarisland is a free-to-play cross-platform MMORPG developed by Level Infinite and Published by Tencent. \\r\\n\\r\\nAvailable on PC and mobile devices, the game allows players to easily move between both, taking the game with them when they can’t be at their desk. The game is designed to appeal to players of MMOs like World of Warcraft, offering players nine playable classes and 18 specializations.\\r\\n\\r\\nEach class features an extensive talent tree system and can be customized. Players of existing MMOs will be familiar with the standard tank, DPS, and healer lineup, necessary for the game’s classic raid and dungeon system. Explore a vast game world and solve mysteries. Pick up various trades such as gathering, mining, and crafting, and sell your items on the auction house.")
            }
            item { TitleDetailsDivider("Screenshots") }
            item { ImagesScreenshots() }
            item { TitleDetailsDivider("Minimum System Requirements") }
            item {
                MinimunRequirements(
                    "Windows 10 64-bit",
                    "Intel Core i5-4590 or AMD FX-8350",
                    "8 GB",
                    "Nvidia GeForce GTX 960 or AMD Radeon R9 280",
                    "20 GB"
                )
            }
            item { TitleDetailsDivider("Related Games") }
            item { CardsRelatedGames() }

        }

    }

}





