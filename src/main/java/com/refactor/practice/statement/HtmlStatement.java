package com.refactor.practice.statement;

public class HtmlStatement implements Statement {

    @Override
    public String formatHeader(String customerName) {
        return "<h1>Rentals for <EM>" + customerName + "</EM></h1><br/>";
    }

    @Override
    public String formatContent(String title, double amount) {
        return "<p>" + title +
        ": " + String.valueOf(amount) + "<BR></p><br/>";
    }

    @Override
    public String formatFooter(double totalAmount, int frequentRenterPoints) {
        return "<p>You owe <EM>" + String.valueOf(totalAmount) + "</EM></p><br/>" +
        "<p>On this rental you earned <EM>" + String.valueOf(frequentRenterPoints) +
        "</EM> frequent renter points</p>";
    }
    
}
