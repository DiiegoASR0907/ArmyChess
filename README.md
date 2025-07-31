# 🧠 ArmyChess - Juego de Ajedrez con Ejércitos Históricos

ArmyChess es un juego de ajedrez educativo y estratégico donde cada jugador selecciona un ejército basado en líderes históricos como Napoleón, Stalin, Mao Zedong, entre otros. Cada ejército tiene su propio fondo de batalla y biografía ilustrativa.

---

## 🚀 Características
- ♟️ Tablero de ajedrez interactivo con Jetpack Compose
- 👑 Selector de ejército con caricaturas y biografías
- 🎖️ Fondos dinámicos basados en batallas históricas
- 🧠 IA simple para jugar contra el CPU
- 🎮 Modo multijugador local (1v1)

---

## 📦 Estructura del Proyecto
```
app/
├── java/com/armychess/
│   ├── MainActivity.kt
│   ├── game/logic/Army.kt
│   ├── ui/screens/ArmySelector.kt, BoardScreen.kt
│   └── ui/theme/Color.kt, Theme.kt, Type.kt
├── res/
│   ├── drawable/bg_*.jpg  ← fondos de batalla por ejército
│   └── values/strings.xml, themes.xml, colors.xml
```

---

## 🛠️ Requisitos
- Android Studio Flamingo o Narwhal (1.1.14 o superior)
- SDK mínimo: 24 (Android 7.0)
- SDK objetivo: 34

---

## ▶️ Cómo ejecutar
1. Clona el repositorio y abre en Android Studio
2. Espera a que Gradle sincronice
3. Ejecuta el proyecto en un emulador o dispositivo físico

---

## ✨ Créditos
- Arte generado con IA basado en líderes históricos de dominio público
- Desarrollado con Jetpack Compose y Material 3

---

## 🔜 Próximas funciones
- Animaciones de ataque al capturar piezas
- Reglas personalizadas por ejército
- Modo historia por campaña histórica

¡Que comience la batalla por la historia!
