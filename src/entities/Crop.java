package entities;

public class Crop { //the super class for crops
    private String name;
    private int growthTime; // Time it takes for the crop to grow (in game ticks)

    public Crop(String name, int growthTime) {
        this.name = name;
        this.growthTime = growthTime;
    }

    public String getName() {
        return name;
    }

    public int getGrowthTime() {
        return growthTime;
    }

    // Add other methods relevant to all crops
}
