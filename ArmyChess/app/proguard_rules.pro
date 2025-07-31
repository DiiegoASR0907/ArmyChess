# proguard-rules.pro
# Mantiene las clases y métodos esenciales para evitar que se eliminen en compilación release

# Mantener todas las clases de Compose
-keep class androidx.compose.** { *; }
-dontwarn androidx.compose.**

# Mantener clases del juego y lógica
-keep class com.armychess.** { *; }

# Mantener clases Kotlin
-keep class kotlin.** { *; }
-dontwarn kotlin.**

# Soporte Jetpack Navigation (si se usa en el futuro)
-keep class androidx.navigation.** { *; }
-dontwarn androidx.navigation.**
