package de.akkjon.fowler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {

    Rental rental;
    int daysRented;
    Movie movie;

    @BeforeEach
    void setup() {
        this.daysRented = (int) (Math.random() * 100);
        this.movie = new Movie("Title", 1);
        rental = new Rental(movie, daysRented);
    }

    @Test
    void getDaysRented() {
        Assertions.assertEquals(daysRented, rental.getDaysRented());
    }

    @Test
    void getMovie() {
        Assertions.assertEquals(movie, rental.getMovie());
    }

    @Test
    void charge() {
        Movie movie1 = new Movie("1", Movie.NEW_RELEASE);
        Movie movie2 = new Movie("2", Movie.REGULAR);
        Movie movie3 = new Movie("3", Movie.CHILDRENS);

        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie2, 1);
        Rental rental3 = new Rental(movie3, 1);

        Assertions.assertEquals(3, rental1.getCharge());
        Assertions.assertEquals(2, rental2.getCharge());
        Assertions.assertEquals(1.5, rental3.getCharge());
    }
}
