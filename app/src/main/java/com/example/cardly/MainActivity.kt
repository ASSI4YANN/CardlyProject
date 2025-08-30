package com.example.cardly

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cardly.ui.theme.CardlyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardlyTheme {
                    CardLy()
                }
            }
        }
    }


@Composable
fun CardLy() {
Column(
    modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center

) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val icon1 = painterResource(R.drawable.busicard1)

        Image(
            painter = icon1,
            contentDescription = "ProfilePic",
            modifier = Modifier.size(185.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "N'GUESSAN ASSI",
            fontSize = 22.sp, fontWeight = FontWeight.W500,
            color = Color.DarkGray
        )

        Text(
            text = "Carte de visite ",
            fontSize = 16.sp, fontWeight = FontWeight.W700,
            color = Color.Gray, // Gris
        )
    }

    Spacer(modifier = Modifier.height(50.dp))

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),

        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(4.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = "tel",
                modifier = Modifier.size(24.dp),
                tint = Color.Black
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "(+225) 05 44 63 85 31",
                fontSize = 20.sp,
                fontWeight = FontWeight.W500
            )

        }

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(4.dp)
        ) {
            val img2 = painterResource(R.drawable.igpng)
            Image(
                painter = img2,
                contentDescription = "Linkedin",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(text = "ASSINGS@gmail.com", fontSize = 20.sp, fontWeight = FontWeight.W500)
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(4.dp)
        ) {
            val mail = painterResource(R.drawable.mail)
            Image(
                painter = mail,
                contentDescription = "Mail",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "nguessan@gmail.com",
                fontSize = 20.sp,
                fontWeight = FontWeight.W500
            )
        }
    }
}
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardLyPreview() {
    CardlyTheme {
        CardLy()
    }
}