package zpi;

public class PriceCalc {
	
	private double tax;
	private double netPrice;
	private double taxValue;
	private double grossPrice;
	
	public PriceCalc(double netPrice, double tax) {
		this.netPrice = netPrice;
		this.tax = tax;
		calcTaxAndGross();
	}

	public double getTax() {
		return tax;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public double getTaxValue() {
		return taxValue;
	}

	public double getGrossPrice() {
		return grossPrice;
	}

	public void setTax(double tax) {
		this.tax = tax;
		calcTaxAndGross();
	}

	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
		calcTaxAndGross();
	}

	public void setTaxValue(double taxValue) {
		if(this.tax == 0.0)
			return;
		this.taxValue = taxValue;
		this.netPrice = taxValue / tax;
		this.grossPrice = this.netPrice + taxValue;
	}

	public void setGrossPrice(double grossPrice) {
		this.grossPrice = grossPrice;
		this.netPrice = grossPrice / (1.0 + this.tax);
		this.taxValue = grossPrice - this.netPrice;
	}
	
	private void calcTaxAndGross() {
		this.taxValue = this.netPrice * tax;
		this.grossPrice = this.netPrice + this.taxValue;
	}
	
}
