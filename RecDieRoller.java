/**
* Class Description
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #
* Fall 2023
*/

import java.util.Random;

public class RecDieRoller {
	public int roll() {
		Random die = new Random();
		return(die.nextInt(6)+1);
	}
}
