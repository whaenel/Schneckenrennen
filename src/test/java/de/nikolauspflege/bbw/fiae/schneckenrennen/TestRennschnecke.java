package de.nikolauspflege.bbw.fiae.schneckenrennen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestRennschnecke {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testKrieche() {
		Rennschnecke renn = new Rennschnecke("Flinki", "SuperRenner", 2d);
		renn.krieche();
		
	}

	@Test
	void testRennschnecke() {
		Rennschnecke renn = new Rennschnecke("Flinki", "SuperRenner", 2d);
		assert (renn.name.equals("Flinki"));
	}

	@Test
	void testToString() {
		Rennschnecke renn = new Rennschnecke("Flinki", "SuperRenner", 2d);
		System.out.println(renn.toString());
		assertTrue ( renn.toString().contains("Flinki"), "toString not returning expected result");
	}

}
