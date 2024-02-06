/*
 * Jonathan Peters
 * Using this class as a main to run the basic gameplay loop
 */
import java.util.*;
/**
 *
 * @author Jonathan Peters
 */
public class Main {
    public static void main(String[] args) {
        // Main class
        int turn;
        int money;//Not currently used, but could be useful in a future version of the game
        
        //Filler item, hardcoded because I cant think of a proper solution right now 
        RealItems filler = new RealItems("Blank", 1, "Does nothing", false, false, false, false, false, false);
        //Making the 2 robots, they have 25hp as of now so games dont last too long
        Robot user = new Robot(null, null, null, 30, 1, 1, 0, 0);
        Robot enemy = new Robot(null, null, null, 30, 1, 1, 0, 0);

        //while loop for gameplay that continues until the user quits the program
        while (1==1) {
           //Main menu
           user.mainMenu();
           
           //Setting the variables needed
           turn = 0;
           boolean toBattle = false; 
           //Resetting the stats, will be useful when I put the whole game in a while loop 
           user.resetStats();
           enemy.resetStats();  
           user.changeItem(filler); //Adding the item 'filler' to avoid checking a null value
           boolean dead = false;
           //Going to use a basic gameplay loop where you buy something and roll 5 times before fighting
           while (dead == false) { //While both the enemy and you are alive
               System.out.println("\n\n\n\n\n\n---Buy Phase---");
               
               turn += 1; //Increasing the turn
               //Checking if there is a new tier and outputting it for the user
               if (turn == 1) {
                 System.out.println("TIER ONE");
               }
               else if (turn == 4) {
                 System.out.println("TIER TWO");
               }
               else if (turn == 7) {
                 System.out.println("TIER THREE");
               }

               for (int i = 0; i < 2; i++) { //Purchase phase where you buy items, weapons, armor etc
                  toBattle = user.roll(turn);
                  if (toBattle == true) {
                     break;
                  }
               }
               enemy.enemyBotWeapons(turn); //Building the enemy robot
               
               //Battling the enemy robot
               System.out.println("\n\n\n\n\n\n---Battle Phase---");
               user.battle(user, enemy, turn);
               if (user.getHp() < 1) {
                 dead = true;
                 break;
               }
               else if (enemy.getHp() < 1) {
                 dead = true;
                 break;

               }
               

           }
                 
        }

        
    }

}
