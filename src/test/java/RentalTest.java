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
        assertEquals(daysRented, rental.getDaysRented());
    }

    @Test
    void getMovie() {
        assertEquals(movie, rental.getMovie());
    }
}