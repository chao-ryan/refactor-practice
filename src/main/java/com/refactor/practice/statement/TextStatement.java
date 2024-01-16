package com.refactor.practice.statement;

public class TextStatement implements Statement {

    @Override
    public String formatHeader(String customerName) {
        return "Rental Record for " + customerName + "\n";
    }

    @Override
    public String formatContent(String title, double amount) {
        return "\t" + title + "\t" + String.valueOf(amount) + "\n";
    }

    @Override
    public String formatFooter(double totalAmount, int frequentRenterPoints) {
        return "Amount owed is " + String.valueOf(totalAmount) + "\n" +
               "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
    }
    
}
