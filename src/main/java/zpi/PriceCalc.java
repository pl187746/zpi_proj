package zpi;

public class PriceCalc {
	private double price;
	private double tax;
	
	public PriceCalc(double price, double tax)
	{
		this.price = price;
		this.tax = tax;
	}
	
	public double Count()
	{
		
		return tax*price;
	}
	
}
