package zpi;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import zpi.PriceCalc;

public class PriceCalcTest {
	
	@Test
	public void basicCalc() {
		PriceCalc calc = new PriceCalc(205.0, 0.1);
		assertTrue("NetPrice", doublesAreEqual(205.0, calc.getNetPrice()));
		assertTrue("Tax", doublesAreEqual(0.1, calc.getTax()));
		assertTrue("TaxValue", doublesAreEqual(20.5, calc.getTaxValue()));
		assertTrue("GrossPrice", doublesAreEqual(225.5, calc.getGrossPrice()));
	}
	
	@Test
	public void withSetTax() {
		PriceCalc calc = new PriceCalc(205.0, 0.1);
		calc.setTax(0.2);
		assertTrue("NetPrice", doublesAreEqual(205.0, calc.getNetPrice()));
		assertTrue("Tax", doublesAreEqual(0.2, calc.getTax()));
		assertTrue("TaxValue", doublesAreEqual(41.0, calc.getTaxValue()));
		assertTrue("GrossPrice", doublesAreEqual(246.0, calc.getGrossPrice()));
	}
	
	@Test
	public void withSetTaxValue() {
		PriceCalc calc = new PriceCalc(205.0, 0.1);
		calc.setTaxValue(15);
		assertTrue("NetPrice", doublesAreEqual(150.0, calc.getNetPrice()));
		assertTrue("Tax", doublesAreEqual(0.1, calc.getTax()));
		assertTrue("TaxValue", doublesAreEqual(15.0, calc.getTaxValue()));
		assertTrue("GrossPrice", doublesAreEqual(165.0, calc.getGrossPrice()));
	}
	
	@Test
	public void withSetGrossPrice() {
		PriceCalc calc = new PriceCalc(205.0, 0.1);
		calc.setGrossPrice(220.0);
		assertTrue("NetPrice", doublesAreEqual(200.0, calc.getNetPrice()));
		assertTrue("Tax", doublesAreEqual(0.1, calc.getTax()));
		assertTrue("TaxValue", doublesAreEqual(20.0, calc.getTaxValue()));
		assertTrue("GrossPrice", doublesAreEqual(220.0, calc.getGrossPrice()));
	}
	
	private boolean doublesAreEqual(double d1, double d2) {
		return (d1 == d2) || (Math.abs(d1 - d2) < 0.0001);
	}
	
}
