package zpi;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;

public class MainTest {

	private static ArrayList testList;
          
	@BeforeClass
	public static void start() {
		System.out.println("@BeforeClass: executed once before all");
		Zpi productMain = new Zpi();
	}
	
	@Test
	public static void productExistTester() {
		assertTrue(Arrays.asList(testList).contains(new String("Poland")));
	}
	
	@Test
	public static void numberOfElementsTester() {
		
	}
	
	@Test 
	public static void taxesTester() {
		
	}

	
	

}

