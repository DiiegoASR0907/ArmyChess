package com.armychess.ui.screens

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
// MainScreen.kt
package com.armychess.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import com.armychess.game.logic.Army

@Composable
fun MainScreen() {
    var selectedArmy by remember { mutableStateOf(armyData.first()) }

    Box(modifier = Modifier.fillMaxSize()) {
        // Fondo que cambia con el ejército
        Image(
            painter = painterResource(id = getArmyBackgroundResId(selectedArmy.army)),
            contentDescription = "Fondo",
            modifier = Modifier.fillMaxSize()
        )

        // Selector en capa superior
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ArmySelector { army ->
                selectedArmy = army
            }
        }
    }
}