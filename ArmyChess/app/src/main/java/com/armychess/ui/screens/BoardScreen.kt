package com.armychess.ui.screens

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.armychess.game.logic.GameController
import com.armychess.game.logic.Piece

@Composable
fun BoardScreen(controller: GameController = remember { GameController() }) {
    val selectedPiece = remember { mutableStateOf<Piece?>(null) }

    Column(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        for (row in 0 until 8) {
            Row {
                for (col in 0 until 8) {
                    val piece = controller.pieces.find { it.row == row && it.col == col }
                    val isSelected = selectedPiece.value == piece
                    val bgColor = when {
                        isSelected -> Color.Yellow
                        (row + col) % 2 == 0 -> Color.LightGray
                        else -> Color.DarkGray
                    }

                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .background(bgColor)
                            .clickable {
                                if (selectedPiece.value == null && piece?.army == controller.currentTurn) {
                                    selectedPiece.value = piece
                                } else if (selectedPiece.value != null) {
                                    controller.movePiece(selectedPiece.value!!, row, col)
                                    selectedPiece.value = null
                                }
                            }
                    )
                }
            }
        }
    }
}