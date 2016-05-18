package zpi;
import java.util.Scanner;


public class GUI {
	
	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.main2(args);
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
