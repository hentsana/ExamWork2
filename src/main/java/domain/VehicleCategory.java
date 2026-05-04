package main.java.domain;

public enum VehicleCategory {
    RANDOME_CAR(100),
    BUS(50),
    FERRARI(5),
    HONDA(10);
    private final int limit;
    VehicleCategory(int limit) {
        this.limit = limit;
    }
    public long getLimit() {
        return limit;
    }

}
