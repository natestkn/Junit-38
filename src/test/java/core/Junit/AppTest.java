package core.Junit;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

import org.junit.Test;

public class AppTest {
	
	public static String s = "Testing JUnit 4";

	public static Integer i = 55;

	public static Boolean t = true;

	public static Boolean f = false;	
	

@BeforeClass

public static void beforeClass() throws Exception {

// System.out.println("BeforeClass method will be executed before first test method starts");
}

@AfterClass
public static void afterClass() throws Exception {
// System.out.println("AfterClass method will be executed after last test method completed");
}

@Before
public void before() throws Exception {
// System.out.println("Before method will execute before every test method");
}

@After
public void after() throws Exception {
// System.out.println("After method will execute after every test method");
}

@Test
public void test_01_assertEquals_Positive() {
// System.out.println("Test_01_assertEquals_Positive");
	assertEquals("String not the same", "Testing JUnit 4", AppTest.s);
}

@Test
public void test_02_assertEquals_Negative() {
// System.out.println("Test_02_assertEquals_Negative");
	assertEquals("String not the same", "Testing JUnit 4", AppTest.s);
}

@Ignore
@Test
public void test_03_assertEquals_Ignored() {
// System.out.println("Test_03_assertEquals_Ignored");
	assertEquals("String not the same", "Testing JUnit 4", AppTest.s);
}

@Test
public void test_04_AssertSame_Positive() {
// System.out.println("Test_04_AssertSame_Positive");
	assertSame("Integer not the same.", 55,AppTest.i);
	}

@Test
public void test_05_AssertSame_Negative() {
// System.out.println("Test_05_AssertSame_Negative");
	assertSame("Integer not the same.", 55,AppTest.i);
}

@Ignore
@Test
public void test_06_AssertSame_Ignored() {
// System.out.println("Test_06_AssertSame_Ignored");
	assertSame("Integer not the same.", 55,AppTest.i);
}

@Test
public void test_07_assertFalse_Positive() {
// System.out.println("Test_07_assertFalse_Positive");
	assertFalse("Boolean should be false", AppTest.f);
}

@Test
public void test_08_assertFalse_Negative() {
// System.out.println("Test_08_assertFalse_Negative");
	assertFalse("Boolean should be false", AppTest.t);
	}


@Test
public void test_09_assertTrue_Positive() {
// System.out.println("Test_09_assertTrue_Positive");
	assertTrue("Boolean should be true", AppTest.t);
	
}

@Test
public void test_10_assertTrue_Negative() {
	assertTrue("Boolean should be true", AppTest.f);
	
}

}



    