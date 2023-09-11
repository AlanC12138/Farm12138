package com.AlanC12138.gameStates;

public interface GameState {
    // Method to perform actions when entering the game state
    void enter();

    // Method to update the game state (e.g., handle input, update logic)
    void update();

    // Method to render the game state (e.g., display graphics and UI)
    void render();

    // Method to perform actions when exiting the game state
    void exit();
}
