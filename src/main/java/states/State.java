package states;

public class State {
	private String name;
	private double tax;
	
	public State(String name, double tax)
	{
		this.name = name;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}
}
