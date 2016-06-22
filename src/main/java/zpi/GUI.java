package zpi;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.ParseException;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Category.Category;
import products.Product;
import products.Products;
import states.State;
import states.States;

public class GUI extends JFrame {

	Products products = new Products();
	States states = new States();
	JComboBox<Product> gProducts;
	JComboBox<State> gStates;
	JLabel gCategory;
	JLabel gTax;
	JFormattedTextField gProductPrice;
	JFormattedTextField gTaxValue;
	JFormattedTextField gGrossPrice;
	Product currentProduct;
	State currentState;
	PriceCalc currentPriceCalc;

	static final Format PRICE_FMT = new DecimalFormat("0.00");

	public static void main(final String[] args) {
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
		this.setSize(512, 256);
		Container content = this.getContentPane();
		content.setLayout(new GridLayout(5, 2));
		gCategory = new JLabel();
		gTax = new JLabel();
		gProductPrice = new JFormattedTextField(PRICE_FMT);
		gProductPrice.setFocusLostBehavior(JFormattedTextField.COMMIT_OR_REVERT);
		gTaxValue = new JFormattedTextField(PRICE_FMT);
		gTaxValue.setFocusLostBehavior(JFormattedTextField.COMMIT_OR_REVERT);
		gGrossPrice = new JFormattedTextField(PRICE_FMT);
		gGrossPrice.setFocusLostBehavior(JFormattedTextField.COMMIT_OR_REVERT);
		gProductPrice.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				GUI.this.calcWithNewProductPrice();
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		gTaxValue.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				GUI.this.calcWithNewTaxValue();
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		gGrossPrice.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				GUI.this.calcWithNewGrossPrice();
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		gStates = new JComboBox<>();
		gProducts = new JComboBox<>();
		for (Product p : products.products) {
			gProducts.addItem(p);
		}
		for (State s : states.states) {
			gStates.addItem(s);
		}
		setCurrentProduct((Product) gProducts.getSelectedItem());
		setCurrentState((State) gStates.getSelectedItem());
		gProducts.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					Object item = e.getItem();
					GUI.this.setCurrentProduct((Product) item);
				}
			}
		});
		gStates.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					Object item = e.getItem();
					GUI.this.setCurrentState((State) item);
				}
			}
		});
		content.add(gProducts);
		content.add(gCategory);
		content.add(gStates);
		content.add(gTax);
		content.add(new JLabel("Cena netto:", JLabel.RIGHT));
		content.add(gProductPrice);
		content.add(new JLabel("Kwota podatku:", JLabel.RIGHT));
		content.add(gTaxValue);
		content.add(new JLabel("Cena brutto:", JLabel.RIGHT));
		content.add(gGrossPrice);
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
		if (currentProduct == null || currentState == null)
			return 0.0;
		Category category = currentProduct.getCategory();
		Double tax = currentState.getTax(category);
		return (tax == null ? 0.0 : tax.doubleValue());
	}
	
	private void setFields() {
		gProductPrice.setValue(currentPriceCalc.getNetPrice());
		gTaxValue.setValue(currentPriceCalc.getTaxValue());
		gGrossPrice.setValue(currentPriceCalc.getGrossPrice());
	}

	private void setValues() {
		if (currentProduct == null || currentState == null)
			return;
		Category category = currentProduct.getCategory();
		double netPrice = currentProduct.getPrice();
		double tax = currentTax();
		currentPriceCalc = new PriceCalc(netPrice, tax);
		gCategory.setText(category.toString());
		gTax.setText(String.format("%.2f%%", tax * 100));
		setFields();
	}

	private double getFieldValue(JFormattedTextField field) throws ParseException {
		field.commitEdit();
		return ((Number)field.getValue()).doubleValue();
	}

	private void calcWithNewProductPrice() {
		try {
			if (currentProduct == null || currentState == null)
				return;
			double netPrice = getFieldValue(gProductPrice);
			currentPriceCalc.setNetPrice(netPrice);
			setFields();
		} catch (Exception e) {
		}
	}

	private void calcWithNewTaxValue() {
		try { 
			if (currentProduct == null || currentState == null)
				return;
			double taxValue = getFieldValue(gTaxValue);
			currentPriceCalc.setTaxValue(taxValue);
			setFields();
		} catch (Exception e) {
		}
	}

	private void calcWithNewGrossPrice() {
		try {
			if (currentProduct == null || currentState == null)
				return;
			double grossPrice = getFieldValue(gGrossPrice);
			currentPriceCalc.setGrossPrice(grossPrice);
			setFields();
		} catch (Exception e) {
		}
	}

}
