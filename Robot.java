/*
 * Jonathan Peters
 * Main robot class with shop, battle methods and everything else you would need
 */
import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *
 * @author Jonathan Peters
 */
public class Robot {
    private Weapons weaponItem;
    private Armor armorItem;
    private RealItems item;
    private int hp;
    private int damage;
    private int numHits;
    private int armor;
    private int armorPen;
    public int turn;
    public int money;
    
    public Robot(Weapons weaponItem, Armor armorItem, RealItems item, int hp, int damage, int numHits, int armor, int armorPen) {
        this.weaponItem = weaponItem;
        this.armorItem = armorItem;
        this.item = item;
        this.hp = hp;
        this.damage = damage;
        this.numHits = numHits;
        this.armor = armor;
        this.armorPen = armorPen;
    }
    
    //Getters

    /**
    * getWeaponItem
    * 
    * Return weapon of the robot, not the name though
    * @param  
    * returns Weapons
    **/
    public Weapons getWeaponItem() {
        return this.weaponItem;
    }
    
    /**
    * getArmorItem
    * 
    * Return armor of the robot, not the name though
    * @param  
    * returns Armor
    **/
    public Armor getArmorItem() {
        return this.armorItem;
    }
    
    /**
    * getItem
    * 
    * Return real item/stat item of the robot, not the name though
    * @param  
    * returns RealItems
    **/
    public RealItems getItem() {
        return this.item;
    }
    
    /**
    * getHp
    * 
    * Return Hp of the robot
    * @param  
    * returns int
    **/
    public int getHp() {
        return this.hp;
    }
    
    /**
    * getDamage
    * 
    * Return damage of the robot
    * @param  
    * returns int
    **/
    public int getDamage() {
        return this.damage;
    }
    
    /**
    * getNumHits
    * 
    * Return the number of hits of the robot
    * @param  
    * returns int
    **/
    public int getNumHits() {
        return this.numHits;
    }
    
    /**
    * getArmor
    * 
    * Return armor of the robot
    * @param  
    * returns int
    **/
    public int getArmor() {
        return this.armor;
    }
    
    /**
    * getArmorPen
    * 
    * Return armor pen of the robot
    * @param  
    * returns int
    **/
    public int getArmorPen() {
        return this.armorPen;
    }
    
    //Setters

    /**
    * changeWeaponItem
    * 
    * Changing the weapon of the robot
    * @param Weapons 
    * returns @void
    **/
    public void changeWeaponItem(Weapons newWeapon) {
        this.weaponItem = newWeapon;
    }
    
    /**
    * changeArmorItem
    * 
    * Changing the armor of the robot
    * @param Armor 
    * returns @void
    **/
    public void changeArmorItem(Armor newArmor) {
        this.armorItem = newArmor;
    }
    
    /**
    * changeItem
    * 
    * Changing the item of the robot
    * @param Realitems 
    * returns @void
    **/
    public void changeItem(RealItems newItem) {
        this.item = newItem;
    }
    
    /**
    * changeHp
    * 
    * Changing the hp of the robot
    * @param int 
    * returns @void
    **/
    public void changeHp(int newHp) {
        this.hp = newHp;
    }
    
    /**
    * changeDamage
    * 
    * Changing the damage of the robot
    * @param int 
    * returns @void
    **/
    public void changeDamage(int newDmg) {
        this.damage = newDmg;
    }
    
    /**
    * changeNumHits
    * 
    * Changing the number of hits of the robot
    * @param int 
    * returns @void
    **/
    public void changeNumHits(int newNumHits) {
        this.numHits = numHits;
    }
    
    /**
    * changeArmor
    * 
    * Changing the armor of the robot
    * @param int 
    * returns @void
    **/
    public void changeArmor(int newArmor) {
        this.armor = newArmor;
    }
    
    /**
    * changeArmorPen
    * 
    * Changing the armor pen of the robot
    * @param int 
    * returns @void
    **/
    public void changeArmorPen(int newArmorPen) {
        this.armorPen = newArmorPen;
    }
    
    //Methods that do something

    /**
    * roll
    * 
    * Gets the tier of the turn, generates the respective items randomly, and then outputs the shop
    *   the user then gets the option to do one of the options shown to the user, once you do one of the options
    *   the code finishes and returns a boolean set to true if the user wants to go straight to combat 
    * @param int 
    * returns boolean
    **/ 
    public boolean roll(int turn) {
        int tier;
        int answer;
        int[] randNums = new int[4];
        Random rn = new Random();
        
        //Making arrays to hold the shop items, the items will be choosen depending on the tier
        Weapons[] weapons = new Weapons[3];
        Armor[] armor = new Armor[3];
        HealingItems[] stats = new HealingItems[3];
        RealItems[] items = new RealItems[3];
        
        
        //Getting the tier from the turn and setting the 
        if (turn > 0 && turn < 4) {
            //If the tier is one, get the possible items associated with that tier
            tier = 1;
            weapons = Weapons.t1Weapons();
            armor = Armor.t1Armor();
            stats = HealingItems.t1HealingItems();
            items = RealItems.t1RealItems();
        }
        else if(turn > 3 && turn < 7) {
            //Getting the tier 2 items associated with this tier
            tier = 2;
            weapons = Weapons.t2Weapons();
            armor = Armor.t2Armor();
            stats = HealingItems.t2HealingItems();
            items = RealItems.t2RealItems();
        }
        else {
            //Getting the tier 3 items associated with this tier
            tier = 3;
            weapons = Weapons.t3Weapons();
            armor = Armor.t3Armor();
            stats = HealingItems.t3HealingItems();
            items = RealItems.t3RealItems();
        }
        
        //Generating the random numbers to set the shop
        for (int i = 0; i < 4; i++) {
            answer = rn.nextInt(3);
            randNums[i] = answer; //Setting the ith value of randNumns to the random number generated(1 or 2)
        }
        
        //Setting the shop using the random number generated and items associated with the tier
        Weapons w = weapons[randNums[0]];
        Armor a = armor[randNums[1]];
        HealingItems hi = stats[randNums[2]];
        RealItems ri = items[randNums[3]];
        
        try { //Slowing down the output
          Thread.sleep(500);
        } catch(Exception e) {
          System.out.println("Error 101");
        }

        //Printing the shop and the options to the user
        System.out.println("\n1) Weapon: " + w.getName());
        System.out.println("2) Armor: " + a.getName());
        System.out.println("3) Stat Buffs: " + hi.getName());
        System.out.println("4) Items: " + ri.getName());
        System.out.println("5) Roll ");
        System.out.println("6) Continue to Battle");

        try { //Slowing down the output
          Thread.sleep(500);
        } catch(Exception e) {
          System.out.println("Error 101");
        }

        
        System.out.println("\nType the number of the command you want");
        
        /*
        THE PURCHASING ITEMS PART OF THE METHOD
        ESSENTIALLY ITS OWN CLASS BUT COMBINED FOR SIMPLICITY
        */
        Scanner input = new Scanner(System.in);
        String word;
        boolean pass = false;
        boolean[] bought = new boolean[4]; //Once an item is bought, set it to true
        boolean toBattle = false;
        
        for (int i = 0; i < 4; i++) {
            bought[i] = false; //setting each value of the array to false, as in not bought
        }
       
                
        //Getting user input
        word = input.nextLine();
        
        
        while (!pass) { //In here could add a way to check what an item does, but not rn
                /*
                For the items that you can buy in the shop, they all do similar things such as:
                    - equip the item and add the stats
                    - Equiping the item for the robot
                    - Setting the boolean bought to true
                
                To roll you just roll
                
                If you type next
                    - pass = true
                    - Ends both the switch and while loop
                */
                switch (word) { //Using a switch to get the users answer 
                    case "1": //If the user wants the buy the weapon
                        if (bought[0] == false) {
                            changeWeaponItem(w); 
                            equipWeapon(w); //Setting the item to w
                            bought[0] = true; //Setting the weapon to bought
                            System.out.println("You bought the item");
                            System.out.println(w.getName() + ": " + w.getDescription());
                            
                        }
                        else { //if the item has been bought
                            System.out.println("Item already purchased");
                        }
                        break;
                        
                    case "2": //If the user wants the armor
                        if (bought[1] == false) {
                            changeArmorItem(a);
                            equipArmor(a); 
                            bought[1] = true;
                            System.out.println("You bought the item!");
                            System.out.println(a.getName() + ": " + a.getDescription());
                        }
                        else {
                            System.out.println("Item already purchased");
                        }
                        break;
                        
                    case "3": //If they want the stat item
                        if (bought[2] == false) {
                            equipStatItem(hi); //EQuipping the item by adding the stats
                            bought[2] = true;
                            System.out.println("You bought the item!");
                            System.out.println(hi.getName() + ": " + hi.getDescription());
                        }
                        else {
                            System.out.println("Item already purchased");
                        }
                        break;
                        
                    case "4": //If the user wants the item
                        if (bought[3] == false) {
                            changeItem(ri); //Dont need an equip changeItem because it doesnt change the stats of the user
                            bought[3] = true;
                            System.out.println("You bought the item!");
                            System.out.println(ri.getName() + ": " + ri.getDescription());
                        }
                        else {
                            System.out.println("Item already purchased");
                        } 
                        break;
                        
                    case "5": //If the user wants to roll again
                        pass = true;
                        break;
                    case "6": //If the user wants to go to battle
                        pass = true;
                        toBattle = true; //Sen ing the user to battle
                        break;
                    default:
                        System.out.println("Invalid value");
                        break;      
                }
               pass = true; //Need to remove, just stops it from going on forever
         }
         
         return toBattle;
            
    }   

       
    //Method to get the stats from 

    /**
    * equipWeapon
    * 
    * Get a weapon and update the robots stats based on the stats of the weapon, like numhits and damage.
    * @param Weapons 
    * returns @void
    **/
    public void equipWeapon(Weapons w) { //When you buy a new item you lose the stats damage/armor stats you had before, which is intended
        changeDamage(w.getDamage());
        changeNumHits(w.getNumHits());
        changeArmorPen(w.getArmorPen());
        this.weaponItem = w;
    }
    
    /**
    * equipArmor
    * 
    * Get armor and update the robots stats based on the stats of the armor.
    * @param Armor 
    * returns @void
    **/
    public void equipArmor(Armor a) {
        changeArmor(a.getDefence());
        this.armorItem = a;
    }
    
    /**
    * equipStatItem
    * 
    * Get a HealingItem and update the robots stats based on the buffs the item provides.
    * @param Weapons 
    * returns @void
    **/
    public void equipStatItem(HealingItems item) {
        changeHp(item.getHealingBuff() + getHp());
        changeDamage(item.getDamageBuff() + getDamage());
        changeArmor(item.getArmorBuff() + getArmor());
        
    }
    
    /**
    * enemyBotWeapons
    * 
    * Doing something similar to the roll function except the robot buys and equips all of the generated items
    * @param turn 
    * returns @void
    **/
    public void enemyBotWeapons(int turn) {
        //Making arrays to hold the weapons you can get at that tier
        Weapons[] weapons = new Weapons[3];
        Armor[] armor = new Armor[3];
        HealingItems[] stats = new HealingItems[3];
        RealItems[] items = new RealItems[3];
        
        //Creating the variables
        int tier;
        int answer;
        int[] randNums = new int[4];
        Random rn = new Random();
        
        //Getting the tier and setting the shop to the respective tier
        tier = (int)Math.ceil(turn / 3f);
        if (tier < 2) {
            weapons = Weapons.t1Weapons();
            armor = Armor.t1Armor();
            stats = HealingItems.t1HealingItems();
            items = RealItems.t1RealItems();   
        }
        else if (tier == 2) {
            weapons = Weapons.t2Weapons();
            armor = Armor.t2Armor();
            stats = HealingItems.t2HealingItems();
            items = RealItems.t2RealItems();
        }
        else {
            weapons = Weapons.t3Weapons();
            armor = Armor.t3Armor();
            stats = HealingItems.t3HealingItems();
            items = RealItems.t3RealItems();
        }
        
        //Generating random numbers
        for (int i = 0; i < 4; i++) {
            answer = rn.nextInt(3);
            randNums[i] = answer;
        }
        
        //Equipping the weapons on the enemy bot
        changeWeaponItem(weapons[randNums[0]]);
        equipWeapon(getWeaponItem());
        
        //Putting armor on the enemy bot
        changeArmorItem(armor[randNums[1]]);
        equipArmor(getArmorItem());
        
        //Buffing the enemy robots stats
        equipStatItem(stats[randNums[2]]);
        
        //Giving the enemy bot an item
        changeItem(items[randNums[3]]); 
    }
    
    /**
    * battle
    * 
    * Getting the users total damage and the enemy's total damage by looking at damage, items, number of hits, armor and armor pen
    *   and killing the user or enemy if their HP drops below 1
    * @param Robot, Robot, int 
    * returns @void
    **/
    public void battle(Robot user, Robot enemy, int turn) { //So far items have not been added to combat, will do that in sprint 3
        //Creating a variable to hold how much damage each robot is doing to the other
        int userTotalDmg = 0;
        int enemyTotalDmg = 0;
        
        //For loop equal to the number of times your weapon hits, and calculating damage each time
        for (int i = 0; i < user.getNumHits(); i++) {
            userTotalDmg += user.getDamage();
            userTotalDmg -= (enemy.getArmor() - user.getArmorPen());   
        }
        
        //For loop that does the same thing as the previous one but for the enemy robot
        for (int i = 0; i < enemy.getNumHits(); i++) {
            enemyTotalDmg += enemy.getDamage();
            enemyTotalDmg -= (user.getArmor() - enemy.getArmorPen());    
        }
        
        //Getting the user and robots items
        
        //Setting the mimimum damage to 1 per hit
        if (enemyTotalDmg <= 0) {
            enemyTotalDmg = 1 * enemy.getNumHits();
        }
        
        if (userTotalDmg <= 0) {
            userTotalDmg = 1 * user.getNumHits();
        }
        
        //Getting the enemy's items
        //Not allowing the enemy to get all or nothing because they literally cannot win with it
        RealItems r2 = enemy.getItem();
        if (r2 == null) {
            ;
        }
        else if (r2.getThorns() == true) {
            //Deal 1 damage each time the enemy hits you
            enemyTotalDmg += user.getNumHits(); 
        }
        else if (r2.getTurtle() == true) {
            //Both the user and the enemy's damage is halfed
            userTotalDmg = (int)Math.round(userTotalDmg/2);
            enemyTotalDmg = (int)Math.round(userTotalDmg/2);
            System.out.println("The enemy used Turtle!");
        }
        else if (r2.getLifeSteal() == true) {
            //User heals when they hit for half of their damage
            int heal = (int)Math.round(enemyTotalDmg/2);
            enemy.changeHp(enemy.getHp() + heal);
        }
        else if (r2.getWrath() == true) {
            //Both people do double damage
            userTotalDmg = userTotalDmg * 2;
            enemyTotalDmg = enemyTotalDmg * 2;
            System.out.println("The enemy used Wrath!");

        }
        else if (r2.getProtect() == true) {
            //user doesnt take dmg but doesnt attack
            userTotalDmg = 0;
            enemyTotalDmg = 0;
            System.out.println("The enemy used Protect!");
        }
        
        //Getting the users item and its active
        RealItems r = user.getItem();
        if (r == null) {
           ;
        }
        else if (r.getThorns()) { //Cant invoke if you dont buy an item for some reason
            //Deal 1 damage each time the enemy hits you
            userTotalDmg += enemy.getNumHits(); 
        }
        else if (r.getTurtle()) {
            //Both the user and the enemy's damage is halfed
            userTotalDmg = (int)Math.round(userTotalDmg/2);
            enemyTotalDmg = (int)Math.round(userTotalDmg/2);
            System.out.println("The user used Turtle!");
        }
        else if (r.getLifeSteal() == true) {
            //User heals when they hit for half of their damage
            int heal = (int)Math.round(userTotalDmg/2);
            user.changeHp(user.getHp() + heal);
        }
        else if (r.getWrath() == true) {
            //Both people do double damage
            userTotalDmg = userTotalDmg * 2;
            enemyTotalDmg = enemyTotalDmg * 2;
            System.out.println("The user used Wrath!");

        }
        else if (r.getProtect() == true) {
            //user doesnt take dmg but doesnt attack
            userTotalDmg = 0;
            enemyTotalDmg = 0;
            System.out.println("The user used Protect!");
        }
        else if (r.getAllOrNothing() == true) {
            //Deal a lot of damage but die the next turn if you dont win
            userTotalDmg = userTotalDmg * 4;
            //Will essentially let the enemy win if you dont kill because the win condition is an if statement where the user wins first
            enemyTotalDmg = 1000;
            System.out.println("The user used All or Nothing!");  
        }

        try { //Slowing down the output
          Thread.sleep(1000);
        } catch(Exception e) {
          System.out.println("Error 101");
        }

        //Outputting users dmg 
        System.out.println("Your robot did " + userTotalDmg + " damage.");
        enemy.changeHp(enemy.getHp() - userTotalDmg);
        System.out.println("The enemy's HP is " + enemy.getHp());
        
        try { //Slowing down the output
          Thread.sleep(1000);
        } catch(Exception e) {
          System.out.println("Error 101");
        }

        //Outputting enemy damage and soft clearing the output after combat
        System.out.println("The enemy did " + enemyTotalDmg + " damage.");
        user.changeHp(user.getHp() - enemyTotalDmg);
        System.out.println("Your HP is " + user.getHp() + "\n\n\n\n\n\n");
        
        try { //Slowing down the output
          Thread.sleep(1000);
        } catch(Exception e) {
          System.out.println("Error 101");
        }

        //If you kill the enemy robot
        if (enemy.getHp() < 1) {
            user.win(turn);
        }       
        else if (user.getHp() < 1) { //If the enemy robot kills you
            user.die(turn);
        }
        
    }
    

    /**
    * die
    * 
    * Outputting a message when the user dies based on the number of turns and adding a message to a file.
    * @param turns 
    * returns @void
    **/
    public void die(int turns) {
        try { //Slowing down the output
          Thread.sleep(500);
        } catch(Exception e) {
          System.out.println("Error 101");
        }

        //Outputting how many rounds you survived
        System.out.println("\nYou died! You survived " + turns + " turns");

        String data = "You survived " + Integer.toString(turns) + " turns before dying.";
        try { //Writing how long you surived to a file
            FileWriter file = new FileWriter("deaths.txt", true); //Setting it to true so it appends the text
            BufferedWriter output = new BufferedWriter(file);
            
            output.write("\n" + data);
            output.close();
            
        } catch(Exception e) {
            System.out.println("Error writing file");
        } 
   
    }
    
    /**
    * win
    * 
    * Outputting a message when the user wins and saving the stats they won with to a file
    * @param int 
    * returns @void
    **/
    public void win(int turns) {
        try { //Slowing down the output
          Thread.sleep(500);
        } catch(Exception e) {
          System.out.println("Error 101");
        }
        
        System.out.println("\nYou won! It took " + turns + " turns");
        
        //Still need to keep old files, not write over them
        try {
            FileWriter file = new FileWriter("wins.txt", true); //Setting it to true so it appends the info
            BufferedWriter output = new BufferedWriter(file);
            
            //Writing the stats to a file to save your wins
            output.write("\nIt took " + Integer.toString(turns) + " turns to win.");
            output.newLine();
            output.write("Stats - Hp: " + this.getHp() + " Damage: " + this.getDamage() + " Armor: " + this.getArmor() + " Armor Pen: " + this.getArmorPen());
            output.newLine();
            output.write("Weapon: "  + this.weaponItem.getName());
            output.newLine();
            output.write("Armor: " + this.armorItem.getName());
            output.close();
            
        } catch(Exception e) {
            System.out.println("Error writing file");
        }   
    }
    
    /**
    * resetStats
    * 
    * Resetting all of the users stats and setting item to filler so if the users battles again and doesnt have an item it doesnt crash 
    * @param  
    * returns @void
    **/
    public void resetStats() {
        //Reseting the stats of the robot in question
        //Making a new item to stop errors 
        RealItems filler = new RealItems("Blank", 1, "Does nothing", false, false, false, false, false, false);
        this.changeHp(30);
        this.changeWeaponItem(null);
        this.changeArmorItem(null);
        this.changeItem(filler);
        this.changeDamage(0);
        this.changeNumHits(1);
        this.changeArmor(0);
        this.changeArmorPen(0);
    }
    
    /**
    * hallOfFame
    * 
    * Reading the win of choice from the file, skip past the first n * 4 lines before reading the stats from the win 
    * @param int
    * returns @void
    **/
    public void hallOfFame(int winNum) { //Making a method to read out all of your wins
        try { //Want to try and make it specify a specific win
            File file = new File("wins.txt");
            Scanner read = new Scanner(file);
            int win = ((winNum - 1) * 4) + 1;
            for (int i = 0; i < win; i++) {
                read.nextLine(); //Looking at the lines that are irrelevant to us
            }
            
            //Using a for loop to view and output every line because there are 4 messages written on the file when you win
            for (int i = 0; i < 4; i++) {
                String temp = read.nextLine();
                System.out.println(temp);
            }
            read.close();  
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Win does not exist");
        }
    }
    

    /**
    * losses
    * 
    * Reading the loss of choice from the file, skip past the first n lines to get to the right number 
    * @param  
    * returns @void
    **/
    public void losses(int lossNum) {
        //Method for the user to look at their losses
        try {
            File file = new File("deaths.txt");
            Scanner read = new Scanner(file);
            for (int i = 0; i < lossNum; i++) {
                read.nextLine(); //Skipping over the lines that are irrelevant to us
            }
            //Saving and printing out the line that holds their loss
            String temp = read.nextLine(); 
            System.out.println(temp);
            
            read.close();  
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Loss does not exist");

        }
    }
    
    /**
    * mainMenu
    * 
    * The main menu for the game, gives the users a few options and loops until they quit or go into arena 
    * @param  
    * returns @void
    **/
    public void mainMenu() {
        Scanner input = new Scanner(System.in);
        //Clearing the console so when you die or win, you go back to the main menu and clear the trash
        boolean pass = false;    

        while (!pass) { //Using a while loop so the user can correct if they make a mistake
            //Making the battle bots menu
            try { //Slowing down the output
              Thread.sleep(1000);
            } catch(Exception e) {
              System.out.println("Error 101");
            }

            //Soft clearing the console
            System.out.println("\n\n\n\n\n\n-----Battle Bots-----");
            System.out.println("\nEnter the number of what you want to do");
            
            System.out.println("1) Arena");
            System.out.println("2) View Hall of fame");
            System.out.println("3) View Loses");
            System.out.println("4) Exit");
            
            String text;
            text = input.nextLine();
            
            try { //Slowing down the output
              Thread.sleep(500);
            } catch(Exception e) {
              System.out.println("Error 101");
            }

            switch(text) { //Using a switch to get a proper value(either 1, 2, 3)
                case "1":
                    pass = true;
                    //Lead into the game play loop which is just next in the while loop in main
                    break;
                case "2":
                    boolean next = false;
                    while(!next) { //using a while loop for data validation
                        System.out.println("\nEnter the win you want to view");
                        String word1 = input.nextLine();
                        try { //Trying to parse the string to an int, if you cant send an error message
                            int num = Integer.parseInt(word1);
                            next = true;
                            hallOfFame(num);
                        } catch (Exception e) { //Throwing an error message
                            System.out.println("Enter a proper value");
                        }
                    }
                    break;
                case "3":
                    next = false;
                    
                    while(!next) { //using a while loop for data validation
                        System.out.println("\nEnter the loss you want to view");
                        String word1 = input.nextLine();
                        try { //Trying to parse the string to an int, if you cant send an error message
                            int num = Integer.parseInt(word1);
                            next = true;
                            losses(num);
                        } catch (Exception e) { //Throwing an error message
                            System.out.println("Enter a proper value");
                        }
                    }
                    break;
                case "4":
                    System.exit(0);
                    break;
                    
            }
        }   
    }
    
    //Getting the name of the weapon/armor/item that the robot is holding

    /**
    * getNameWeapon
    * 
    * Getting the name of the weapon 
    * @param  
    * returns @void
    **/
    public String getNameWeapon() {
      return this.weaponItem.getName();
    }
    
    /**
    * getNameArmor
    * 
    * Getting the name of the armor 
    * @param  
    * returns @void
    **/
    public String getNameArmor() {
      return this.armorItem.getName();
    }
    
    /**
    * getNameItem
    * 
    * Getting the name of the item 
    * @param  
    * returns @void
    **/
    public String getNameItem() {
      return this.item.getName();
    }
    
    
}
