package states;

import org.junit.Assert;
import org.junit.Test;
import Category.Category;

public class StateTest {
	
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
