package com.sebasgrdev.freetoplaygameswiki.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.sebasgrdev.freetoplaygameswiki.R
import com.sebasgrdev.freetoplaygameswiki.ui.navigation.GameCategory
import com.sebasgrdev.freetoplaygameswiki.ui.screens.tools.MenuIcon
import com.sebasgrdev.freetoplaygameswiki.ui.screens.tools.NavigationItem
import com.sebasgrdev.freetoplaygameswiki.ui.screens.tools.SearchGame
import com.sebasgrdev.freetoplaygameswiki.viewmodel.GamesViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenMain(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    viewModel: GamesViewModel = hiltViewModel()
) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(drawerContainerColor = Color.Black) {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.linearGradient(
                            colors = listOf(Color.DarkGray, Color.Black),
                            start = Offset(0f, 0f),
                            end = Offset(1000f, 1000f)
                        )
                    )) {
                    NavigationDrawerItem(
                        selected = false,
                        onClick = { scope.launch { drawerState.close() } },
                        label = {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "CATEGORY",
                                    color = Color.White,
                                    fontSize = 24.sp
                                )
                                HorizontalDivider(
                                    Modifier.height(2.dp),
                                    color = Color.LightGray
                                )
                            }
                        },
                        modifier = Modifier.padding(PaddingValues(dimensionResource(R.dimen.padding_large)))
                    )
                }
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.linearGradient(
                                colors = listOf(Color.DarkGray, Color.Black),
                                start = Offset(0f, 0f),
                                end = Offset(1000f, 1000f)
                            )
                        )
                ) {
                    item { NavigationItem("MMORPG", GameCategory.Mmorpg, navController) }
                    item { NavigationItem("Shooter", GameCategory.Shooter, navController) }
                    item { NavigationItem("Strategy", GameCategory.Strategy, navController) }
                    item { NavigationItem("MOBA", GameCategory.Moba, navController) }
                    item { NavigationItem("Racing", GameCategory.Racing, navController) }
                    item { NavigationItem("Sports", GameCategory.Sports, navController) }
                    item { NavigationItem("Social", GameCategory.Social, navController) }
                    item { NavigationItem("Sandbox", GameCategory.Sandbox, navController) }
                    item { NavigationItem("Open World", GameCategory.OpenWorld, navController) }
                    item { NavigationItem("Survival", GameCategory.Survival, navController) }
                    item { NavigationItem("Horror", GameCategory.Horror, navController) }
                    item { NavigationItem("PvP", GameCategory.Pvp, navController) }
                    item { NavigationItem("PvE", GameCategory.Pve, navController) }
                    item { NavigationItem("Pixel", GameCategory.Pixel, navController) }
                    item { NavigationItem("Voxel", GameCategory.Voxel, navController) }
                    item { NavigationItem("Zombie", GameCategory.Zombie, navController) }
                    item { NavigationItem("Low Spec", GameCategory.LowSpec, navController) }
                    item { NavigationItem("Turn-Based", GameCategory.TurnBased, navController) }
                    item { NavigationItem("First-Person", GameCategory.FirstPerson, navController) }
                    item { NavigationItem("Third-Person", GameCategory.ThirdPerson, navController) }
                    item { NavigationItem("Top-Down", GameCategory.TopDown, navController) }
                    item { NavigationItem("Tank", GameCategory.Tank, navController) }
                    item { NavigationItem("Space", GameCategory.Space, navController) }
                    item { NavigationItem("Sailing", GameCategory.Sailing, navController) }
                    item {
                        NavigationItem(
                            "Side-Scroller",
                            GameCategory.SideScroller,
                            navController
                        )
                    }
                    item { NavigationItem("Superhero", GameCategory.Superhero, navController) }
                    item { NavigationItem("Permadeath", GameCategory.Permadeath, navController) }
                    item { NavigationItem("Card", GameCategory.Card, navController) }
                    item {
                        NavigationItem(
                            "Battle Royale",
                            GameCategory.BattleRoyale,
                            navController
                        )
                    }
                    item { NavigationItem("MMO", GameCategory.Mmo, navController) }
                    item { NavigationItem("MMOFPS", GameCategory.Mmofps, navController) }
                    item { NavigationItem("MMOTPS", GameCategory.Mmotps, navController) }
                    item { NavigationItem("3D", GameCategory.ThreeD, navController) }
                    item { NavigationItem("2D", GameCategory.TwoD, navController) }
                    item { NavigationItem("Anime", GameCategory.Anime, navController) }
                    item { NavigationItem("Fantasy", GameCategory.Fantasy, navController) }
                    item { NavigationItem("Sci-Fi", GameCategory.SciFi, navController) }
                    item { NavigationItem("Fighting", GameCategory.Fighting, navController) }
                    item { NavigationItem("Action RPG", GameCategory.ActionRpg, navController) }
                    item { NavigationItem("Action", GameCategory.Action, navController) }
                    item { NavigationItem("Military", GameCategory.Military, navController) }
                    item { NavigationItem("Martial Arts", GameCategory.MartialArts, navController) }
                    item { NavigationItem("Flight", GameCategory.Flight, navController) }
                    item {
                        NavigationItem(
                            "Tower Defense",
                            GameCategory.TowerDefense,
                            navController
                        )
                    }
                    item { NavigationItem("MMORTS", GameCategory.Mmorts, navController) }
                }
            }
        },
        modifier = Modifier.background(Color.Black)
    ) {
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
            Row(verticalAlignment = Alignment.CenterVertically) {
                TopAppBar(
                    title = {
                        Text(
                            text = "Free to play Games Wiki",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                            textAlign = TextAlign.Center
                        )
                    },
                    navigationIcon = { MenuIcon(scope, drawerState) },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.Transparent,
                        titleContentColor = Color.White
                    )
                )
            }

            LazyColumn {
                item { TitleCategory("Popular Games", GameCategory.Popular, navController) }
                item { CardsPopularGames(viewModel, navController) }
                item { TitleCategory("All Games", GameCategory.All, navController) }
                item { CardAllGames(viewModel, navController) }
                item { TitleCategory("Release Date", GameCategory.Release, navController) }
                item { CardReleaseGames(viewModel, navController) }
                item { TitleCategory("Pc Games", GameCategory.Pc, navController) }
                item { CardPcGames(viewModel, navController) }
                item { TitleCategory("Browser Games", GameCategory.Browser, navController) }
                item { CardBrowserGames(viewModel, navController) }
            }
        }
    }
}
