package states;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import Category.Category;

public class State {
	private String name;
	private Map<Category, Double> taxes;
	
	public State(String name, Map<Category, Double> taxes)
	{
		this.name = name;
		this.taxes = new HashMap<>(taxes);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTax(Category category, double value) {
		this.taxes.put(category, value);
	}

	public Double getTax(Category category) {
		return taxes.get(category);
	}
	
	public Map<Category, Double> getTaxes() {
		return Collections.unmodifiableMap(taxes);
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
