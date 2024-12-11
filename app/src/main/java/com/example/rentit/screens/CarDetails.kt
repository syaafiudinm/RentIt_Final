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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun CarDetails(navHostController: NavHostController) {
    val localDate = LocalDate.now()



    BackHandler {
        navHostController.navigate("carTypes")
    }

    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(130.dp)
                    .background(color = Color.White), contentAlignment = Alignment.BottomCenter
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(PaddingValues(start = 30.dp, end = 30.dp, bottom = 20.dp)),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        Modifier
                            .size(50.dp)
                            .border(
                                width = 1.dp,
                                shape = RoundedCornerShape(25.dp),
                                color = Color(0xFFededed),
                            ).clickable { navHostController.navigate("Home") }, contentAlignment = Alignment.Center
                    ) {
                        Icon(imageVector = Icons.Filled.KeyboardArrowLeft, contentDescription = "")
                    }
                    Text(
                        text = "Car Details",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Box(
                        Modifier
                            .size(50.dp)
                            .border(
                                width = 1.dp,
                                shape = RoundedCornerShape(25.dp),
                                color = Color(0xFFededed)
                            ), contentAlignment = Alignment.Center
                    ) {
                        Icon(imageVector = Icons.Default.MoreVert, contentDescription = "", tint = Color.Black)
                    }
                }
            }
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(color = Color.White)) {
                Image(painter = painterResource(id = R.drawable.innova), contentDescription = "", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Fit)
            }
        }
        Column(Modifier.align(Alignment.BottomCenter)) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                    )
                    .height(520.dp)) {
                Column(Modifier.padding(vertical = 30.dp, horizontal = 30.dp)) {
                    Text(text = "Innova", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "A car with high specs that are rented at an affordable price", color = Color.Gray,)
                    Spacer(modifier = Modifier.height(30.dp))
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "${localDate}", color = Color.Gray)
                        Text(text = "Choose Date", color = Color.Black, fontWeight = FontWeight.Bold)
                    }
                    Divider(thickness = 1.dp, color = Color.Gray, modifier = Modifier.fillMaxWidth())
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "Specification", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Box(
                            Modifier
                                .size(110.dp)
                                .background(
                                    color = Color(0XFFe5ebff),
                                    shape = RoundedCornerShape(20.dp)
                                ), contentAlignment = Alignment.Center) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(text = "Capacity", color = Color.Gray, fontWeight = FontWeight.Medium)
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(text = "6 Seats", color = Color.Black, fontWeight = FontWeight.Bold)
                            }
                        }
                        Box(
                            Modifier
                                .size(110.dp)
                                .background(
                                    color = Color(0XFFe5ebff),
                                    shape = RoundedCornerShape(20.dp)
                                ), contentAlignment = Alignment.Center) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(text = "Engine Out", color = Color.Gray, fontWeight = FontWeight.Medium)
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(text = "140 HP", color = Color.Black, fontWeight = FontWeight.Bold)
                            }
                        }
                        Box(
                            Modifier
                                .size(110.dp)
                                .background(
                                    color = Color(0XFFe5ebff),
                                    shape = RoundedCornerShape(20.dp)
                                ), contentAlignment = Alignment.Center) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(text = "Max Speed", color = Color.Gray, fontWeight = FontWeight.Medium)
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(text = "185km/h", color = Color.Black, fontWeight = FontWeight.Bold)
                            }
                        }
                    }

                }
                Column(Modifier.align(Alignment.BottomCenter)) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(180.dp)
                            .background(
                                color = Color(0XFF26272d),
                                shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)
                            )) {
                        Row(
                            Modifier
                                .padding()
                                .fillMaxWidth()
                                .padding(horizontal = 30.dp, vertical = 25.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(text = "Rental Price", color = Color(0XFF9c9d9c), fontWeight = FontWeight.Medium, fontSize = 16.sp)
                            Text(text = "500.000/day", color = Color.White, fontWeight = FontWeight.Medium, fontSize = 16.sp)
                        }
                    Column(Modifier.align(Alignment.BottomCenter)) {
                        Box(
                            Modifier
                                .fillMaxWidth()
                                .height(120.dp)
                                .background(
                                    color = Color.White,
                                    shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)
                                ),  contentAlignment = Alignment.Center) {
                            Box(
                                Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 30.dp)
                                    .height(70.dp)
                                    .clickable {
                                        navHostController.navigate("order")
                                    }
                                    .background(
                                        color = Color(0XFF194af9),
                                        shape = RoundedCornerShape(40.dp)
                                    ), contentAlignment = Alignment.Center) {
                                Text(text = "Book car", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                            }
                        }
                    }
                    }
                }
            }
        }
    }
}