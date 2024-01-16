package com.refactor.practice.price;

public class NewReleasePrice implements Price {
    private static final double NEW_RELEASE_RENTAL_RATE = 3;
    private static final int BASE_NEW_RELEASE_RENTAL_DAYS = 1;
    private static final int EXTRA_NEW_RELEASE_RENTER_POINTS = 2;
    private static final int BASE_NEW_RELEASE_RENTER_POINTS = 1;

    @Override
    public double getRentedCharge(int daysMovieRented) {
        return daysMovieRented * NEW_RELEASE_RENTAL_RATE;
    }

    @Override
    public int getFrequentRenterPoints(int daysMovieRented) {
        if (daysMovieRented > BASE_NEW_RELEASE_RENTAL_DAYS) {
            return EXTRA_NEW_RELEASE_RENTER_POINTS;
        }
        return BASE_NEW_RELEASE_RENTER_POINTS;
    }

}
