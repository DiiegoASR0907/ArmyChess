# ArmyChess v0.3

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
│           │                   └── BoardScreen.kt     ← ACTUALIZADO: Tablero interactivo + turnos
│           ├── res/
│           │   ├── drawable/                          ← Fondos, íconos, imágenes
│           │   └── values/                            ← Strings, temas, estilos
├── README.md 