package entities;

public class FarmGrid {
    private final int numRows = 5;
    private final int numColumns = 5;
    private FarmTile[][] grid;

    public FarmGrid() {
        // Initialize the grid with empty tiles
        grid = new FarmTile[numRows][numColumns];
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                grid[row][col] = new FarmTile(); // Initialize each tile as empty
            }
        }
    }

    // Add methods for interacting with the farm, planting crops, etc.

    // You can add getters and setters for specific tiles or actions related to the farm.

    // Example method to plant a crop at a specific location
    public void plantCrop(int row, int col, Crop crop) {
        if (isValidLocation(row, col)) {
            grid[row][col].plantCrop(crop);
        }
    }

    // Helper method to check if a location is within bounds
    private boolean isValidLocation(int row, int col) {
        return row >= 0 && row < numRows && col >= 0 && col < numColumns;
    }
}

