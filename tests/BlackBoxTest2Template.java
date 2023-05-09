import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class BlackBoxTest2Template {

	/*
	vier gültige Aquivalenzklassen
		Aq1 -> x
		Aq2 -> x
		Aq3 -> y
		Aq4 -> y
	vier ungültige Aquivalenzklassen
		uAq1 -> x
		uAq2 -> x
		uAq3 -> y
		uAq4 -> y
	boolische Fälle
		t -> true
		f -> false
	 */

	// ------- ungültige Testfälle, da x hinten außerhalb der Range ------

	@Test
	void uAq2uAq3t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 20;
		int y = -5;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq2uAq3f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 20;
		int y = -5;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq2Aq3t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 20;
		int y = -1;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq2Aq3f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 20;
		int y = -1;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq2Aq4t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 20;
		int y = 1;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq2Aq4f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 20;
		int y = 1;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq2uAq4t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 20;
		int y = 5;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq2uAq4f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 20;
		int y = 5;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	// ------- ungültige Testfälle, da y außerhalb der Range ------

	@Test
	void Aq1uAq3t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 5;
		int y = -5;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq1uAq3f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 5;
		int y = -5;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq1uAq4t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 5;
		int y = 5;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq1uAq4f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 5;
		int y = 5;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq2uAq3t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 15;
		int y = -5;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq2uAq3f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 15;
		int y = -5;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq2uAq4t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 15;
		int y = 5;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq2uAq4f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 15;
		int y = 5;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	// ------- ungültige Testfälle, da x vorne außerhalb der Range ------

	@Test
	void uAq1uAq3t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -5;
		int y = -5;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq1uAq3f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -5;
		int y = -5;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq1Aq3t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -5;
		int y = -1;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq1Aq3f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -5;
		int y = -1;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq1Aq4t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -5;
		int y = 1;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq1Aq4f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -5;
		int y = 1;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq1uAq4t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -5;
		int y = 5;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void uAq1uAq4f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -5;
		int y = 5;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	// ------- gültige Testfälle ------

	@Test
	void Aqu1Aq3t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.YELLOW;
		int x = 5;
		int y = -1;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq1Aq3f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.YELLOW;
		int x = 5;
		int y = -1;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq1Aq4t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.RED;
		int x = 5;
		int y = 1;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq1Aq4f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.YELLOW;
		int x = 5;
		int y = 1;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq2Aq3t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.YELLOW;
		int x = 15;
		int y = -1;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq2Aq3f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.GREEN;
		int x = 15;
		int y = -1;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq2Aq4t() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.YELLOW;
		int x = 15;
		int y = 1;
		boolean b = true;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	@Test
	void Aq2Aq4f() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.GREEN;
		int x = 15;
		int y = 1;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
	}

	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(BlackBox2.evalEqClasses(), "Not all equivalence classes covert!");
	}

}
