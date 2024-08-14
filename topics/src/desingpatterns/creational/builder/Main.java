package desingpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        // Building a house with a garage, pool, but no garden
        House house = new House.HouseBuilder(3, 2)
                .setGarage(true)
                .setPool(true)
                .setGarden(false)
                .build();

        // Outputting the house details
        System.out.println("House details:");
        System.out.println("Rooms: " + house.getRooms());
        System.out.println("Bathrooms: " + house.getBathrooms());
        System.out.println("Has Garage: " + house.hasGarage());
        System.out.println("Has Pool: " + house.hasPool());
        System.out.println("Has Garden: " + house.hasGarden());
    }
}