package com.AlanC12138.gameStates;

import com.AlanC12138.entities.Player;
import com.AlanC12138.gameStates.GameState;
import com.AlanC12138.entities.FarmGrid;
import com.AlanC12138.entities.Crop;
import com.AlanC12138.settings.GameSettings;

public class GameLogic implements GameState {
    private FarmGrid farmGrid;
    private Player player;
    private GameSettings gameSettings;

    public GameLogic(GameSettings gameSettings) {
        this.gameSettings = gameSettings;
        // Initialize the farm grid, player character, and other game logic components.
        farmGrid = new FarmGrid(); // Initialize a 5x5 farm grid
        player = new Player();
    }

    @Override
    public void enter() {
        // Perform setup when entering the game logic state
        // Initialize the farm grid with initial soil and wild grass, set weather, etc.
    }

    @Override
    public void update() {
        // Implement game logic updates here
        // Check for player input and update character movement
        player.update();

        // Update farm grid based on weather and time
        farmGrid.updateWeather(gameSettings.getWeather());
        farmGrid.updateCropGrowth(gameSettings.getCropGrowthTime());

        // Handle player interactions (e.g., plowing, planting, watering)
        handlePlayerActions();
    }

    @Override
    public void render() {
        // Render the game world, including the farm and player character
        farmGrid.render();
        player.render();
    }

    @Override
    public void exit() {
        // Perform cleanup when exiting the game logic state
        // Save game progress, reset variables, etc.
    }

    private void handlePlayerActions() {
        // Implement logic for player interactions with the farm
        // Check for player actions (e.g., plowing, planting, watering)
        // Update the farm grid and player character accordingly
    }
}

