package zpi;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
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
import Category.Category;

public class GUI extends JFrame {
	
	Products products = new Products();
	States states = new States();
	JComboBox<Product> gProducts;
	JComboBox<State> gStates;
	JFormattedTextField gProductPrice;
	JFormattedTextField gTaxValue;
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
		gTaxValue = new JFormattedTextField(PRICE_FMT);
		gTaxValue.setFocusLostBehavior(JFormattedTextField.COMMIT_OR_REVERT);
		gGrossPrice = new JFormattedTextField(PRICE_FMT);
		gGrossPrice.setFocusLostBehavior(JFormattedTextField.COMMIT_OR_REVERT);
		gProductPrice.addFocusListener(new FocusListener() {
			@Override public void focusLost(FocusEvent e) { GUI.this.calcWithNewProductPrice(); }
			@Override public void focusGained(FocusEvent e) { }
		});
		gTaxValue.addFocusListener(new FocusListener() {
			@Override public void focusLost(FocusEvent e) { GUI.this.calcWithNewTaxValue(); }
			@Override public void focusGained(FocusEvent e) { }
		});
		gGrossPrice.addFocusListener(new FocusListener() {
			@Override public void focusLost(FocusEvent e) { GUI.this.calcWithNewGrossPrice(); }
			@Override public void focusGained(FocusEvent e) { }
		});
		gStates = new JComboBox<>();
		gProducts = new JComboBox<>();
		for(Product p : products.products) {
			gProducts.addItem(p);
		}
		for(State s : states.states) {
			gStates.addItem(s);
		}
		setCurrentProduct((Product)gProducts.getSelectedItem());
		setCurrentState((State)gStates.getSelectedItem());
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
		this.add(gTaxValue);
		this.add(gGrossPrice);
	}

	private void main2(String[] args) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void setCurrentProduct(Product p) {
		currentProduct = p;
		setValues();
	}
	
	private void setCurrentState(State s) {
		currentState = s;
		setValues();
	}
	
	private double currentTax() {
		if(currentState == null)
			return 0.0;
		Category category = Category.GITARA;
		Double tax = currentState.getTax(category);
		return (tax == null ? 0.0 : tax.doubleValue());
	}
	
	private void setValues() {
		if(currentProduct == null || currentState == null)
			return;
		double netPrice = currentProduct.getPrice();
		double tax = currentTax();
		double taxValue = netPrice * tax;
		double grossPrice = netPrice + taxValue;
		gProductPrice.setValue(netPrice);
		gTaxValue.setValue(taxValue);
		gGrossPrice.setValue(grossPrice);
	}
	
	private void calcWithNewProductPrice() {
		;
	}
	
	private void calcWithNewTaxValue() {
		;
	}
	
	private void calcWithNewGrossPrice() {
		;
	}
	
}
