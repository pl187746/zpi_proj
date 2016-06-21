package zpi;

public class PriceCalc {
	
	private double tax;
	private double netPrice;
	private double taxValue;
	private double grossPrice;
	
	public PriceCalc(double netPrice, double tax) {
		this.netPrice = round2(netPrice);
		this.tax = tax;
		calcTaxAndGross();
	}
	
	private static double round2(double x) {
		return ((long)(x * 100 + 0.5)) / 100.0;
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
		netPrice = round2(netPrice);
		if(this.netPrice == netPrice)
			return;
		this.netPrice = netPrice;
		calcTaxAndGross();
	}

	public void setTaxValue(double taxValue) {
		if(this.tax == 0.0)
			return;
		taxValue = round2(taxValue);
		if(this.taxValue != taxValue)
			setNetPrice(taxValue / tax);
	}

	public void setGrossPrice(double grossPrice) {
		grossPrice = round2(grossPrice);
		if(this.grossPrice != grossPrice)
			setNetPrice(grossPrice / (1.0 + this.tax));
	}
	
	private void calcTaxAndGross() {
		this.taxValue = round2(this.netPrice * tax);
		this.grossPrice = round2(this.netPrice + this.taxValue);
	}
	
}
