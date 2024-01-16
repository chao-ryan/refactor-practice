package com.refactor.practice.price;

public interface Price {
    public double getRentedCharge(int daysMovieRented);
    public int getFrequentRenterPoints(int daysMovieRented);
}
