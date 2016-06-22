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
		states.add(new State("Alaska", mapOf(pair(Category.GROCERUES,0.0 ), pair(Category.PREPARED_FOOD, 0.0),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.0),pair(Category.CLOTHING,0.0))));
		states.add(new State("Arizona", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.056),
				pair(Category.PRESCRIPTION_DRUG,0.04),pair(Category.NON_PRESCRIPTION_DRUG,0.056),pair(Category.CLOTHING,0.056))));
		states.add(new State("Arkansas", mapOf(pair(Category.GROCERUES, 0.08), pair(Category.PREPARED_FOOD, 0.065),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.065),pair(Category.CLOTHING,0.065))));
		states.add(new State("California", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.075),
				pair(Category.PRESCRIPTION_DRUG,0.00),pair(Category.NON_PRESCRIPTION_DRUG,0.075),pair(Category.CLOTHING,0.075))));
		states.add(new State("Connecticut", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.0635),
				pair(Category.PRESCRIPTION_DRUG,0.04),pair(Category.NON_PRESCRIPTION_DRUG,0.04),pair(Category.CLOTHING,0.0635))));		
		states.add(new State("Florida", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.09),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.06),pair(Category.CLOTHING,0.06))));		
		states.add(new State("Georgia", mapOf(pair(Category.GROCERUES, 0.04), pair(Category.PREPARED_FOOD, 0.04),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.04),pair(Category.CLOTHING,0.04))));			
		states.add(new State("Delaware", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.0),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.0),pair(Category.CLOTHING,0.0))));
		states.add(new State("Iowa", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.06),
				pair(Category.PRESCRIPTION_DRUG,0.00),pair(Category.NON_PRESCRIPTION_DRUG,0.06),pair(Category.CLOTHING,0.06))));	
		states.add(new State("Missouri", mapOf(pair(Category.GROCERUES, 0.01225), pair(Category.PREPARED_FOOD, 0.04225),
				pair(Category.PRESCRIPTION_DRUG,0.04225),pair(Category.NON_PRESCRIPTION_DRUG,0.04225),pair(Category.CLOTHING,0.04225))));
		states.add(new State("New York", mapOf(pair(Category.GROCERUES, 0.00), pair(Category.PREPARED_FOOD, 0.04),
				pair(Category.PRESCRIPTION_DRUG,0.00),pair(Category.NON_PRESCRIPTION_DRUG,0.0),pair(Category.CLOTHING,0.0))));
		states.add(new State("North Carolina", mapOf(pair(Category.GROCERUES, 0.02), pair(Category.PREPARED_FOOD, 0.085),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.0475),pair(Category.CLOTHING,0.0475))));
		states.add(new State("Ohio", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.0575),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.0575),pair(Category.CLOTHING,0.0575))));
		states.add(new State("Kansas", mapOf(pair(Category.GROCERUES, 0.0615), pair(Category.PREPARED_FOOD, 0.0615),
				pair(Category.PRESCRIPTION_DRUG,0.0615),pair(Category.NON_PRESCRIPTION_DRUG,0.0615),pair(Category.CLOTHING,0.0615))));
		states.add(new State("Texas", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.0625),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.0),pair(Category.CLOTHING,0.0625))));
		states.add(new State("Wisconsin", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.05),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.05),pair(Category.CLOTHING,0.05))));
		states.add(new State("Wyoming", mapOf(pair(Category.GROCERUES, 0.0), pair(Category.PREPARED_FOOD, 0.04),
				pair(Category.PRESCRIPTION_DRUG,0.0),pair(Category.NON_PRESCRIPTION_DRUG,0.04),pair(Category.CLOTHING,0.04))));
	}
}
