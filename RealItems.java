/*
 * Jonathan Peters
 * These items buff your character in unconventional ways
 */

/**
 *
 * @author Jonathan Peters
 */
public class RealItems extends BotBuffs{
    private boolean protect;
    private boolean lifeSteal;
    private boolean thorns; //Burn the user at the end of each battle for a set amount
    private boolean wrath;//Works like slay the spire Wrath stance, double dmg for both people
    private boolean allOrNothing; //4x damage, if you don't win that round you lose
    private boolean turtle;
    
    public RealItems(String name, int tier, String description, boolean protect, boolean lifeSteal, boolean thorns, boolean wrath, boolean allOrNothing, boolean turtle) {
        super(name, tier, description);
        this.protect = protect;
        this.lifeSteal = lifeSteal;
        this.thorns = thorns;
        this.wrath = wrath;
        this.allOrNothing = allOrNothing;
        this.turtle = turtle;
    }
    
    //Setters
    /**
    * changeProtect
    * 
    * Change whether the item protects or not
    * @param boolean
    * returns @void
    **/
    public void changeProtect(boolean newProtect) {
        this.protect = newProtect;
    }
    
    /**
    * changeLifeSteal
    * 
    * Change whether the item has life steal or not
    * @param boolean
    * returns @void
    **/
    public void changeLifeSteal(boolean newLifeSteal) {
        this.lifeSteal = newLifeSteal;
    }
    
    /**
    * changeThorns
    * 
    * Change whether the item has thorns or not
    * @param boolean
    * returns @void
    **/
    public void changeThorns(boolean newThorns) {
        this.thorns = newThorns;
    }

    /**
    * changeWrath
    * 
    * Change whether the item has wrath or not
    * @param boolean
    * returns @void
    **/
    public void changeWrath(boolean newWrath) {
        this.wrath = newWrath;
    }
    
    /**
    * changeAllOrNothing
    * 
    * Change whether the item has all or nothing or not
    * @param boolean
    * returns @void
    **/
    public void changeAllOrNothing(boolean newAllOrNothing) {
        this.allOrNothing = newAllOrNothing;
    }
    
    /**
    * changeTurtle
    * 
    * Change whether the item has turtle or not
    * @param boolean
    * returns @void
    **/
    public void changeTurtle(boolean newTurtle) {
        this.turtle = newTurtle;
    }

    //Getters
    /**
    * getProtect
    * 
    * Return if the item has protect
    * @param 
    * returns boolean
    **/
    public boolean getProtect() {
        return this.protect;
    }
    
    /**
    * getLifeSteal
    * 
    * Return if the item has life steal
    * @param 
    * returns boolean
    **/
    public boolean getLifeSteal() {
        return this.lifeSteal;
    }

    /**
    * getThorns
    * 
    * Return if the item has thorns
    * @param 
    * returns boolean
    **/
    public boolean getThorns() {
        return this.thorns;
    }

    /**
    * getWrath
    * 
    * Return if the item has wrath
    * @param 
    * returns boolean
    **/
    public boolean getWrath() {
        return this.wrath;
    }

    /**
    * getAllOrNothing
    * 
    * Return if the item has all or nothing
    * @param 
    * returns boolean
    **/
    public boolean getAllOrNothing() {
        return this.allOrNothing;
    }
    
    /**
    * getTurtle
    * 
    * Return if the item has turtle
    * @param 
    * returns boolean
    **/
    public boolean getTurtle() {
        return this.turtle;
    }
    
    //Methods that do something
    
    /**
    * t1RealItems
    * 
    * Generating real items betnween turns 1-3
    * @param 
    * returns RealItems[]
    **/
    public static RealItems[] t1RealItems() {
        RealItems[] t1RealItems = new RealItems[3]; //Premaking an array to hold t1 items that 
        t1RealItems[0] = new RealItems("Thorns", 1, "Deal 1 damage back the enemy every time your hit", false, false, true, false, false, false);
        t1RealItems[1] = new RealItems("Turtle", 1, "Reduce all damage by 50%", false, false, false, false, false, true);
        t1RealItems[2] = new RealItems("Blank", 1, "Does nothing", false, false, false, false, false, false);
        
        return t1RealItems;
    }
    
    /**
    * t2RealItems
    * 
    * Generating real items betnween turns 4-6
    * @param 
    * returns RealItems[]
    **/
    public static RealItems[] t2RealItems() {
        RealItems[] t2RealItems = new RealItems[3]; //Premaking an array to hold t2 items
        t2RealItems[0] = new RealItems("Life Steal", 2, "Heal when you hit", false, true, false, false, false, false);
        t2RealItems[1] = new RealItems("Wrath", 2, "Deal and take double damage", false, false, false, true, false, false);
        t2RealItems[2] = new RealItems("Blank", 2, "Does nothing", false, false, false, false, false, false);
        
        return t2RealItems;
    }
    
    /**
    * t3RealItems
    * 
    * Generating real items betnween turns 7+
    * @param 
    * returns RealItems[]
    **/
    public static RealItems[] t3RealItems() {
        RealItems[] t3RealItems = new RealItems[3]; //Premaking an array to hold t3 items
        t3RealItems[0] = new RealItems("Protect", 3, "Reduce 20 incoming damage", true, false, false, false, false, false);
        t3RealItems[1] = new RealItems("All or Nothing", 3, "Deal 4x damage, if you don't kill the opponent, you lose", false, false, false, false, true, false);
        t3RealItems[2] = new RealItems("Blank", 3, "Does nothing, mad?", false, false, false, false, false, false);
        
        return t3RealItems;
    }

}
