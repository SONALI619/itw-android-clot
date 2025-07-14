package com.example.clotapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.clotapp.screens.*

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "profile") {
        composable("profile") { ProfileScreen(navController) }
        composable("address") { AddressScreen(navController) }
        composable("add_address") { AddAddressScreen(navController) }
        composable("payment") { PaymentScreen(navController) }
        composable("add_card") { AddCardScreen(navController) }
        composable("wishlist") { WishlistScreen(navController) }
        composable("wishlist_detail") { WishlistDetailScreen(navController) }
    }
}
