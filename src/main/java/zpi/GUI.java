package zpi;
import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI {
	
	public static void main(String[] args) {
		GUI gui = new GUI();
//		gui.main2(args);
		gui.main3(args);
	}

	public void main2(String[] args) {
		
		double price;
		double tax;
		int flag = 0;
		// TODO Auto-generated method stub
		while(flag != 1)
		{
			showAllProducts();
			price = chooseProduct();
			showAllStates();
			tax = chooseState();
			
			PriceCalc calc = new PriceCalc(price, tax);
			System.out.println("Overall price equals: " + calc.Count() + "\n");
			System.out.println("Continue? \n 1 - exit \t 0 - continue\n");
			Scanner klaw = new Scanner(System.in);
			flag = klaw.nextInt();
		}
		
		
		
	}
	
	
	public void main3(String[] args) {
		JFrame frame = new JFrame("zpi prototype");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JLabel label = new JLabel("This is a label!");
		JButton button = new JButton();
		button.setText("Press me");
		panel.add(label);
		panel.add(button);

		frame.add(panel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	
	
	public void showAllProducts()
	{
		
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
