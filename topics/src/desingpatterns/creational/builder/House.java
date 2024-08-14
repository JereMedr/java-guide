package desingpatterns.creational.builder;

public class House {
    private int rooms;
    private int bathrooms;
    private boolean hasGarage;
    private boolean hasPool;
    private boolean hasGarden;

    // Private constructor to be used by the builder
    private House(HouseBuilder builder) {
        this.rooms = builder.rooms;
        this.bathrooms = builder.bathrooms;
        this.hasGarage = builder.hasGarage;
        this.hasPool = builder.hasPool;
        this.hasGarden = builder.hasGarden;
    }

    // Getters for the fields (optional)
    public int getRooms() {
        return rooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public boolean hasPool() {
        return hasPool;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    // Static Builder class
    public static class HouseBuilder {
        private int rooms;
        private int bathrooms;
        private boolean hasGarage;
        private boolean hasPool;
        private boolean hasGarden;

        // Required parameters constructor
        public HouseBuilder(int rooms, int bathrooms) {
            this.rooms = rooms;
            this.bathrooms = bathrooms;
        }

        // Optional parameters
        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        // Method to build the final product
        public House build() {
            return new House(this);
        }
    }
}
