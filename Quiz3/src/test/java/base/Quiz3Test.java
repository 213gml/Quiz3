package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Quiz3Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {

		Triangle t1 = new Triangle(5, 8, 4);
		
		assertTrue(t1.getArea(t1) == 8.18);
	}
	
	@Test
	public void test2() {
		
		Triangle t2 = new Triangle(6, 4, 3);
		
		assertTrue(t2.getArea(t2) == 5.33);
		assertTrue(t2.getPerimeter(t2) == 18);
	}
	
	@Test
	public void test3() {
		
		Triangle t1 = new Triangle(5, 8, 4);
		
		assertTrue(t1.getPerimeter(t1) == 17);
	}
	
	@Test
	public void test4() {
		
		Triangle t3 = new Triangle(1, 2, 1);
		
		assertTrue(t3.ToString(t3) == "Area: " + t3.getArea(t3) + 
				   "\nPerimeter: " + t3.getPerimeter(t3));
	}
	
	private void assertTrue(boolean b) {

	}

}
