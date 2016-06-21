package zpi;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.text.Format;
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
	JFormattedTextField gProductPrice;
	JFormattedTextField gGrossPrice;
	Product currentProduct;
	State currentState;
	
	static final Format PRICE_FMT = new DecimalFormat("0.00");
	
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
		gProductPrice = new JFormattedTextField(PRICE_FMT);
		gProductPrice.setFocusLostBehavior(JFormattedTextField.COMMIT_OR_REVERT);
		gGrossPrice = new JFormattedTextField(PRICE_FMT);
		gGrossPrice.setFocusLostBehavior(JFormattedTextField.COMMIT_OR_REVERT);
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
		this.add(gGrossPrice);
	}

	private void main2(String[] args) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void setCurrentProduct(Product p) {
		currentProduct = p;
	}
	
	private void setCurrentState(State s) {
		currentState = s;
	}
	
}
