package com.example.rentit.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun profile(navHostController: NavHostController){

    BackHandler {
        navHostController.navigate("home")
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)){
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
                        .padding(start = 20.dp, bottom = 20.dp), verticalAlignment = Alignment.CenterVertically) {
                    Icon(imageVector = Icons.Filled.KeyboardArrowLeft, contentDescription = "", modifier = Modifier.size(30.dp).clickable { navHostController.navigate("home") })
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(text = "Profile", fontWeight = FontWeight.Bold, fontSize = 22.sp)
                }
            }
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(20.dp)) {
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                    Box(modifier = Modifier
                        .size(150.dp)
                        .background(color = Color.Black, shape = RoundedCornerShape(75.dp)), contentAlignment = Alignment.Center){
                        Box(modifier = Modifier
                            .size(130.dp)
                            .clip(shape = RoundedCornerShape(75.dp))
                            .background(color = Color.White, shape = RoundedCornerShape(75.dp)), contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.profile), contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
                        }
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Text(text = "Name", color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 10.dp))
                Spacer(modifier = Modifier.height(7.dp))
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .border(width = 2.dp, shape = RoundedCornerShape(20.dp), color = Color.Black), contentAlignment = Alignment.CenterStart){
                    Text(text = "Andi Syafiudin", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.Medium, modifier = Modifier.padding(start = 15.dp))

                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Email", color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 10.dp))
                Spacer(modifier = Modifier.height(7.dp))
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .border(width = 2.dp, shape = RoundedCornerShape(20.dp), color = Color.Black), contentAlignment = Alignment.CenterStart){
                    Text(text = "andisyafiudin@example.com", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.Medium, modifier = Modifier.padding(start = 15.dp))

                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Phone Number", color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 10.dp))
                Spacer(modifier = Modifier.height(7.dp))
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .border(width = 2.dp, shape = RoundedCornerShape(20.dp), color = Color.Black), contentAlignment = Alignment.CenterStart){
                    Text(text = "08211119281", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.Medium, modifier = Modifier.padding(start = 15.dp))

                }
            }
        }
    }
}