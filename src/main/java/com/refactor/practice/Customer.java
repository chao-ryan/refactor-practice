package com.refactor.practice;

import java.util.Enumeration;
import java.util.Vector;

import com.refactor.practice.statement.Statement;

public class Customer {
	private String name;
	private Vector<Rental> rentals;

	public Customer(String name, Vector<Rental> rentals) {
		this.name = name;
		this.rentals = rentals;
	}

	public String getName() {
		return name;
	}

	public void addRental(Rental arg) {
		this.rentals.add(arg);
	}

	public String getStatement(Statement statement) {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration<Rental> rentals = this.rentals.elements();
		String result = statement.formatHeader(getName());
		while (rentals.hasMoreElements()) {
			Rental rental = (Rental) rentals.nextElement();
			//add amounts for each line
			double rentedAmount = rental.getMovie().getPrice().getRentedCharge(rental.getDaysRented());
			totalAmount += rentedAmount;
			//add frequent renter points
			frequentRenterPoints += rental.getMovie().getPrice().getFrequentRenterPoints(rental.getDaysRented());
			//show figures for this rental
			result += statement.formatContent(rental.getMovie().getTitle(), rentedAmount);
		}
		//add footer lines
		result += statement.formatFooter(totalAmount, frequentRenterPoints);
		return result;
	}
}
