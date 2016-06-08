package products;

import java.util.ArrayList;

public class Products {
	public Products() {
		super();
		products= new ArrayList<Product>();
		
		products.add(new Product("Cort CZ20 BK", 749.00));
		products.add(new Product("Cort KATANA KX5 BKM", 699.00));
		products.add(new Product("Cort Z42 BK", 599.00));
		products.add(new Product("ESP LTD EC-10 BLK KIT", 899.00));
		products.add(new Product("ESP LTD EC-1000 BLK", 3499.00));
		products.add(new Product("ESP LTD EC-1000 VB", 3499.00));
		products.add(new Product("ESP LTD EC-1000 VB Duncan", 3499.00));
		products.add(new Product(" ESP LTD EC-200 TSBS 	ESP LTD EC-200 TSBS", 1369.00));
		products.add(new Product("ESP LTD EC-200 VWS", 1299.00));
		products.add(new Product("ESP LTD EC-256FM LD", 1559.00));
		products.add(new Product("ESP LTD EC-330FM STBSB", 1579.00));
		
	}

	public ArrayList <Product> products;
	
}
