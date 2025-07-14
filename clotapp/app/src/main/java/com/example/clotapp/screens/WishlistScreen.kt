package com.example.clotapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun WishlistScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        IconButton(onClick = { navController.popBackStack() }) {
            Icon(Icons.Default.ArrowBack, contentDescription = "Back")
        }

        Text("Wishlist", style = MaterialTheme.typography.titleLarge)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable { navController.navigate("wishlist_detail") }
        ) {
            ListItem(
                headlineContent = { Text("My Favorite") },
                supportingContent = { Text("12 Products") }
            )
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            ListItem(
                headlineContent = { Text("T-Shirts") },
                supportingContent = { Text("4 Products") }
            )
        }
    }
}
