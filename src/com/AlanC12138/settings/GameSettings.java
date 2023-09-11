package com.AlanC12138.settings;

public class GameSettings {
    // Default com.AlanC12138.settings
    private int grassGrowthTime = 3;

    private int soilToDirtTime = 2;

    // Enumeration for weather types
    public enum WeatherType {
        SUNNY, RAINY, CLOUDY, SNOWY;
    }

    // Getter methods for accessing com.AlanC12138.settings

    public int getGrassGrowthTime() {
        return grassGrowthTime;
    }

    public int getSoilToDirtTime() {
        return soilToDirtTime;
    }
}
