package com.armychess.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BoardScreen() {
    val boardSize = 8
    Column(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        for (row in 0 until boardSize) {
            Row {
                for (col in 0 until boardSize) {
                    val isWhite = (row + col) % 2 == 0
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .background(if (isWhite) Color.LightGray else Color.DarkGray)
                            .clickable { /* Movimiento */ }
                    )
                }
            }
        }
    }
}