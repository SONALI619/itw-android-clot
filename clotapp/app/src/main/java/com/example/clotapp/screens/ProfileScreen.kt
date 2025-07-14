package com.example.clotapp.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ProfileScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            imageVector = Icons.Filled.Person,
            contentDescription = "Profile Icon",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            tint = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text("Gilbert Jones", fontWeight = FontWeight.Bold)
        Text("Gilbertjones001@gmail.com", color = Color.Gray)
        Text("121-224-7890", color = Color.Gray)

        Spacer(modifier = Modifier.height(20.dp))

        listOf(
            "Address" to "address",
            "Wishlist" to "wishlist",
            "Payment" to "payment",
            "Help" to "",
            "Support" to ""
        ).forEach { (label, route) ->
            Card(
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp)
                    .clickable(enabled = route.isNotEmpty()) {
                        navController.navigate(route)
                    }
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = label, modifier = Modifier.weight(1f))
                    Icon(Icons.Default.ArrowForward, contentDescription = null)
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
        Text("Sign Out", color = Color.Red)
    }
}
