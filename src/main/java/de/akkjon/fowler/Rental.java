package de.akkjon.fowler;

class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        return movie.getCharge(getDaysRented());
    }

    public int getFrequentRenterPoints() {
        return getMovie().getFrequentRenterPoints(daysRented);
    }
}