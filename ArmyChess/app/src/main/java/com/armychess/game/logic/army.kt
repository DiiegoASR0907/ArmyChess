// Army.kt
package com.armychess.game.logic

enum class Army(val displayName: String) {
    NAPOLEON("Napoleón Bonaparte"),
    STALIN("Joseph Stalin"),
    HITLER("Adolf Hitler"),
    MAO("Mao Zedong"),
    GENGHIS("Gengis Khan"),
    CAESAR("Julio César"),
    WASHINGTON("George Washington"),
    NELSON("Horatio Nelson"),
    ROMMEL("Erwin Rommel"),
    CHURCHILL("Winston Churchill");

    companion object {
        fun fromName(name: String): Army? = values().find { it.displayName == name }
    }
}
