// MainActivity.kt
package com.armychess

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.armychess.ui.screens.ArmySelector
import com.armychess.ui.screens.BoardScreen
import com.armychess.ui.theme.ArmyChessTheme
import com.armychess.game.logic.ArmyInfo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArmyChessTheme {
                val selectedArmy = remember { mutableStateOf<ArmyInfo?>(null) }

                if (selectedArmy.value == null) {
                    ArmySelector { army ->
                        selectedArmy.value = army
                    }
                } else {
                    BoardScreen() // Próximamente: pasaremos el ejército seleccionado
                }
            }
        }
    }
}
