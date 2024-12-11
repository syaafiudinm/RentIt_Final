package com.example.rentit.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.rentit.R

@Composable
fun Home(navHostController: NavHostController) {

    BackHandler {

    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
        (
                Modifier
                    .fillMaxSize()
                    .background(color = Color(0XFFf8f8f8))).padding(vertical = 60.dp, horizontal = 30.dp)) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Column {
                    Text(text = "Location", color = Color.Gray, fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(1.dp))
                    Text(text = "Pettarani, Makassar", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
                Row() {
                    Box(
                        Modifier
                            .size(50.dp)
                            .background(
                                color = Color(0XFFf8f8f8),
                                shape = RoundedCornerShape(35.dp)
                            )
                            .border(
                                width = 2.dp,
                                color = Color(0XFFdfdfdf),
                                shape = RoundedCornerShape(35.dp)
                            ), contentAlignment = Alignment.Center) {
                        Icon(imageVector = Icons.Filled.Menu, contentDescription = "", tint = Color.Black, modifier = Modifier
                            .size(25.dp)
                            .clickable { navHostController.navigate("order") })
                    }
                    Spacer(modifier = Modifier.width(7.dp))
                    Box(
                        Modifier
                            .size(50.dp)
                            .clickable { navHostController.navigate("profile") }
                            .clip(shape = RoundedCornerShape(35.dp))
                            .background(color = Color.Green, shape = RoundedCornerShape(35.dp))) {
                        Image(painter = painterResource(id = R.drawable.profile), contentDescription = "", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                    }
                }
            }
            Spacer(modifier = Modifier.height(50.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Box(
                    Modifier
                        .weight(1f)
                        .height(50.dp)
                        .shadow(elevation = 3.dp, shape = RoundedCornerShape(30.dp))
                        .background(color = Color.White, shape = RoundedCornerShape(30.dp))) {

                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 5.dp, 8.dp)) {
                        Icon(imageVector = Icons.Filled.Search, contentDescription = "", tint = Color.Gray, modifier = Modifier.size(45.dp))
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(text = "")
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
            }
            Spacer(modifier = Modifier.height(30.dp))
            Row {
                carBrand(brand = "Toyota", logo = R.drawable.toyoa, onClicked = { navHostController.navigate("carTypes") })
                Spacer(modifier = Modifier.width(20.dp))
                carBrand(brand = "Daihatsu", logo = R.drawable.daihatsu, onClicked = { navHostController.navigate("carTypes") })
                Spacer(modifier = Modifier.width(20.dp))
                carBrand(brand = "Honda", logo = R.drawable.honda, onClicked = { navHostController.navigate("carTypes") })
            }
            Row(Modifier.fillMaxWidth()) {
                Box(
                    Modifier
                        .width(120.dp)
                        .height(120.dp), contentAlignment = Alignment.TopCenter) {

                }
            }
    }

        Box(
            Modifier
                .height(540.dp)
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                ), contentAlignment = Alignment.TopCenter) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp, vertical = 20.dp)) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Best Cars", color = Color.Black, fontWeight = FontWeight.Medium, fontSize = 20.sp)
                Text(text = "View All", color = Color.Gray, fontSize = 16.sp)
            }
                Spacer(modifier = Modifier.height(20.dp))
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                Box(
                    Modifier
                        .width(165.dp).shadow(elevation = 5.dp, shape = RoundedCornerShape(20.dp))
                        .clip(shape = RoundedCornerShape(20.dp))
                        .clickable { navHostController.navigate("carDetails") }.shadow(elevation = 5.dp, shape = RoundedCornerShape(20.dp))
                        .background(color = Color.White, shape = RoundedCornerShape(20.dp))) {
                    Column {
                        Box(
                            Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                                .background(color = Color.Gray, shape = RoundedCornerShape(20.dp))) {
                            Image(painter = painterResource(id = R.drawable.innova), contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
                        }
                        Column(Modifier.padding(10.dp)) {
                            Text(text = "Innova", fontWeight = FontWeight.Medium, fontSize = 16.sp)
                            Spacer(modifier = Modifier.height(2.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(imageVector = Icons.Outlined.LocationOn, contentDescription = "", modifier = Modifier.size(12.dp), tint = Color.Gray)
                                Spacer(modifier = Modifier.width(2.dp))
                                Text(text = "Alauddin, Makassar", color = Color.Gray, fontSize = 12.sp)
                            }
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(text = "6 seats", color = Color.Black, fontWeight = FontWeight.Medium, fontSize = 12.sp)
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(text = "400.000/Day", color = Color.Black, fontWeight = FontWeight.Medium, fontSize = 12.sp, modifier = Modifier.padding(bottom = 5.dp))
                        }
                    }
                }
                Box(
                    Modifier
                        .width(165.dp).shadow(elevation = 5.dp, shape = RoundedCornerShape(20.dp)).shadow(elevation = 5.dp, shape = RoundedCornerShape(20.dp))
                        .clip(shape = RoundedCornerShape(20.dp))
                        .background(color = Color.White, shape = RoundedCornerShape(20.dp))) {
                    Column {
                        Box(
                            Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                                .clickable { navHostController.navigate("carDetails") }
                                .background(color = Color.Gray, shape = RoundedCornerShape(20.dp))) {
                            Image(painter = painterResource(id = R.drawable.fortuner), contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
                        }
                        Column(Modifier.padding(10.dp)) {
                            Text(text = "Fortuner", fontWeight = FontWeight.Medium, fontSize = 16.sp)
                            Spacer(modifier = Modifier.height(2.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(imageVector = Icons.Outlined.LocationOn, contentDescription = "", modifier = Modifier.size(12.dp), tint = Color.Gray)
                                Spacer(modifier = Modifier.width(2.dp))
                                Text(text = "Alauddin, Makassar", color = Color.Gray, fontSize = 12.sp)
                            }
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(text = "6 seats", color = Color.Black, fontWeight = FontWeight.Medium, fontSize = 12.sp)
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(text = "500.000/Day", color = Color.Black, fontWeight = FontWeight.Medium, fontSize = 12.sp, modifier = Modifier.padding(bottom = 5.dp))
                        }
                    }
                }
            }
                Spacer(modifier = Modifier.height(15.dp))
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                    //CarBox(name = "Innova", address = "Urip, Makassar", price = "400.000", seats = 6 )
                }
}}
        }}

//Column(
//            Modifier
//                .padding(PaddingValues(start = 30.dp, end = 30.dp, bottom = 40.dp))
//                .align(Alignment.BottomCenter)) {
//
//
//Box(
//    Modifier
//        .fillMaxWidth()
//        .height(70.dp)
//        .background(color = Color(0XFF26272d), shape = RoundedCornerShape(40.dp)), contentAlignment = Alignment.Center
//) {
//    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly) {
//        Icon(imageVector = Icons.Outlined.Home, contentDescription = "", tint = Color.White, modifier = Modifier.size(30.dp))
//        Icon(imageVector = Icons.Outlined.List, contentDescription = "", tint = Color.White, modifier = Modifier.size(30.dp))
//        Icon(imageVector = Icons.Outlined.Person, contentDescription = "", tint = Color.White, modifier = Modifier.size(30.dp))
//    }
//}
//    }

@Composable
fun CarBox(name: String, address: String, price: String, seats: Int, image: Int, onClicked: () -> Unit){
    Box(
        Modifier
            .width(165.dp).shadow(elevation = 5.dp, shape = RoundedCornerShape(20.dp))
            .clip(shape = RoundedCornerShape(20.dp))
            .clickable { onClicked() }
            .background(color = Color.White, shape = RoundedCornerShape(20.dp))) {
        Column {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(color = Color.Gray)) {
                Image(painter = painterResource(id = image), contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
            }
            Column(Modifier.padding(10.dp)) {
                Text(text = name, fontWeight = FontWeight.Medium, fontSize = 16.sp)
                Spacer(modifier = Modifier.height(2.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(imageVector = Icons.Outlined.LocationOn, contentDescription = "", modifier = Modifier.size(12.dp), tint = Color.Gray)
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(text = address, color = Color.Gray, fontSize = 12.sp)
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "${seats} seats", color = Color.Black, fontWeight = FontWeight.Medium, fontSize = 12.sp)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "${price}/Day", color = Color.Black, fontWeight = FontWeight.Medium, fontSize = 12.sp, modifier = Modifier.padding(bottom = 5.dp))
            }
        }
    }
}

@Composable
fun carBrand(brand: String, logo: Int, onClicked: ()-> Unit){
    Column(horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            Modifier
                .size(80.dp)
                .clip(shape = RoundedCornerShape(40.dp))
                .background(color = Color.Black, shape = RoundedCornerShape(40.dp))
                .clickable { onClicked() }, contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = logo), contentDescription = "", contentScale = ContentScale.Fit, modifier = Modifier.fillMaxSize())
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = brand, color = Color.Gray, fontWeight = FontWeight.Bold)
    }
}