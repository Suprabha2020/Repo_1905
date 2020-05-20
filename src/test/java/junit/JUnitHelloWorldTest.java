package junit;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitHelloWorldTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void before() {
		System.out.println("Before Test Case ");
	}

	@Test
	public void isGreaterTest() {
		System.out.println("Test");
		//JUnitHelloWorld tester = new JUnitHelloWorld();
		assertTrue("Num 1 is greater than Num 2", JUnitHelloWorld.isGreater(6, 3));
	}

	

	@Test
	public void isLesserTest() {
		System.out.println("Test");
		//JUnitHelloWorld tester = new JUnitHelloWorld();
		assertTrue("Num 1 is lesser than Num 2", JUnitHelloWorld.isLesser(2, 3));
	}

	
	@Test
	public void isEqualTest() {
		System.out.println("Test");
		//JUnitHelloWorld tester = new JUnitHelloWorld();
		assertTrue("Num 1 is equal to Num 2", JUnitHelloWorld.isEqual(6, 6));
	}

	@After
	public void after() {
		System.out.println("After Test Case ");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
