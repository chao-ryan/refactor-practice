package com.refactor.practice;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import com.refactor.practice.price.ChildrenPrice;
import com.refactor.practice.price.NewReleasePrice;
import com.refactor.practice.price.Price;
import com.refactor.practice.price.RegularPrice;
import com.refactor.practice.statement.HtmlStatement;
import com.refactor.practice.statement.TextStatement;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {
	private Customer customer;
	private String baseline;
	private String htmlBaseline;

	@Before
	public void setUp() throws IOException {
		customer = new Customer("user1", new Vector<Rental>());
		File baselineFile = new File("src/test/java/com/refactor/practice/baseline");
		baseline = FileUtils.readFileToString(baselineFile);
		File htmlBaselineFile = new File("src/test/java/com/refactor/practice/htmlBaseLine");
		htmlBaseline = FileUtils.readFileToString(htmlBaselineFile);
	}

	@Test
	public void should_get_statement_of_rentals() {
		//given
		addRental(customer, "regular movie", new RegularPrice(), 3);
		addRental(customer, "new movie", new NewReleasePrice(), 2);
		addRental(customer, "children movie", new ChildrenPrice(), 5);
		//when
		String textStatement = customer.getStatement(new TextStatement());
		String htmlStatement = customer.getStatement(new HtmlStatement());
		//then
		assertThat(textStatement).isEqualTo(baseline);
		assertThat(htmlStatement).isEqualTo(htmlBaseline);
	}

	private void addRental(Customer customer, String movieTitle, Price moviePrice, int dayRented) {
		Movie movie = new Movie(movieTitle, moviePrice);
		Rental rental = new Rental(movie, dayRented);
		customer.addRental(rental);
	}
}