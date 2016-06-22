package products;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.*;

import products.Product;
import products.Products;
import zpi.Zpi;


public class ProductsTest {

	private static ArrayList<Product> productsList;
          
	@BeforeClass
	public static void start() {
		System.out.println("@BeforeClass: executed once before all");
		Zpi productMain = new Zpi();
		Products Products = new Products();
		productsList = Products.products;
	}
	
	
	@Test
	public void greaterThanZeroElementsTester() {
		assertTrue(productsList.size() > 0);
	}
	
	
	@Test
	public void productExistTester() {
		boolean flag = false;
		for (Product p: productsList) {
		    if (p.getName()=="RUTINOSCORBIN")
		    	flag = true;
		}
		assertTrue(flag);
	}
	
	
	
	@Test 
	public void priceTester() {

	}

	
	
}

