package settings;

public class GameSettings {
    // Default settings
    private WeatherType weather = WeatherType.SUNNY;
    private int grassGrowthTime = 3;

    private int soilToDirtTime = 1;

    // Enumeration for weather types
    public enum WeatherType {
        SUNNY, RAINY, CLOUDY, SNOWY;
    }

    // Getter methods for accessing settings
    public WeatherType getWeather() {
        return weather;
    }

    public int getCropGrowthTime() {
        return grassGrowthTime;
    }

    public int getSoilToDirtTime() {
        return soilToDirtTime;
    }
}
