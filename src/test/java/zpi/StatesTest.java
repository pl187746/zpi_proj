package zpi;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.*;

import states.State;
import states.States;


public class StatesTest {

	private static ArrayList<State> statesList;
          
	@BeforeClass
	public static void start() {
		System.out.println("StatesTest");	
		statesList = new States().states;
	}
	
	
	@Test
	public void greaterThanZeroElementsTester() {
		assertTrue(statesList.size() > 0);
	}
	
	
	@Test
	public void productExistTester() {
		boolean flag = false;
		for (State s: statesList) {
		    if (s.getName() == "Alabama")
		    	flag = true;
		}
		assertTrue(flag);
	}
	


	
	
}

