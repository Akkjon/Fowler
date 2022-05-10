package de.akkjon.fowler.prices;

import de.akkjon.fowler.Movie;
import de.akkjon.fowler.Price;

public class ChildrenPrice implements Price {

    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
    }
}
