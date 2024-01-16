package com.refactor.practice.price;

public class ChildrenPrice implements Price {
    private static final double BASE_CHILDREN_RENTAL_FEE = 1.5;
    private static final int BASE_CHILDREN_RENTAL_DAYS = 3;
    private static final double EXTRA_CHILDREN_RENTAL_RATE = 1.5;
    private static final int BASE_CHILDREN_RENTER_POINTS = 1;

    @Override
    public double getRentedCharge(int daysMovieRented) {
        double result = BASE_CHILDREN_RENTAL_FEE;
        if (daysMovieRented > BASE_CHILDREN_RENTAL_DAYS) {
            result += (daysMovieRented - BASE_CHILDREN_RENTAL_DAYS) * EXTRA_CHILDREN_RENTAL_RATE;
        }
        return result;
    }

    @Override
    public int getFrequentRenterPoints(int daysMovieRented) {
        return BASE_CHILDREN_RENTER_POINTS;
    }

}
