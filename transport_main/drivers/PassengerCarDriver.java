package transport_main.drivers;

import transport_main.transport.PassengerCar;

public class PassengerCarDriver <B extends PassengerCar> extends Driver{
    public PassengerCarDriver(String name, boolean driverLicense, int drivingExperience) {
        super(name, driverLicense, drivingExperience);
    }
    public void startDrive(B car) {
        System.out.println("Start drive" + car);
    }
    public void stopCar(B car) {
        System.out.println("Stop " + car);
    }
    public void refillCar(B car) {
        System.out.println("Refill " + car);
    }
    public void race (B car) {
        System.out.printf("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде.\n",
                getName(), car.getBrand(), car.getModel());
    }
}