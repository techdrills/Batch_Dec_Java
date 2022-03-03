package Basic_Java;

public class conditional_statements {

	public static void main(String[] args) {
	
		/*
		 *  Conditional Statement in java
		 *  1. if statment
		 *  2. if else statement
		 *  3. if else if statment
		 */
		
		// ex1. check whether the voter is elgibile for voting or not, age should 18 or more than 18
		
		// if statement
		int voterAge = 20;
		
		if(voterAge >= 18) {
			System.out.println("Voter is elgibile for voting");
		}
		System.out.println("-------------------------------");
		
		// if else statment
		if(voterAge >= 18) {
			System.out.println("Voter is elgibile for voting");
		}
		else {
			System.out.println("Voter is Not elgibile for voting");
		}
		

	}
}
