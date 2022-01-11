public class ElectricCar implements ElectricVehicle{
    @Override
    public void speed() {
        System.out.println("Car moving at a speed of 80km/h...");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging battery...");
    }
}
