package com.armychess.game.logic

import androidx.compose.runtime.mutableStateListOf
import com.armychess.game.ai.ChessAI

class GameController {
    val pieces = mutableStateListOf<Piece>()
    var currentTurn = Army.NAPOLEON

    init {
        setupInitialPieces()
    }

    private fun setupInitialPieces() {
        pieces.clear()
        for (col in 0 until 8) {
            pieces.add(Piece(PieceType.PAWN, Army.NAPOLEON, 6, col))
            pieces.add(Piece(PieceType.PAWN, Army.STALIN, 1, col))
        }
        pieces.add(Piece(PieceType.KING, Army.NAPOLEON, 7, 4))
        pieces.add(Piece(PieceType.KING, Army.STALIN, 0, 4))
    }

    fun movePiece(selected: Piece, toRow: Int, toCol: Int) {
        val target = pieces.find { it.row == toRow && it.col == toCol }
        if (target != null && target.army != selected.army) {
            pieces.remove(target)
        }
        selected.row = toRow
        selected.col = toCol
        switchTurn()
        if (currentTurn == Army.STALIN) aiMove()
    }

    private fun switchTurn() {
        currentTurn = if (currentTurn == Army.NAPOLEON) Army.STALIN else Army.NAPOLEON
    }

    private fun aiMove() {
        val move = ChessAI.makeMove(pieces)
        if (move != null) {
            val aiPiece = pieces.firstOrNull { it.army == Army.STALIN }
            if (aiPiece != null) movePiece(aiPiece, move.first, move.second)
        } else {
            switchTurn()
        }
    }
}

