package com.example.healthyfood.navigation

sealed class Screens(
    val url: String) {
    object HomeScreen:
            Screens(url = "home")
    object AddTaskScreen:
            Screens(url = "add_task")
}