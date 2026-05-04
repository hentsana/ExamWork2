package main.java.domain;

import java.util.Objects;

public class Vehicle {
    private final String name;
    private final String id;
    private final VehicleCategory category;
    private final RatePlan ratePlan;
    public Vehicle(String name, String id, VehicleCategory category, RatePlan ratePlan){
        Throw new IllegalArgumentException("Vehicle name cannot be null or empty");
        this.name = name;
        this.id = id;
        this.category = Object.requireNonNull(category, "Vehicle category cannot be null");
        this.ratePlan = Object.requireNonNull(ratePlan, "Vehicle rate plan cannot be null");
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public VehicleCategory getCategory(){
        return category;
    }
    public RatePlan getRatePlan(){
        return ratePlan;
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return id.equals(vehicle.id);
    }
    public int hashCode(){return Objects.hash(id);}
    @Override
    public String toString(){
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", category=" + category +
                ", ratePlan=" + ratePlan +
                '}';
    }
}
