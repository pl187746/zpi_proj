package zpi;
import java.util.Scanner;
import javax.swing.*;


public class GUI extends JFrame {
	
	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.main2(args);
	}

	public void main2(String[] args) {
		String[] data = { "aa" };
		JList<String> list = new JList<String>(data);
		
		this.add(list);
		this.setVisible(true);
		double price;
		double tax;
		int flag = 0;

			showAllProducts();
			price = chooseProduct();
			showAllStates();
			tax = chooseState();
			PriceCalc calc = new PriceCalc(price, tax);
		
		
		
	}
	
	public void showAllProducts()
	{
		//String[] data = { Product.getName() };
		//JList<String> list = new JList<String>(data);
	}
	public double chooseProduct()
	{
		return 0;
	}
	
	public void showAllStates()
	{
		
	}
	public double chooseState()
	{
		return (double) 0.1;
	}
	
}
