package products;

import Category.Category;

import java.util.ArrayList;

import static Category.Category.*;

public class Products {
	public Products() {
		super();
		products= new ArrayList<Product>();
		
		products.add(new Product("ADIDAS Czapka", 50.00,CLOTHING));
		products.add(new Product("PAN ADOLF", 5.00,NON_PRESCRIPTION_DRUG));
		products.add(new Product("RUTINOSCORBIN", 6.00,NON_PRESCRIPTION_DRUG));
		products.add(new Product("PIZZA", 3.45,PREPARED_FOOD));
		products.add(new Product("Maka", 1,GROCERUES));
		products.add(new Product("Chleb", 1.5,GROCERUES));
		products.add(new Product("Viagra", 10,PRESCRIPTION_DRUG));
		products.add(new Product("Morfina", 30,PRESCRIPTION_DRUG));
		products.add(new Product("Jabłko", 0.5, GROCERUES));
		products.add(new Product("Spodnie z pewexu", 1299.00,CLOTHING));
		products.add(new Product("SUSHI", 10.00,PREPARED_FOOD));
		products.add(new Product("Bluza Slayera", 6.66,CLOTHING));
		
	}

	public ArrayList <Product> products;
	
}
