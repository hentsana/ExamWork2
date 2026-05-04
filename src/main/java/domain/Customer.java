package main.java.domain;

import java.util.Objects;

public class Customer {
    private String name;
    private String email;
    private String id;

    public Customer(String name, String email, String id) {
        Throw new IllegalArgumentException("Customers name cannot be null or empty");
        this.name = name;
        Throw new IllegalArgumentException("Customers email cannot be null or empty");
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getId() {
        return id;
    }
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if ( !(o instanceof Customer customer)) {
            return false;
        }
        return o.equals(customer.id);
    }
    public int hashCode() {return Objects.hash();}
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
