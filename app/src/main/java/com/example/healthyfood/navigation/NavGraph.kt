package com.example.healthyfood.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.healthyfood.screens.home.AddScreen
//import edu.itsco.mytasks.ui.screens.AddScreen
import com.example.healthyfood.screens.home.HomeScreen
//import edu.itsco.mytasks.ui.screens.HomeScreen
import com.example.healthyfood.screens.home.TaskViewModel
//import edu.itsco.mytasks.ui.screens.TaskViewModel

@ExperimentalMaterial3Api
@Composable
fun SetupNavGraph(
    navHost: NavHostController,
    viewModel: TaskViewModel
){
    NavHost(
        navController = navHost,
        startDestination = Screens.HomeScreen.url
    ){
        composable(
            route = Screens.HomeScreen.url
        ){
            HomeScreen(navHost = navHost,
                viewModel = viewModel)
        }
        composable(
            route = Screens.AddTaskScreen.url
        ){
            AddScreen(
                navHost = navHost,
                viewModel = viewModel
            )
        }
    }
}