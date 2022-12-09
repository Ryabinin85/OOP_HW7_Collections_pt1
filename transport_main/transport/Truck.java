package transport_main.transport;

import transport_main.Competing;

import static transport_main.transport.TransportType.TRUCK;

public class Truck extends  Car implements Competing {

    public enum Tonnage {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);

        private final Float lowerValue;
        private final Float upperValue;
        Tonnage(Float lowerValue, Float upperValue) {
            this.lowerValue = lowerValue;
            this.upperValue = upperValue;
        }

        public Float getLowerValue() {
            return lowerValue;
        }

        public Float getUpperValue() {
            return upperValue;
        }
        @Override
        public String toString() {
            if (lowerValue == null)
                return String.format("Грузоподъемность: до %.1f тонн.\n", upperValue);
            else if (upperValue == null)
                return String.format("Грузоподъемность: от %.1f тонн.\n", lowerValue);
            else
                return String.format("Грузоподъемность: от %.1f тонн до %.1f тонн.\n", lowerValue, upperValue);
        }
    }
    private final Tonnage tonnage;
    public Truck(String brand, String model, double engineVolume, Tonnage tonnage) {
        super(brand, model, engineVolume);
        this.tonnage = tonnage;
    }

    public void startDriving() {
        System.out.println("start driving");
    }
    public void stopDriving() {
        System.out.println("stop driving");
    }
    @Override
    public void printType() {
        System.out.println(getBrand() + " " + getModel());
        System.out.println(TRUCK);
    }
    @Override
    public void pitStop() {
        System.out.println("Truck in pitstop");
    }

    @Override
    public void bestLapTime() {
        System.out.println("bestLapTime = 5'30\"");
    }

    @Override
    public void maxSpeed() {
        System.out.println("maxSpeed = 155 km/h");
    }

    public Tonnage getTonnage() {
        return tonnage;
    }
    @Override
    public String toString() {
        return String.format ("%s %s:\nОбъем двигателя: %.01f л\n%s\n",
                getBrand(), getModel(), getEngineVolume(), getTonnage());
    }
}