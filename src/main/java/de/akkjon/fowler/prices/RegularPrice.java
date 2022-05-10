package de.akkjon.fowler.prices;

import de.akkjon.fowler.Movie;
import de.akkjon.fowler.Price;

public class RegularPrice implements Price {

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}
