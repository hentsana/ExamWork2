package main.java.repository;

import main.java.domain.Rental;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RentalRepositore {
    public static final Map<String, Rental> rentals = new ConcurrentHashMap<>();
    public void save(Rental rental) {
        rentals.put(rental.getId(), rental);
    }
    public Collection<Rental> findAll() {
        return rentals.values();
    }
    public void delete(String id) {
        rentals.remove(id);
    }
}
