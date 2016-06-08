package zpi;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.*;

import products.Product;
import products.Products;
import states.State;
import states.States;


public class GUI extends JFrame {
	
	Products products = new Products();
	States states = new States();
	JComboBox<Product> gProducts;
	JComboBox<State> gStates;
	JLabel gProductPrice;
	
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
		this.setLayout(new GridLayout(2, 2, 1, 1));
		gProductPrice = new JLabel("");
		gStates = new JComboBox<>();
		gProducts = new JComboBox<>();
		for(Product p : products.products) {
			gProducts.addItem(p);
		}
		for(State s : states.states) {
			gStates.addItem(s);
		}
		this.add(gProducts);
		this.add(gStates);
		this.add(gProductPrice);
	}

	private void main2(String[] args) {
		this.setVisible(true);
	}
	
	
}
