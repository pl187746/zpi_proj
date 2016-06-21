package states;

import static zpi.Pair.mapOf;
import static zpi.Pair.pair;

import java.util.ArrayList;

import Category.Category;


public class States {
	public ArrayList <State> states;
	
	public States(){
		
		states = new ArrayList <State>();
		
		states.add(new State("Alabama", mapOf(pair(Category.GITARA, 0.04), pair(Category.SKRZYPCE, 0.01))));
		states.add(new State("California", mapOf()));
		states.add(new State("Delaware", mapOf()));
		states.add(new State("Iowa", mapOf()));
		states.add(new State("New York", mapOf()));
		
	}
}
