package zpi;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.*;

import products.Product;
import products.Products;


public class MainTest {

	private static ArrayList<Product> productsList;
          
	@BeforeClass
	public static void start() {
		System.out.println("@BeforeClass: executed once before all");
		Zpi productMain = new Zpi();
		Products Products = new Products();
		productsList = Products.products;
	}
	
	@Test
	public static void productExistTester() {
		assertTrue(productsList.contains(new String("Cort CZ20 BK")));
	}
	
	@Test
	public static void greaterThanZeroElementsTester() {
		assertTrue(productsList.size() > 0);
	}
	
	@Test 
	public static void priceTester() {

	}

	
	

}

