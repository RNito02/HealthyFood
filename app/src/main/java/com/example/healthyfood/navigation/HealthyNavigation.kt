package com.example.healthyfood.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.healthyfood.screens.HealthySplashScreen
import com.example.healthyfood.screens.home.HealthyPersonalizadaScreen
import com.example.healthyfood.screens.home.Home
import com.example.healthyfood.screens.login.HealthyLoginScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HealthyNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = HealthyScreens.SplashScreen.name
    ){
        composable(HealthyScreens.SplashScreen.name){
            HealthySplashScreen(navController = navController)
        }
        composable(HealthyScreens.LoginScreen.name) {
            HealthyLoginScreen(navController = navController)
        }
        composable(HealthyScreens.HomeScreen.name){
            Home(navController = navController)
        }
        composable(HealthyScreens.PersonalizadaScreen.name){
            HealthyPersonalizadaScreen(navController = navController)
        }

    }
}