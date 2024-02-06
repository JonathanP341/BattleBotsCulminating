/*
 * Jonathan Peters
 * The other shop item, can be equipped
 */

/**
 *
 * @author Jonathan Peters
 */
public class Armor extends BotBuffs{
    private int defence;
    private boolean fire;
    private boolean steel;
    private boolean air;
    
    public Armor(String name, int tier, String description, int defence, boolean fire, boolean steel, boolean air) {
        super(name, tier, description);
        this.defence = defence;
        this.fire = fire;
        this.steel = steel;
        this.air = air;
    }
    
    //Setters

    /**
    * changeDefence
    * 
    * Changes the defence of the item
    * @param boolean
    * returns  @void 
    **/
    public void changeDefence(int newDefence) {
        this.defence = newDefence;
    }
    
    /**
    * changeFire
    * 
    * Changes the type
    * @param boolean
    * returns  @void 
    **/
    public void changeFire(boolean newFire) {
        this.fire = newFire;
    }
    
    /**
    * changeSteel
    * 
    * Changes the type
    * @param boolean
    * returns  @void 
    **/
    public void changeSteel(boolean newSteel) {
        this.steel = newSteel;
    }
    
    /**
    * public void changeAir
    * Changes the type of the item
    * 
    * @void
    **/
    public void changeAir(boolean newAir) {
        this.air = newAir;
    }
    
    
    //Getters

    /**
    * getDefence
    * 
    * Returns the defence
    * @param none
    * returns boolean
    **/
    public int getDefence() {
        return this.defence;
    }
    
    /**
    * getFire
    * 
    * Returns if it is fire type
    * @param none
    * returns boolean
    **/
    public boolean getFire() {
        return this.fire;
    }
    
    /**
    * getAir
    * 
    * Returns if it is air type
    * @param none
    * returns boolean
    **/
    public boolean getAir() {
        return this.air;
    }
    
    /**
    * getSteel
    * 
    * Returns if it is steel type
    * @param none
    * returns boolean
    **/
    public boolean getSteel() {
        return this.steel;
    }
    
    
    //Methods that do something, need to do generateArmor method

    /**
    * t1Armor
    * 
    * Generates the armor items if its turn 1-3
    * @param none
    * returns Armor[]
    **/
    public static Armor[] t1Armor() {
        Armor[] t1 = new Armor[3];
        t1[0] = new Armor("Fan", 1, "Air armor", 3 , false, true, false);
        t1[1] = new Armor("Chain mail", 1, "Steel armor", 3,  false, false, true);
        t1[2] = new Armor("Space heater", 1, "Fire armor", 3,  true, false, false);
        
        return t1;
    }
    
    /**
    * t2Armor
    * 
    * Generates the armor items if its turn 4-6
    * @param none
    * returns Armor[]
    **/
    public static Armor[] t2Armor() {
        Armor[] t2 = new Armor[3];
        t2[0] = new Armor("Tornado Shield", 2, "Air armor", 5, false, true, false);
        t2[1] = new Armor("Vibranium", 2, "Steel armor", 5, false, false, true);
        t2[2] = new Armor("Flame wall", 2, "Fire armor", 5, true, false, false);
        
        return t2;
    }
    
    /**
    * t3Armor
    * 
    * Generates the armor items if its turn 7+
    * @param none
    * returns Armor[]
    **/
    public static Armor[] t3Armor() {
        Armor[] t3 = new Armor[3];
        t3[0] = new Armor("Blessing of the Winds", 3, "Air armor", 7,  false, true, false);
        t3[1] = new Armor("Steel Core", 3, "Steel armor", 7, false, false, true);
        t3[2] = new Armor("Volcano's Fury", 3, "Fire armor", 7, true, false ,false);
        
        return t3;
    }
    
    
}
