package com.example.rentit.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rentit.screens.CarDetails
import com.example.rentit.screens.CarTypes
import com.example.rentit.screens.History
import com.example.rentit.screens.Home
import com.example.rentit.screens.LoginScreen
import com.example.rentit.screens.RegisterScreen
import com.example.rentit.screens.intro
import com.example.rentit.screens.profile

@Composable
fun Navigation(){
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = "register"){
        composable("intro") { intro(navHostController = navController) }
        composable("home") { Home(navHostController = navController) }
        composable("carTypes") { CarTypes(navHostController = navController) }
        composable("carDetails") { CarDetails(navHostController = navController) }
        composable("profile") { profile(navHostController = navController) }
        composable("order") { History(navHostController = navController) }
        composable("register") { RegisterScreen(navHostController = navController,
            onRegisterSuccess = {
                navController.navigate("login")
            }
        )
        }
        composable("login") {
            LoginScreen(navHostController = navController,
                onLoginSuccess = {
                    navController.navigate("home")
                }
            )
        }
    }
}