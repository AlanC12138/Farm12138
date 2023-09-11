package entities;

import java.util.Random;

public class Weather {
    // Enumeration for weather types
    public enum WeatherType {
        SUNNY, RAINY, CLOUDY, SNOWY;
    }

    private WeatherType currentWeather;

    public Weather() {
        // Initialize weather with a default type (e.g., sunny)
        currentWeather = WeatherType.SUNNY;
    }

    public WeatherType getCurrentWeather() {
        return currentWeather;
    }

    public void simulateWeatherChange() {
        // Simulate a weather change, for example, randomly
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Generate a random number between 0 and 99

        // Adjust the probabilities as needed
        if (randomNumber < 20) {
            currentWeather = WeatherType.SUNNY;
        } else if (randomNumber < 40) {
            currentWeather = WeatherType.RAINY;
        } else if (randomNumber < 60) {
            currentWeather = WeatherType.CLOUDY;
        } else {
            currentWeather = WeatherType.SNOWY;
        }
    }
}
