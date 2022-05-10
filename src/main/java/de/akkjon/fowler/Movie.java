package de.akkjon.fowler;

import de.akkjon.fowler.prices.ChildrenPrice;
import de.akkjon.fowler.prices.NewReleasePrice;
import de.akkjon.fowler.prices.RegularPrice;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private final String title;
    private Price price;

    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        setPriceCode(newpriceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        price = switch (priceCode) {
            case REGULAR -> new RegularPrice();
            case NEW_RELEASE -> new NewReleasePrice();
            case CHILDRENS -> new ChildrenPrice();
            default -> throw new IllegalArgumentException("Incorrect Price Code");
        };
    }

    public String getTitle (){
        return title;
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}