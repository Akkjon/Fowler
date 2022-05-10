package de.akkjon.fowler.prices;

import de.akkjon.fowler.Movie;
import de.akkjon.fowler.Price;

public class NewReleasePrice implements Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3.0;
    }
}
