package de.akkjon.fowler;

public interface Price {

    double getCharge(int daysRented);

    int getPriceCode();

    default int getFrequentRenterPoints(int daysRented){
        return 1;
    }

}
