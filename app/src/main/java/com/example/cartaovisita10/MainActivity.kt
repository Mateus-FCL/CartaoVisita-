package com.example.cartaovisita10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.cartaovisita10.ui.theme.CartaoVisita10Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoVisita10Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CartaoVisita(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                            .background(Color(0xFF2E3B4E))
                    )
                }
            }
        }
    }
}

@Composable
fun CartaoVisita(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.perfil),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .border(4.dp, Color.White, CircleShape)
                .background(Color.Gray),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Mateus Falcão",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Text(
            text = "Estudante",
            fontSize = 18.sp,
            color = Color.LightGray
        )

        Text(
            text = "UNICAP",
            fontSize = 18.sp,
            color = Color.LightGray
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun CartaoVisitaPreview() {
    CartaoVisita10Theme {
        CartaoVisita(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF2E3B4E))
        )
    }
}
