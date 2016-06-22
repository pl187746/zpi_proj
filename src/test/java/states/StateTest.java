package states;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import Category.Category;

public class StateTest {
	
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
	
	
	@Test
	public void allCategoryTaxesImplemented() {
		States states = new States();
		for(State state : states.states) {
			for(Category category : Category.values()) {
				Double tax = state.getTax(category);
				String msg = "State: " + state.getName() + " ; Category: " + category.toString();
				Assert.assertNotNull(msg, tax);
			}
		}
	}

}
