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
fun AddCardScreen(navController: NavController) {
    var cardNumber by remember { mutableStateOf("") }
    var ccv by remember { mutableStateOf("") }
    var exp by remember { mutableStateOf("") }
    var cardHolder by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        IconButton(onClick = { navController.popBackStack() }) {
            Icon(Icons.Default.ArrowBack, contentDescription = "Back")
        }

        Text("Add Card", style = MaterialTheme.typography.titleLarge)

        OutlinedTextField(
            value = cardNumber,
            onValueChange = { cardNumber = it },
            label = { Text("Card Number") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row {
            OutlinedTextField(
                value = ccv,
                onValueChange = { ccv = it },
                label = { Text("CCV") },
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(8.dp))
            OutlinedTextField(
                value = exp,
                onValueChange = { exp = it },
                label = { Text("Exp") },
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = cardHolder,
            onValueChange = { cardHolder = it },
            label = { Text("Cardholder Name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.popBackStack() }, modifier = Modifier.fillMaxWidth()) {
            Text("Save")
        }
    }
}
