package states;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import products.Product;


public class States {
	public ArrayList <State> states;
	
	public States(){
		
		states = new ArrayList <State>();
		
		states.add(new State("Alabama",0.04));
		states.add(new State("California",0.072));
		states.add(new State("Delaware",0.00));
		states.add(new State("Iowa",0.06));
		states.add(new State("New York",0.04));
		
	}
}
