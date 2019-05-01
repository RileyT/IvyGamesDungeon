/**
 *  Application: IvyGames_SoftwareProduct
 *  Description: Take user through a 'choose your own adventure' style story.  
 *  Title:       SoftwareProduct
 *  Authors:     Riley Tucker,  Aiden Hutton,  Karen Stackhouse,  Christopher Fields

 *  Version:     1.0
 *  Date:        4/5/2019
 *  Description: This class calculates the constitution, strength, and dexterity 
                 scores for a Boss enemy.
 *  Assignment:  SDEV265  System - Software Analysis and Projects
 * 
 */
package semesterproject;


public class Boss extends FantasyRace {

    // variables
	// between 6-25, 11-30, 6-25
    int constituton = (int) ((Math.random()*((20-1)+1))+1) + 5;
    int strength = (int) ((Math.random()*((20-1)+1))+1) + 10;
    int dexterity = (int) ((Math.random()*((20-1)+1))+1) + 5;

    // create boss
    Boss() {
        super();
    }

    public void setBossStats() {
        setEnemyHealth(constituton * 10);
        setEnemyAttackPower(strength);
        setEnemySpeed(dexterity);
    } 
}
