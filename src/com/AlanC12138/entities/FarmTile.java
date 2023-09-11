package com.AlanC12138.entities;

public class FarmTile {
    private boolean isEmpty = true; // Whether the tile is empty or contains a crop
    private Crop crop; // Reference to the crop planted on the tile (null if empty)

    public boolean isEmpty() {
        return isEmpty;
    }

    public Crop getCrop() {
        return crop;
    }

    public void plantCrop(Crop crop) {
        this.crop = crop;
        isEmpty = false;
    }

    public void clearTile() {
        this.crop = null;
        isEmpty = true;
    }
}
