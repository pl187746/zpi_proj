package products;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.*;

import Category.Category;
import products.Product;
import products.Products;
import states.State;
import states.States;
import zpi.Zpi;

public class ProductsTest {

	private static ArrayList<Product> productsList;

	@BeforeClass
	public static void start() {
		System.out.println("ProductsTest\n");
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
		for (Product p : productsList) {
			if (p.getName() == "RUTINOSCORBIN")
				flag = true;
		}
		assertTrue(flag);
	}

	@Test
	public void allCategoryProductsImplemented() {
		Products Products = new Products();
		for (Product product : Products.products) {
			String name = product.getName();
			double price = product.getPrice();
			String category = product.getCategory().name();

			// System.out.println("name:" + name + " c:" + category + " p:" +
			// price);
			Assert.assertNotNull(name);
			Assert.assertNotNull(price);
			Assert.assertNotNull(category);
		}
	}

	@Test
	public void priceTester() {

	}

}
