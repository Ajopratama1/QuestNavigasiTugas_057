package com.example.questnavigastugas_057.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas_057.R

@Composable
fun ListDaftar(navController: NavController) {
    // Skema warna diubah menjadi nuansa abu-abu
    val headerGrey = Color(0xFF424242) // Abu-abu gelap untuk header
    val backgroundColor = Color(0xFFF5F5F5) // Abu-abu sangat terang untuk background
    val cardBackgroundColor = Color.White
    val buttonColor = Color(0xFF616161) // Abu-abu sedang untuk tombol
    val labelGrey = Color(0xFF757575) // Abu-abu untuk teks label
    val buttonTextColor = Color.White

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(top = 53.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(headerGrey)
                .heightIn(min = 100.dp)
                .padding(16.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(
                text = "List Daftar Member Gym",
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Spacer(modifier = Modifier.height(16.dp))

            InfoCard(
                label = stringResource(id = R.string.nama_lengkap),
                value = "KEVIN LEVRONE",
                backgroundColor = cardBackgroundColor,
                labelColor = labelGrey // Menggunakan warna label abu-abu
            )
            Spacer(modifier = Modifier.height(16.dp))

            InfoCard(
                label = stringResource(id = R.string.jenis_kelamin),
                value = "Laki-laki",
                backgroundColor = cardBackgroundColor,
                labelColor = labelGrey // Menggunakan warna label abu-abu
            )
            Spacer(modifier = Modifier.height(16.dp))

            InfoCard(
                label = "STATUS PERKAWINAN",
                value = "Lajang",
                backgroundColor = cardBackgroundColor,
                labelColor = labelGrey // Menggunakan warna label abu-abu
            )
            Spacer(modifier = Modifier.height(16.dp))

            InfoCard(
                label = stringResource(id = R.string.alamat),
                value = "CANADA",
                backgroundColor = cardBackgroundColor,
                labelColor = labelGrey // Menggunakan warna label abu-abu
            )
            Spacer(modifier = Modifier.height(40.dp))

            CustomButton(text = "Beranda", color = buttonColor, textColor = buttonTextColor) {
                navController.navigate("HalamanAwal")
            }
            Spacer(modifier = Modifier.height(16.dp))

            CustomButton(text = "Formulir Pendaftaran", color = buttonColor, textColor = buttonTextColor) {
                navController.navigate("Formulir")
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun InfoCard(label: String, value: String, backgroundColor: Color, labelColor: Color) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        ),
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 14.dp)
        ) {
            Text(
                text = label,
                fontSize = 15.sp,
                color = labelColor,
                fontWeight = FontWeight.Normal
            )
            Text(
                text = value,
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Black
            )
        }
    }
}
