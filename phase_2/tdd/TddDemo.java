package com.app.TDD.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPopulationSearch {

	@Test
	public void findpopulation() {

		String city = "Mumbai";

		int ExpectedPopulation = 2000000;

		PopulationSearch ps = new PopulationSearch();

		// number of people in the city

		int count = ps.getPopulation(city);

		System.out.println(count);

		Assert.assertEquals(count, ExpectedPopulation);

	}

	@Test
	public void findpopulationEmptyInput() {

		try {
			String city = "";
			int ExpectedPopulation = 0;
			PopulationSearch ps = new PopulationSearch();

			int count = ps.getPopulation(city);

		} catch (NullPointerException e) {

			System.out.println("City name cannot be empty");
		}

	}

	@Test
	public void findpopulationInvalidInput() {

		try {
			String city = "Ahmedabad";
			int ExpectedPopulation = 7000000;
			PopulationSearch ps = new PopulationSearch();

			int count = ps.getPopulation(city);

		} catch (NullPointerException e) {

			System.out.println("City name does not exist in the list");
		}

	}

}