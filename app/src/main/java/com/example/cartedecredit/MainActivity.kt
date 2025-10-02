package com.example.cartedecredit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cartevisite()
        }
    }
}


val GreenMain = Color(0xFF3DDC84)

@Composable
fun cartevisite() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {
            HeaderSection()
            Spacer(modifier = Modifier.height(32.dp))
            ContactSection()
        }
    }
}

@Composable
fun HeaderSection() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Logo Android",
            modifier = Modifier
                .size(100.dp)
                .padding(bottom = 16.dp)
        )

        Text(
            text = "ADEKPATE JEAN ARIEL",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = GreenMain
        )

        Text(
            text = "infographe ",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Gray
        )
    }
}

@Composable
fun ContactSection() {
    Column(horizontalAlignment = Alignment.Start) {
        ContactRow(
            icon = Icons.Default.Phone,
            contactText = "+225 0141459149"
        )
        Spacer(modifier = Modifier.height(8.dp))

        ContactRow(
            icon = Icons.Default.Email,
            contactText = "arielade1105@gmail.com"
        )
        Spacer(modifier = Modifier.height(8.dp))

        ContactRow(
            icon = Icons.Default.LocationOn,
            contactText = "Yopougon, Côte d’Ivoire"
        )
    }
}

@Composable
fun ContactRow(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    contactText: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(4.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = GreenMain,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = contactText,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun cartevisitePreview() {
    cartevisite()
}
