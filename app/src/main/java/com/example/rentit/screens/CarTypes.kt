package com.example.rentit.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.rentit.R

@Composable
fun CarTypes(navHostController: NavHostController){

    BackHandler {
        navHostController.navigate("home")
    }

    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)) {
        Column {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .shadow(elevation = 7.dp)
                    .background(color = Color.White), contentAlignment = Alignment.BottomStart) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(PaddingValues(start = 30.dp, bottom = 15.dp)), verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        Modifier
                            .size(50.dp)
                            .border(
                                width = 1.dp,
                                shape = RoundedCornerShape(25.dp),
                                color = Color(0xFFededed),
                            ).clickable { navHostController.navigate("home") }, contentAlignment = Alignment.Center
                    ) {
                        Icon(imageVector = Icons.Filled.KeyboardArrowLeft, contentDescription = "")
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(text = "Toyota", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                }
            }
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.padding(30.dp),
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    CarBox(name = "Innova", address = "Urip, Makassar", price = "400.000", seats = 6, image = R.drawable.innova, onClicked = { navHostController.navigate("carDetails") })
                }
                item {
                    CarBox(name = "Rush", address = "Urip, Makassar", price = "300.000", seats = 6, image = R.drawable.innova, onClicked = { })
                }
                item {
                    CarBox(name = "Fortuner", address = "Urip, Makassar", price = "500.000", seats = 7, image = R.drawable.innova, onClicked = { })
                }
                item {
                    CarBox(name = "Avanza", address = "Urip, Makassar", price = "250.000", seats = 7, image = R.drawable.innova, onClicked = { })
                }
                item {
                    CarBox(name = "Camry", address = "Urip, Makassar", price = "600.000", seats = 5, image = R.drawable.innova, onClicked = { })
                }
                item {
                    CarBox(name = "Camry", address = "Urip, Makassar", price = "600.000", seats = 5, image = R.drawable.innova, onClicked = { })
                }
                item {
                    CarBox(name = "Camry", address = "Urip, Makassar", price = "600.000", seats = 5, image = R.drawable.innova, onClicked = { })
                }
            }
        }
    }
}