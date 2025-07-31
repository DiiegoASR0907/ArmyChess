# ArmyChess v0.4

✅ Turnos Jugador vs IA:
El jugador (Napoleón) mueve primero.

La IA (Stalin) responde con una jugada simple al azar.

Cambios de turno automáticos.

✅ Animaciones básicas:
Resaltado de celda seleccionada (amarillo).

Captura visual (pieza eliminada de la lista).

Movimiento directo sin efectos visuales por ahora (puedo agregar desplazamiento animado si deseas).

🧩 Archivos nuevos:
GameController.kt: controla lógica de juego, turnos, IA y captura.

BoardScreen.kt: adaptado para turnos y clics en celdas.

MainScreen.kt: integra el selector y muestra una imagen de fondo dinamica (cambia con el general)

ArmySelector.kt: se agrega el metodo para insertar imagenes de fondo por cada general

ArmyChess/
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/
│           │       └── armychess/
│           │           ├── game/
│           │           │   ├── ai/
│           │           │   │   └── ChessAI.kt         ← IA básica
│           │           │   ├── logic/
│           │           │   │   ├── Piece.kt           ← Definición de piezas y ejércitos
│           │           │   │   └── GameController.kt  ← NUEVO: Turnos, movimiento y captura
│           │           └── ui/
│           │               └── screens/
│           │                   └── BoardScreen.kt      ← Tablero interactivo + turnos
|           |                   |__ army_selector.ui_kt ← Menu para seleccionar el general y su ejercito
|           |                   |__ MainScreen.kt       ← Integra el selector de imagen y muestra imagen de fondo dinamica
│           ├── res/
│           │   ├── drawable/                          ← Fondos, íconos, imágenes
│           │   └── values/                            ← Strings, temas, estilos
├── README.md 