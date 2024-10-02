package com.sebasgrdev.freetoplaygameswiki.ui.screens.tools

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp

@Composable
fun SearchGame(onSearch: (String) -> Unit) {
    var searchQuery by remember { mutableStateOf("") }
    TextField(
        value = searchQuery,
        onValueChange = { searchQuery = it },
        shape = RoundedCornerShape(24.dp),
        placeholder = { Text(text = "Search game") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search icon"
            )
        },
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Search
        ),
        keyboardActions = KeyboardActions(
            onSearch = {
                onSearch(searchQuery)
            }
        ),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            disabledContainerColor = Color.LightGray,
            focusedIndicatorColor = Color.Transparent
        )
    )
}