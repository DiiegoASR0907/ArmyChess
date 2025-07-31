// ArmySelector.kt
package com.armychess.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.armychess.game.logic.Army

val armyData = listOf(
    ArmyInfo(Army.NAPOLEON, "Napoleón Bonaparte", "General francés y emperador, lideró Europa durante las guerras napoleónicas."),
    ArmyInfo(Army.STALIN, "Joseph Stalin", "Líder soviético durante la Segunda Guerra Mundial. Consolidó el poder comunista en la URSS."),
    ArmyInfo(Army.HITLER, "Adolf Hitler", "Dictador nazi. Responsable del inicio de la Segunda Guerra Mundial y del Holocausto."),
    ArmyInfo(Army.MAO, "Mao Zedong", "Fundador de la República Popular China. Líder comunista y revolucionario."),
    ArmyInfo(Army.GENGHIS, "Gengis Khan", "Conquistador mongol. Creador del imperio contiguo más grande de la historia."),
    ArmyInfo(Army.CAESAR, "Julio César", "Político y general romano. Expansor del imperio y figura clave en la caída de la República."),
    ArmyInfo(Army.WASHINGTON, "George Washington", "Comandante del ejército continental y primer presidente de EE.UU."),
    ArmyInfo(Army.NELSON, "Horatio Nelson", "Almirante británico. Ganó la batalla de Trafalgar contra Napoleón."),
    ArmyInfo(Army.ROMMEL, "Erwin Rommel", "General alemán. Apodado el 'Zorro del desierto', luchó en África del Norte."),
    ArmyInfo(Army.CHURCHILL, "Winston Churchill", "Primer Ministro británico. Líder aliado clave en la Segunda Guerra Mundial.")
)

enum class Army {
    NAPOLEON, STALIN, HITLER, MAO, GENGHIS, CAESAR, WASHINGTON, NELSON, ROMMEL, CHURCHILL
}

data class ArmyInfo(val army: Army, val name: String, val bio: String)

@Composable
fun ArmySelector(onArmySelected: (ArmyInfo) -> Unit) {
    var selected by remember { mutableStateOf(armyData.first()) }

    Column(modifier = Modifier.fillMaxSize().background(Color.Black), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(16.dp))
        Text("Selecciona tu ejército", color = Color.White, fontSize = 22.sp)
        Spacer(modifier = Modifier.height(12.dp))

        LazyRow(modifier = Modifier.fillMaxWidth()) {
            items(armyData.size) { index ->
                val army = armyData[index]
                Column(
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable {
                            selected = army
                            onArmySelected(army)
                        },
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = getArmyIconResId(army.army)),
                        contentDescription = army.name,
                        modifier = Modifier.size(80.dp)
                    )
                    Text(army.name, color = Color.White, fontSize = 14.sp)
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
        Column(modifier = Modifier.padding(16.dp)) {
            Text("${'$'}{selected.name}", color = Color.Yellow, fontSize = 20.sp)
            Text(selected.bio, color = Color.LightGray, fontSize = 14.sp)
        }
    }
}

fun getArmyIconResId(army: Army): Int {
    // Aquí se retornarán los IDs de recursos de las imágenes (provisionalmente)
    return android.R.drawable.ic_menu_info_details // Reemplazar con íconos reales luego
}
fun getArmyBackgroundResId(army: Army): Int {
    return when (army) {
        Army.NAPOLEON -> R.drawable.bg_austerlitz
        Army.STALIN -> R.drawable.bg_stalingrad
        Army.HITLER -> R.drawable.bg_berlin
        Army.MAO -> R.drawable.bg_chinese_revolution
        Army.GENGHIS -> R.drawable.bg_mongolia
        Army.CAESAR -> R.drawable.bg_rubicon
        Army.WASHINGTON -> R.drawable.bg_yorktown
        Army.NELSON -> R.drawable.bg_trafalgar
        Army.ROMMEL -> R.drawable.bg_desert
        Army.CHURCHILL -> R.drawable.bg_dunkirk
    }
}