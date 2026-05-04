package main.java.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Rental {
    private final RatePlan ratePlan;
    private final String id;
    private final LocalDate date;

    public Rental(LocalDate date, RatePlan price, String id) {
        this.date = LocalDate.now();
        this.ratePlan = price;
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public RatePlan getRatePlan() {
        return ratePlan;
    }
    public LocalDate  getDate() {
        return date;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(!(obj instanceof Rental rental)) return false;
        return id.equals(rental.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }
    @Override
    public String toString() {
        return "Rental{" +
                ", id='" + id + '\'' +
                ", ratePlan=" + ratePlan +
                '}';
    }
}
