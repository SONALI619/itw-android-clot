package com.example.clotapp.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun WishlistDetailScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        IconButton(onClick = { navController.popBackStack() }) {
            Icon(Icons.Default.ArrowBack, contentDescription = "Back")
        }

        Text("My Favourites (12)", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(8.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(8.dp),
            modifier = Modifier.fillMaxHeight()
        ) {
            items(4) {
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .fillMaxWidth()
                                .background(Color.LightGray)
                        )
                        Text("Men's T-Shirt", modifier = Modifier.padding(8.dp), style = MaterialTheme.typography.bodyMedium)
                        Text("$45.00", color = Color.Gray, modifier = Modifier.padding(bottom = 8.dp))
                    }
                }
            }
        }
    }
}
