
package com.armychess.ui.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BoardScreen() {
    val boardSize = 8
    Column(modifier = Modifier.fillMaxSize().background(Color.DarkGray)) {
        for (row in 0 until boardSize) {
            Row {
                for (col in 0 until boardSize) {
                    val isWhite = (row + col) % 2 == 0
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .background(if (isWhite) Color.LightGray else Color.Gray)
                            .clickable { /* Handle move */ }
                    )
                }
            }
        }
    }
}
