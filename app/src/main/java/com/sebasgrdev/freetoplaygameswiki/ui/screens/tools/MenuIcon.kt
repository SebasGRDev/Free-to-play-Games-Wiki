package com.sebasgrdev.freetoplaygameswiki.ui.screens.tools

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun MenuIcon(scope: CoroutineScope, drawerState: DrawerState) {
    IconButton(onClick = { scope.launch { drawerState.open() } }, modifier = Modifier.padding(start = 16.dp)) {
        Icon(imageVector = Icons.Filled.Menu, contentDescription = "", tint = Color.White, modifier = Modifier.size(48.dp))
    }
}