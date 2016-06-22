package states;

import static zpi.Pair.mapOf;
import static zpi.Pair.pair;

import java.util.ArrayList;

import Category.Category;


public class States {
	public ArrayList <State> states;

	
	public States(){
		
		states = new ArrayList <State>();
		
		states.add(new State("Alabama", mapOf(pair(Category.GROCERUES, 0.04), pair(Category.PREPARED_FOOD, 0.04),
				pair(Category.PRESCRIPTION_DRUG,0.04),pair(Category.NON_PRESCRIPTION_DRUG,0.04),pair(Category.CLOTHING,0.04))));
		states.add(new State("California", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.075),
				pair(Category.PRESCRIPTION_DRUG,0.00),pair(Category.NON_PRESCRIPTION_DRUG,0.075),pair(Category.CLOTHING,0.075))));
		states.add(new State("Delaware", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.0),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.0),pair(Category.CLOTHING,0.0))));
		states.add(new State("Iowa", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.06),
				pair(Category.PRESCRIPTION_DRUG,0.00),pair(Category.NON_PRESCRIPTION_DRUG,0.06),pair(Category.CLOTHING,0.06))));
		states.add(new State("New York", mapOf(pair(Category.GROCERUES, 0.00), pair(Category.PREPARED_FOOD, 0.04),
				pair(Category.PRESCRIPTION_DRUG,0.00),pair(Category.NON_PRESCRIPTION_DRUG,0.0),pair(Category.CLOTHING,0.0))));
		states.add(new State("Kansas", mapOf(pair(Category.GROCERUES, 0.0615), pair(Category.PREPARED_FOOD, 0.0615),
				pair(Category.PRESCRIPTION_DRUG,0.0615),pair(Category.NON_PRESCRIPTION_DRUG,0.0615),pair(Category.CLOTHING,0.0615))));
		states.add(new State("Guam", mapOf(pair(Category.GROCERUES, 0.04), pair(Category.PREPARED_FOOD, 0.04),
				pair(Category.PRESCRIPTION_DRUG,0.04),pair(Category.NON_PRESCRIPTION_DRUG,0.04),pair(Category.CLOTHING,0.04))));
		states.add(new State("Montana", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.0),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.0),pair(Category.CLOTHING,0.0))));
		states.add(new State("New Jersey", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.07),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.07),pair(Category.CLOTHING,0.0))));
		
	}
}
