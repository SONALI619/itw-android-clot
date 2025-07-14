package com.example.clotapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun PaymentScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        IconButton(onClick = { navController.popBackStack() }) {
            Icon(Icons.Default.ArrowBack, contentDescription = "Back")
        }

        Text("Payment", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(8.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp)
        ) {
            ListItem(
                headlineContent = { Text("**** 4187") },
                trailingContent = {
                    Icon(Icons.Default.ArrowForward, contentDescription = null)
                }
            )
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp)
        ) {
            ListItem(
                headlineContent = { Text("**** 9387") },
                trailingContent = {
                    Icon(Icons.Default.ArrowForward, contentDescription = null)
                }
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text("Paypal: Cloth@gmail.com")

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate("add_card") }) {
            Text("Add Card")
        }
    }
}
