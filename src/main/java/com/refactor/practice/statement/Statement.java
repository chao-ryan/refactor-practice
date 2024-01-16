package com.refactor.practice.statement;

public interface Statement {
    public String formatHeader(String customerName);
    public String formatContent(String movieTitle, double rentedAmount);
    public String formatFooter(double totalAmount, int frequentRenterPoints);
}
