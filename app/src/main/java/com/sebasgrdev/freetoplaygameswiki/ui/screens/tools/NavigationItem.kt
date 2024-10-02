package com.sebasgrdev.freetoplaygameswiki.ui.screens.tools

import android.graphics.drawable.Drawable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.sebasgrdev.freetoplaygameswiki.R
import com.sebasgrdev.freetoplaygameswiki.ui.navigation.GameCategory
import okhttp3.internal.wait

@Composable
fun NavigationItem(
    title: String,
    category: GameCategory,
    navController: NavHostController,
) {
    NavigationDrawerItem(
        icon = { Icon(painter = painterResource(R.drawable.ic_videogame) , contentDescription = null) },
        label = { Text(text = title, color = Color.White) },
        selected = false,
        onClick = { navController.navigate("category_games/${category.route}") },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
        colors = NavigationDrawerItemDefaults.colors( selectedContainerColor = Color.DarkGray)
    )
}
