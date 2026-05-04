package main.java.exeption;

import main.java.domain.Rental;

public class DublicateRental extends RentalException {
    public DublicateRental(String message, Throwable cause) {
        super("This rental has been dublicated", cause);
    }
}
