package de.akkjon.fowler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer;
    String name;

    @BeforeEach
    void setup() {
        name = randomString();
        customer = new Customer(name);
    }

    @Test
    void addRental() {
        String title = randomString();
        Movie movie = new Movie(title, 0);
        Rental rental = new Rental(movie, 1);
        customer.addRental(rental);
        Assertions.assertTrue(customer.statement().contains(title));
    }

    @Test
    void getName() {
        Assertions.assertEquals(name, customer.getName());
    }

    @Test
    void statement() {
        Assertions.assertTrue(customer.statement().startsWith("Rental Record for " + name));
        Assertions.assertTrue(customer.statement().endsWith("frequent renter points"));
    }

    private String randomString() {

        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<15; i++) {
            result.append(s.getBytes()[(int) (Math.random() * s.length())]);
        }
        return result.toString();
    }
}