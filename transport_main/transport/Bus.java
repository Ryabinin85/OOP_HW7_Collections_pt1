package transport_main.transport;

import transport_main.Competing;
import transport_main.drivers.Driver;

import static transport_main.transport.TransportType.BUS;

public class Bus extends Car implements Competing {

    public enum PassengerCapacity {
        ESPECIALLY_SMALL(null, 10),
        SMALL(null, 25),
        MIDDLE(40, 50),
        BIG(60, 80),
        ESPECIALLY_BIG(100, 120);

        private final Integer lowerCapacity;
        private final Integer upperCapacity;

        PassengerCapacity (Integer lowerCapacity, Integer upperCapacity) {
            this.lowerCapacity = lowerCapacity;
            this.upperCapacity = upperCapacity;
        }

        public Integer getLowerCapacity() {
            return lowerCapacity;
        }

        public Integer getUpperCapacity() {
            return upperCapacity;
        }

        @Override
        public String toString() {
            if (lowerCapacity == null)
                return String.format("Вместимость: до %d мест.\n", upperCapacity);
            else if (upperCapacity == null)
                return String.format("Вместимость: от %d мест.\n", lowerCapacity);
            else
                return String.format("Вместимость: от %d до %d мест.\n", lowerCapacity, upperCapacity);
        }
    }
    private final PassengerCapacity passengerCapacity;
    public Bus(String brand, String model, double engineVolume, PassengerCapacity passengerCapacity) {
        super(brand, model, engineVolume);
        this.passengerCapacity = passengerCapacity;
    }

    public void passDiagnostics(Driver driver) {
        System.out.printf("Автобус %s %s в диагностике не требуется\n", getBrand(), getModel());
    }

    @Override
    public void printType() {
        System.out.println(getBrand() + " " + getModel());
        System.out.println(BUS);
    }

    public void startDriving() {
        System.out.println("start driving");
    }
    public void stopDriving() {
        System.out.println("stop driving");
    }
    @Override
    public void pitStop() {
        System.out.println("Bus in pitstop");
    }

    @Override
    public void bestLapTime() {
        System.out.println("bestLapTime = 3'30\"");
    }

    @Override
    public void maxSpeed() {
        System.out.println("maxSpeed = 175 km/h");
    }

    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public String toString() {
        return String.format ("%s %s:\nОбъем двигателя: %.01f л\n%s\n",
                getBrand(), getModel(), getEngineVolume(), getPassengerCapacity());
    }
}