
package com.armychess.game.logic

enum class PieceType { KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN }
enum class Army { NAPOLEON, STALIN }

data class Piece(
    val type: PieceType,
    val army: Army,
    var row: Int,
    var col: Int
)
