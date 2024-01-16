package com.refactor.practice;

import com.refactor.practice.price.Price;

public class Movie {

	private String title;
	private Price price;

	public Movie(String title, Price price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}

	public Price getPrice() {
		return this.price;
	}
}
