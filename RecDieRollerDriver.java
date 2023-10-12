/**
* Class Description
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #
* Fall 2023
*/

public class RecDieRollerDriver {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		RecDieRoller myRoller = new RecDieRoller();
		System.out.println("Rolling a new die...");
		int current;
		do {
			current = myRoller.roll();
			System.out.println(current);
		}while(current != 2);
		
		System.out.println("\nRolling 1000 times...");
		int numRolls = 0;
		for(int n = 0; n < 1000; n++) {
			do {
				current = myRoller.roll();
				numRolls++;
			}while(current != 2);
		}
		System.out.println("Total number of rolls: " + numRolls);
		System.out.println("Mean number of rolls to reach 2: " + (numRolls/1000));
	}

}
