package com.project.fairm.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.project.fairm.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WelcomeScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()) {
        LogoCard()
        TextChat()
    }
}

@Composable
fun LogoCard() {
    Box(modifier = Modifier
        .background(Color.White)
        .shadow(3.dp, shape = RoundedCornerShape(12.dp))) {

        Image(painter = painterResource(id =R.drawable.logo), contentDescription ="Fairm Logo",
            modifier = Modifier
                .padding(12.dp)
                .size(width = 68.dp, height = 68.dp))
    }
}

@Composable
fun TextChat() {
    Box(modifier = Modifier
        .padding(12.dp)
        .shadow(2.dp, shape = RoundedCornerShape(12.dp), spotColor = Color.Black)
        .background(Color(0xFF42615E)))
    {
        Text(text = "You can start planting seed starting now and will\n" +
                "get the result on 5 months!",
            color = Color.White,
            modifier = Modifier.padding(12.dp))
    }
}