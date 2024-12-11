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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.rentit.R

@Composable
fun intro(navHostController: NavHostController){
//    var isIntro by remember {
//        mutableStateOf(true)
//    }
//
//    BackHandler {
//        if(isIntro == false){
//            isIntro = true
//        }
//    }

    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)) {
        Box(
            Modifier
                .fillMaxWidth()
                .height(500.dp)
                .background(color = Color.Green)) {
            Image(painter = painterResource(id = R.drawable.bg), contentDescription = "", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        }
        Box(
            Modifier
                .fillMaxWidth()
                .height(450.dp)
                .align(Alignment.BottomCenter)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                )) {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(Modifier.padding(vertical = 40.dp,  horizontal = 30.dp)) {
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                    Text(text = "Rent a Vehicle", fontWeight = FontWeight.W900, fontSize = 30.sp, color = Color.Black)
                    Spacer(modifier = Modifier.height(7.dp))
                }
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Text(text = "Easily Only Here!", fontWeight = FontWeight.W900, fontSize = 30.sp, color = Color.Black)
            }
                Spacer(modifier = Modifier.height(20.dp))
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                    Text(text = "We are the solution for those who are looking for a car rental too travel anywhere and anythime", color = Color.Gray, fontSize = 16.sp, textAlign = TextAlign.Center)
        }
                Spacer(modifier = Modifier.height(30.dp))
                    Column {
                        Box(
                            Modifier
                                .fillMaxWidth()
                                .height(60.dp)
                                .clickable { navHostController.navigate("Home") }
                                .background(
                                    color = Color(0XFF194af9),
                                    shape = RoundedCornerShape(40.dp)
                                ), contentAlignment = Alignment.Center) {
                            Text(text = "Get Started", color = Color.White, fontWeight = FontWeight.W900, fontSize = 20.sp)
                        }
//                        Box(
//                            Modifier
//                                .fillMaxWidth()
//                                .height(60.dp)
//                                .clickable {
//                                }, contentAlignment = Alignment.Center) {
//                            Text(text = "Skip", color = Color.Black, fontWeight = FontWeight.Medium, fontSize = 18.sp)
//                        }
                    }
//                } else {
//                    Box(
//                        Modifier
//                            .fillMaxWidth()
//                            .height(75.dp)
//                            .clickable {
//                                navHostController.navigate("home")
//                            }
//                            .background(
//                                color = Color(0XFFdb4a39),
//                                shape = RoundedCornerShape(40.dp)
//                            ), contentAlignment = Alignment.CenterStart) {
//                        Row(
//                            Modifier
//                                .fillMaxWidth()
//                                .padding(start = 10.dp), verticalAlignment = Alignment.CenterVertically,) {
//                            Box(
//                                Modifier
//                                    .size(50.dp)
//                                    .background(
//                                        color = Color.White,
//                                        shape = RoundedCornerShape(25.dp)
//                                    )
//                                    .clickable { navHostController.navigate("home") }
//                                    .clip(shape = RoundedCornerShape(25.dp)), contentAlignment = Alignment.Center) {
//                                Image(painter = painterResource(id = R.drawable.google), contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier.size(35.dp
//                                ))
//                            }
//                            Spacer(Modifier.width(10.dp))
//                            Text(text = "Continue With Google", color = Color.White, fontWeight = FontWeight.W900, fontSize = 20.sp)
//                        }
//                    }
    }
}}}}