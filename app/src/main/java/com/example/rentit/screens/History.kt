package com.example.rentit.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.rentit.R
import java.time.LocalDate

@Composable
fun History(navHostController: NavHostController){
    val date = LocalDate.now()

    BackHandler {
        navHostController.navigate("home")
    }

    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)){
        Column(Modifier.fillMaxSize()) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .shadow(elevation = 7.dp)
                    .background(color = Color.White), contentAlignment = Alignment.BottomStart){
                Row(
                    Modifier
                        .padding(start = 20.dp, bottom = 20.dp)) {
                    Icon(imageVector = Icons.Filled.KeyboardArrowLeft, contentDescription = "", modifier = Modifier.size(30.dp).clickable { navHostController.navigate("home") })
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(text = "Order", color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
            }
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(20.dp)) {
                Box(
                    Modifier
                        .height(110.dp)
                        .fillMaxWidth()
                        .shadow(elevation = 7.dp, shape = RoundedCornerShape(20.dp))
                        .background(color = Color.Black, shape = RoundedCornerShape(20.dp))) {
                    Row(Modifier.padding(10.dp)) {
                        Box(
                            Modifier
                                .fillMaxHeight()
                                .width(120.dp)
                                .shadow(elevation = 5.dp, shape = RoundedCornerShape(20.dp))
                                .background(color = Color.White, shape = RoundedCornerShape(20.dp))){
                            Image(painter = painterResource(id = R.drawable.innova), contentDescription = "", contentScale = ContentScale.Fit, modifier = Modifier.fillMaxSize())
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Column(horizontalAlignment = Alignment.Start){
                            Spacer(modifier = Modifier.height(7.dp))
                            Text(text = "Innova", color = Color.White, fontWeight = FontWeight.Medium, fontSize = 15.sp)
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(text = "${6} seats", color = Color.White, fontWeight = FontWeight.Medium, fontSize = 12.sp)
                            Spacer(modifier = Modifier.height(5.dp))

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(imageVector = Icons.Outlined.LocationOn, contentDescription = "", modifier = Modifier.size(12.dp), tint = Color.Gray)
                                Spacer(modifier = Modifier.width(2.dp))
                                Text(text = "Makassar, Urip", color = Color.Gray, fontSize = 12.sp)
                            }
                        }

                    }
                    Row(
                        Modifier
                            .fillMaxSize()
                            .padding(top = 20.dp, end = 10.dp), horizontalArrangement = Arrangement.End) {
                        Text(text = "for 2 days", color = Color.White, fontWeight = FontWeight.Medium, fontSize = 12.sp)
                    }
                    Row(
                        Modifier
                            .fillMaxSize()
                            .padding(bottom = 20.dp, end = 10.dp), horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.Bottom) {
                        Text(text = "400.000/Day", color = Color.White, fontWeight = FontWeight.Medium, fontSize = 12.sp)
                    }
                }
            }
        }
    }
}