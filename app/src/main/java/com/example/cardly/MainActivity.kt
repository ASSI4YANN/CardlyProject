package com.example.cardly

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
            .padding(16.dp)
            .background(color = Color(0xFF212121)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val icon1 = painterResource(R.drawable.android_logo)

            Image(
                painter = icon1,
                contentDescription = stringResource(R.string.c1),
                modifier = Modifier
                    .size(185.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = stringResource(R.string.name),
                fontSize = 22.sp,
                fontWeight = FontWeight.W500,
                color = Color(0xFFFFFFFF)
            )
            Text(
                text = stringResource(R.string.titre),
                fontSize = 16.sp,
                fontWeight = FontWeight.W700,
                color = Color(0xFFFFFFFF)
            )
        }
        Spacer(modifier = Modifier.height(70.dp))
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
                    Icons.Default.Call,
                    contentDescription = stringResource(R.string.i1),
                    modifier = Modifier.size(24.dp),
                    tint = Color(0xFFFFFFFF)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = stringResource(R.string.number),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W500,
                    color = Color(0xFFFFFFFF)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(4.dp)
            ) {
                Icon(
                    Icons.Default.Share,
                    contentDescription = stringResource(R.string.socialNetwork),
                    modifier = Modifier.size(24.dp),
                    tint = Color(0xFFFFFFFF)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "ASSINGS@gmail.com",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W500,
                    color = Color(0xFFFFFFFF)
                )

            }
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(4.dp)
            ) {
                Icon(
                    Icons.Default.Email,
                    contentDescription = stringResource(R.string.mail),
                    modifier = Modifier.size(24.dp),
                    tint = Color(0xFFFFFFFF)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = stringResource(R.string.address),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W500,
                    color = Color(0xFFFFFFFF)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardLyPreview() {
    CardlyTheme {
        CardLy()
    }
}
