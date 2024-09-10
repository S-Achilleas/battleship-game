# Battleship Game

This is a Java implementation of the classic Battleship game. It allows two players to set up ships on their respective boards and take turns to fire at each other's ships. The game continues until one player's entire fleet is sunk.

## Features

- **Two-player gameplay**: Supports two players who can each position their ships on a board and take turns firing shots at each other's ships.
- **Fleet management**: Players can position various types of ships with different sizes on the board.
- **Turn-based shooting**: Players take turns firing at coordinates on their opponent's board.
- **Game-over detection**: The game ends when one player sinks all the ships of the other player.
- **Hit tracking**: Tracks and displays hits, misses, and sunken ships on the board.

## Game Structure

- **Board**: Each player has a 10x10 grid where they place their ships.
- **Ships**: Players can place multiple ships of different lengths on the board. The ships must be positioned either vertically or horizontally.
- **Pins**: Tracks player shots on the opponent's board, marking hits, misses, and sunken ships.
- **Turn-based gameplay**: Players alternate turns, firing at coordinates on the opponent’s board until one player sinks the other’s entire fleet.

## Code Overview

### `battleship.java`
This is the main class that controls the flow of the game:
- **Ship Placement**: Each player places their ships on the board by providing the start and end coordinates for each ship.
- **Turn-Based Play**: Players alternate turns to fire at the opponent's board by entering coordinates (e.g., "A5").
- **Hit and Miss Detection**: The game indicates if a shot is a hit, a miss, or if a ship is sunk.

### `Board.java`
Represents a player’s board, including:
- **Ship Management**: Tracks the positions of all ships on the board.
- **`fire()`**: Processes an opponent's shot and returns whether it hit a ship or not.
- **`GameOver()`**: Checks if all ships of a player have been sunk, determining if the game is over.

### `createGame.java`
This class handles the creation and setup of the ships for each player:
- **`CreateShips()`**: This method allows the player to position their fleet of ships on the board by providing starting and ending coordinates.

### `Ship.java`
Defines a ship and its attributes:
- **Ship Initialization**: Takes starting and ending coordinates to define the length and position of a ship.
- **Validation**: Ensures that the ships are placed correctly, either horizontally or vertically, and that the positions are valid.

### `pinBoard.java`
This class constructs a visual representation of the player’s shots on the opponent’s board:
- **`constructPinBoard()`**: It shows hits (`"X"`), misses (`"L"`), and unaffected spaces (`"."`) on the opponent’s board.
- **Pins**: The board tracks the pins that represent fired shots.

### `Pin.java`
A class representing individual shots:
- **Position**: A pin holds the coordinates of where the player fired a shot.
- **Methods**: It includes getter methods for retrieving the X and Y coordinates of the shot.


