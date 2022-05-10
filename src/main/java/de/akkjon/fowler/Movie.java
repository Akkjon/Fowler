package de.akkjon.fowler;

import de.akkjon.fowler.prices.ChildrenPrice;
import de.akkjon.fowler.prices.NewReleasePrice;
import de.akkjon.fowler.prices.RegularPrice;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
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
    };

    public double getCharge(int daysRented) {
        double thisAmount = 0;
        switch (this.getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
    }
}