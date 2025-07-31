package com.armychess.game.ai

import com.armychess.game.logic.Piece
import com.armychess.game.logic.Army

object ChessAI {
    fun makeMove(pieces: List<Piece>): Pair<Int, Int>? {
        val movable = pieces.filter { it.army == Army.STALIN }
        if (movable.isEmpty()) return null
        val selected = movable.random()
        return Pair(selected.row + 1, selected.col)
    }
}
