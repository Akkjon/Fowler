package de.akkjon.fowler;

import java.util.*;

class Customer {
    private final String name;
    private final Vector<Rental> rentals = new Vector<>();

    public Customer (String newname){
        name = newname;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName (){
        return name;
    }

    public String statement() {
        Enumeration<Rental> enumRentals = rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for ").append(this.getName()).append("\n");
        result.append("\tTitle\t\tDays\tAmount\n");

        while (enumRentals.hasMoreElements()) {
            Rental each = enumRentals.nextElement();
            //show figures for this rental
            result.append(String.format("\t%s\t\t%d\t%f%n", each.getMovie().getTitle(), each.getDaysRented(), each.getCharge()));
        }
        //add footer lines
        result.append(String.format("Amount owed is %f%n", getTotalCharge()));
        result.append(String.format("You earned %d  frequent renter points", getTotalFrequentRenterPoints()));
        return result.toString();
    }

    private double getTotalCharge() {
        return Collections.list(rentals.elements()).stream().mapToDouble(Rental::getCharge).sum();
    }

    private int getTotalFrequentRenterPoints() {
        return Collections.list(rentals.elements()).stream().mapToInt(Rental::getFrequentRenterPoints).sum();
    }



}
    