package transport_main.transport;

public enum TransportType {
    BUS("Автобус"),
    TRUCK("Грузовик"),
    PASSENGER_CAR("Легковая машина");
    private final String transportType;
    TransportType (String transportType) {
        this.transportType = transportType;
    }

    public String getTransportType() {
        return transportType;
    }

    @Override
    public String toString() {
        return String.format("Тип транспортного средства: %s", transportType);
    }
}
