package transport_main;

import transport_main.drivers.BusDriver;
import transport_main.drivers.Driver;
import transport_main.drivers.PassengerCarDriver;
import transport_main.drivers.TruckDriver;
import transport_main.exceptions.DiagnosticFailedException;
import transport_main.personal.Mechanic;
import transport_main.personal.Sponsor;
import transport_main.serviceStation.ServiceStation;
import transport_main.transport.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws DiagnosticFailedException {
        Set<Car> cars = new HashSet<>();
        Set<Driver> drivers = new HashSet<>();
        Set<Mechanic> mechanics = new HashSet<>();
        Set<Sponsor> sponsors = new HashSet<>();

        PassengerCar pajero = new PassengerCar("Mitsubishi", "Pajero", 3.2, PassengerCar.CarBodyType.JEEP);
        PassengerCar pajero2 = new PassengerCar("Mitsubishi", "Pajero", 3.2, PassengerCar.CarBodyType.JEEP);
        PassengerCar pathfinder = new PassengerCar("Nissan", "Pathfinder", 3.0, PassengerCar.CarBodyType.JEEP);
        PassengerCar outlander = new PassengerCar("Mitsubishi", "Outlander", 3.0, PassengerCar.CarBodyType.CROSSOVER);
        PassengerCar xTrail = new PassengerCar("Nissan", "X-Trail", 2.4, PassengerCar.CarBodyType.CROSSOVER);

        Bus nefaz5299 = new Bus("НефАЗ", "nefaz5299", 4.0, Bus.PassengerCapacity.MIDDLE);
        Bus maz206 = new Bus("МАЗ", "maz206", 5.0, Bus.PassengerCapacity.BIG);
        Bus gazeleCity = new Bus("ГАЗель", "gazeleCity", 3.0, Bus.PassengerCapacity.ESPECIALLY_SMALL);
        Bus bus4 = new Bus("", " ", -2.0, Bus.PassengerCapacity.SMALL);

        Truck valdaiNext = new Truck("Валдай", "NEXT", 2.8, Truck.Tonnage.N1);
        Truck kamaz5490 = new Truck("КамАЗ", "5490", 12, Truck.Tonnage.N2);
        Truck manTgx = new Truck("MAN", "TGX", 12.4, Truck.Tonnage.N3);
        Truck volvoFh16 = new Truck("Volvo", "FH16", 16, Truck.Tonnage.N3);

        cars.add(pajero);
        cars.add(pajero2);
        cars.add(pathfinder);
        cars.add(outlander);
        cars.add(xTrail);
        cars.add(nefaz5299);
        cars.add(maz206);
        cars.add(gazeleCity);
        cars.add(bus4);
        cars.add(valdaiNext);
        cars.add(kamaz5490);
        cars.add(manTgx);
        cars.add(volvoFh16);

        PassengerCarDriver<PassengerCar> hakkinen = new PassengerCarDriver<>("Hakkinen", true, 25);
        PassengerCarDriver<PassengerCar> hakkinen2 = new PassengerCarDriver<>("Hakkinen", true, 25);
        BusDriver<Bus> hamilton = new BusDriver<>("Hamilton", true, 18);
        TruckDriver<Truck> schumacher = new TruckDriver<>("Schumacher", true, 36);
        drivers.add(hakkinen);
        drivers.add(hakkinen2);
        drivers.add(hamilton);
        drivers.add(schumacher);

        Mechanic<PassengerCar> ivanich = new Mechanic<PassengerCar>("Ivanych", "CTO", TransportType.PASSENGER_CAR);
        Mechanic<Bus> mikhalich = new Mechanic<Bus>("Mikhalych", "CTO", TransportType.BUS);
        Mechanic<Car> petrovich = new Mechanic<Car>("Petrovich", "CTO");
        Mechanic<Car> petrovich2 = new Mechanic<Car>("Petrovich", "CTO");
        Sponsor<Truck> nike = new Sponsor<Truck>("Nike", 500);
        Sponsor<Bus> reebok = new Sponsor<Bus>("Reebok", 300);
        Sponsor<PassengerCar> adidas = new Sponsor<PassengerCar>("Adidas", 1000);
        Sponsor<PassengerCar> adidas2 = new Sponsor<PassengerCar>("Adidas", 1000);

        mechanics.add(ivanich);
        mechanics.add(mikhalich);
        mechanics.add(petrovich);
        mechanics.add(petrovich2);

        sponsors.add(nike);
        sponsors.add(reebok);
        sponsors.add(adidas);
        sponsors.add(adidas2);

//        for (Car car : cars) {
//            ServiceStation.addCarToQueue(car);
//        }
//        for (Car car : cars) {
//            System.out.println(car);
//            ServiceStation.maintenance();
//        }

        for (Car car : cars) System.out.println(car);
        for (Driver driver : drivers) System.out.println(driver);
        for (Mechanic mechanic : mechanics) System.out.println(mechanic);
        for (Sponsor sponsor : sponsors) System.out.println(sponsor);
    }
}