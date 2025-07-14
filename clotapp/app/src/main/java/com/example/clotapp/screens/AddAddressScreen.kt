package com.example.clotapp.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AddAddressScreen(navController: NavController) {
    var street by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var state by remember { mutableStateOf("") }
    var zip by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        IconButton(onClick = { navController.popBackStack() }) {
            Icon(Icons.Default.ArrowBack, contentDescription = "Back")
        }

        Text("Add Address", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(value = street, onValueChange = { street = it }, label = { Text("Street Address") })
        OutlinedTextField(value = city, onValueChange = { city = it }, label = { Text("City") })
        OutlinedTextField(value = state, onValueChange = { state = it }, label = { Text("State") })
        OutlinedTextField(value = zip, onValueChange = { zip = it }, label = { Text("Zip Code") })

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Save")
        }
    }
}
