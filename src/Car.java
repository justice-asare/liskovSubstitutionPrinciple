public class Car implements NormalVehicle{
    @Override
    public void speed() {
        System.out.println("Car moving at a speed of 120km/h...");
    }

    @Override
    public void addFuel() {
        System.out.println("Adding fuel to the car...");
    }
}
