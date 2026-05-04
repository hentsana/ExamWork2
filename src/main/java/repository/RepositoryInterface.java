package main.java.repository;

import main.java.domain.Rental;

import java.util.Collection;
import java.util.Optional;

public interface RepositoryInterface {
    void save(Rental rental);
    public Optional<Rental> findById(String id);
    public Collection<Rental> findAll();
    void delete(Rental rental);
}
