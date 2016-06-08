package zpi;
import java.util.Scanner;
import javax.swing.*;

import products.Product;
import products.Products;


public class GUI extends JFrame {
	
	Products products = new Products();
	JComboBox<Product> gProducts;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				GUI.start(args);
			}
		});
	}
	
	private static void start(String[] args) {
		GUI gui = new GUI();
		gui.main2(args);
	}
	
	private GUI() {
		gProducts = new JComboBox<>();
		for(Product p : products.products) {
			gProducts.addItem(p);
		}
		this.add(gProducts);
	}

	public void main2(String[] args) {
		this.setVisible(true);
	}
	
	
}
