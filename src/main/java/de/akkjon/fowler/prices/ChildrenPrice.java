package de.akkjon.fowler.prices;

import de.akkjon.fowler.Movie;
import de.akkjon.fowler.Price;

public class ChildrenPrice implements Price {

    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }
}
