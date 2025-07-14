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
fun AddressScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        IconButton(onClick = { navController.popBackStack() }) {
            Icon(Icons.Default.ArrowBack, contentDescription = "Back")
        }

        Text("Address", style = MaterialTheme.typography.titleLarge)

        repeat(2) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Row(Modifier.padding(16.dp)) {
                    Text("2715 Ash Dr. San Jose, South...", Modifier.weight(1f))
                    Text("Edit", color = MaterialTheme.colorScheme.primary)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("add_address") }) {
            Text("Add New Address")
        }
    }
}
