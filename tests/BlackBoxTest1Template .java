import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class BlackBoxTest1Template {

	@Test
	void testGAEx1_GAEy1() {
		Color expected = Color.RED;
		int x = -10;
		int y = -1;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testGAEx1_GAEy2() {
		Color expected = Color.YELLOW;
		int x = -10;
		int y = 4;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
		//zwingt zu failen
		//fail("not implemented yet");
	}

	@Test
	void testGAEx1_GAEy3() {
		Color expected = Color.YELLOW;
		int x = -10;
		int y = 60;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testGAEx1_UGAEy1() {
		Color expected = null;
		int x = -10;
		int y = -10;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testGAEx1_UGAEy2() {
		Color expected = null;
		int x = -10;
		int y = 102;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testGAx2xGAy1() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.YELLOW;
		int x = 50;
		int y = -1;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testGAx2xGAy2() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.YELLOW;
		int x = 50;
		int y = 4;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testGAx2xGAy3() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.YELLOW;
		int x = 50;
		int y = 60;

		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testGAx2xUAy1() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 50;
		int y = -5;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testGAx2xUAy2() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 50;
		int y = 110;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testGAx3xGAy1() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.YELLOW;
		int x = 108;
		int y = -1;

		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testGAx3xGAy2() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.YELLOW;
		int x = 108;
		int y = 4;

		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testGAx3xGAy3() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.GREEN;
		int x = 108;
		int y = 60;

		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testGAx3xUAy1() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 108;
		int y = -5;

		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);

	}

	@Test
	void testGAx3xUAy2() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 108;
		int y = 110;

		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);

	}

	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(BlackBox1.evalEqClasses(), "Not all equivalence classes covert!");
	}

	//-----------------------
	@Test
	void test_ux2_uy1() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 300;
		int y = -100;

		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);

	}

	@Test
	void test_ux2_uy2() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 300;
		int y = 300;

		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);

	}

	@Test
	void test_ux2_gy1() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 300;
		int y = -1;

		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);

	}

	@Test
	void test_ux2_gy2() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 300;
		int y = 5;

		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);

	}

	@Test
	void test_ux2_gy3() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = 300;
		int y = 50;

		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);

	}

	//-----------------------
	@Test
	void ungueltigeAequivalenzklassex1_mit_UAey1() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -30;
		int y = -10;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void ungueltigeAequivalenzklassex1_mit_UAey2() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -30;
		int y = 110;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void ungueltigeAequivalenzklassex1_mit_GAey1() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -30;
		int y = -1;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void ungueltigeAequivalenzklassex1_mit_GAey2() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -30;
		int y = 5;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void ungueltigeAequivalenzklassex1_mit_GAey3() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = null;
		int x = -30;
		int y = 50;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}
}
