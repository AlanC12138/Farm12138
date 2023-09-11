package com.AlanC12138.gameStates;

import com.AlanC12138.input.InputManager;
import com.AlanC12138.render.RenderEngine;

public class MainMenuState {
    private InputManager inputManager;
    private RenderEngine renderEngine;

    // Constructor to initialize inputManager and renderEngine
    public MainMenuState(InputManager inputManager, RenderEngine renderEngine) {
        this.inputManager = inputManager;
        this.renderEngine = renderEngine;
    }

    @Override
    public void enter() {
        // Perform any setup when entering the main menu state
    }

    @Override
    public void update() {
        // Update logic for the main menu
        handleInput(); // Check for user input
    }

    @Override
    public void render() {
        // Render the main menu UI and graphics
    }

    @Override
    public void exit() {
        // Perform cleanup when leaving the main menu state
    }

    private void handleInput() {
        // Handle user input for menu navigation
        if (inputManager.isKeyPressed(InputManager.KEY_ENTER)) {
            // Player pressed the "Enter" key, perform an action (e.g., start the game)
            // You can change the game state to transition to gameplay, options menu, etc.
        }
    }
}

