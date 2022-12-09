package transport_main.transport;

import transport_main.Competing;

import static transport_main.transport.TransportType.PASSENGER_CAR;

public class PassengerCar extends Car implements Competing {
    public enum CarBodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        KOUPE("Купе"),
        UNIVERSAL("Универсал"),
        JEEP("Внедорожник"),
        CROSSOVER("Кросовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивен");
        private final String carBodyType;
        CarBodyType(String carBodyType){
            this.carBodyType = carBodyType;
        }

        public String getCarBodyType() {
            return carBodyType;
        }
        @Override
        public String toString() {
            return "Тип кузова: " + carBodyType;
        }
    }
    private final CarBodyType carBodyType;
    public PassengerCar(String brand, String model, double engineVolume, CarBodyType carBodyType) {
        super(brand, model, engineVolume);
        this.carBodyType = carBodyType;
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
        System.out.println(PASSENGER_CAR);
    }
    @Override
    public void pitStop() {
        System.out.println("car in pitstop");
    }

    @Override
    public void bestLapTime() {
        System.out.println("bestLapTime = 1'30");
    }

    @Override
    public void maxSpeed() {
        System.out.println("maxSpeed = 250 km/h");
    }

    @Override
    public String getCarBodyType() {
        return carBodyType.toString();
    }
    @Override
    public String toString() {
        return String.format ("%s %s:\nОбъем двигателя: %.01f л\n%s\n",
                getBrand(), getModel(), getEngineVolume(), getCarBodyType());
    }
}