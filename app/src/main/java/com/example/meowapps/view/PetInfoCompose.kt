package com.example.meowapps.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun PetInfoCompose() {
    
    Row() {
       Column {
           Text(text = "Your pet info here ",
               color = Color.Blue)
       } 
    }
}