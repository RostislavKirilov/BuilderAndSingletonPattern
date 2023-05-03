public class Main {
    RealEstate realEstate1 = new RealEstate.Builder("House1", 10110, 10001300)
            .setNumberOfRooms(3)
            .setFurnished(true)
            .setHasGarage(true)
            .setHasParkingSpace(false)
            .build();


    RealEstate realEstate2 = new RealEstate.Builder("House2", 150, 50000)
            .setNumberOfRooms(5)
            .setFurnished(false)
            .setHasGarage(false)
            .setHasParkingSpace(true)
            .build();
}