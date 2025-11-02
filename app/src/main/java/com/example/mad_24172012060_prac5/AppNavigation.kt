package com.example.mad_24172012060_prac5

import LoginScreen
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import screen.RegisterUI

@Composable
fun AppNavigation(context: Context) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            LoginScreen(context, navController)
        }
        composable("register") {
            RegisterUI(navController)
        }
    }
}
