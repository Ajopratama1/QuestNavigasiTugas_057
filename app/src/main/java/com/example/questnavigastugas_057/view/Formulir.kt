package com.example.questnavigastugas_057.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas_057.R
import com.example.questnavigastugas_057.Routes

@Composable
fun Formulir(navController: NavController) {
    var namaLengkap by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    val jenisKelaminOptions = listOf("Laki-laki", "Perempuan")
    var statusPerkawinan by remember { mutableStateOf("") }
    val statusPerkawinanOptions = listOf("Janda", "Lajang", "Duda")
    var alamat by remember { mutableStateOf("") }

    // Skema warna diubah menjadi nuansa abu-abu agar konsisten
    val headerGrey = Color(0xFF424242) // Abu-abu gelap untuk header
    val primaryGrey = Color(0xFF616161) // Abu-abu sedang untuk aksen (tombol, radio button)
    val backgroundColor = Color(0xFFF5F5F5) // Abu-abu sangat terang untuk background

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(top = 53.dp)
    ){

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(headerGrey) // Menggunakan headerGrey
                .heightIn(min = 100.dp)
                .padding(16.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(
                text = "Formulir Pendaftaran",
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

