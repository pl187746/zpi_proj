package zpi;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
	Product currentProduct;
	State currentState;
	
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
		gProducts.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					Object item = e.getItem();
					GUI.this.setCurrentProduct((Product)item);
				}
			}
		});
		gStates.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					Object item = e.getItem();
					GUI.this.setCurrentState((State)item);
				}
			}
		});
		this.add(gProducts);
		this.add(gStates);
		this.add(gProductPrice);
	}

	private void main2(String[] args) {
		this.setVisible(true);
	}
	
	private void setCurrentProduct(Product p) {
		currentProduct = p;
	}
	
	private void setCurrentState(State s) {
		currentState = s;
	}
	
}
