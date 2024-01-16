package com.refactor.practice.price;

public class RegularPrice implements Price {
    private static final double BASE_REGULAR_RENTAL_FEE = 2.0;
    private static final int BASE_REGULAR_RENTAL_DAYS = 2;
    private static final double EXTRA_REGULAR_RENTAL_RATE = 1.5;
    private static final int BASE_REGULAR_RENTER_POINTS = 1;

    @Override
    public double getRentedCharge(int daysMovieRented) {
        double result = BASE_REGULAR_RENTAL_FEE;
        if (daysMovieRented > BASE_REGULAR_RENTAL_DAYS) {
            result += (daysMovieRented - BASE_REGULAR_RENTAL_DAYS) * EXTRA_REGULAR_RENTAL_RATE;
        }
        return result;
    }

    @Override
    public int getFrequentRenterPoints(int daysMovieRented) {
        return BASE_REGULAR_RENTER_POINTS;
    }
    
}
