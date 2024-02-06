/*
 * Jonathan Peters
 * Making the weapons that the bot can equip
 */

/**
 *
 * @author Jonathan Peters
 */
public class Weapons extends BotBuffs {
    private int damage;
    private int numHits;
    private int armorPen;
    private double airMulti;
    private double steelMulti;
    private double fireMulti;
    //can add exp
    
    public Weapons(String name, int tier, String description, int damage, int numHits, int armorPen, double airMulti, double steelMulti, double fireMulti) {
        super(name, tier, description);
        this.damage = damage;
        this.numHits = numHits;
        this.armorPen = armorPen;
        this.airMulti = airMulti;
        this.steelMulti = steelMulti;
        this.fireMulti = fireMulti;
    }
    
    //Setters

    /**
    * changeDamage
    * 
    * Changing the weapons damage
    * @param int 
    * returns @void
    **/
    public void changeDamage(int newDamage) {
        this.damage = newDamage;
    }

    /**
    * changeNumHits
    * 
    * Changing the number of times the weapon hits
    * @param int 
    * returns @void
    **/ 
    public void changeNumHits(int newNumHits) {
        this.numHits = newNumHits;
    }
    
    /**
    * changeArmorPen
    * 
    * Changing the weapons armor penetration
    * @param int 
    * returns @void
    **/
    public void changeArmorPen(int newArmorPen) {
        this.armorPen = newArmorPen;
    }
    
    /**
    * changeAirMulti
    * 
    * Changing the matchup into air 
    * @param double 
    * returns @void
    **/
    public void changeAirMulti(double newAirMulti) {
        this.airMulti = newAirMulti;
    }
    
    /**
    * changeSteelMulti
    * 
    * Changing the matchup into steel 
    * @param double 
    * returns @void
    **/
    public void changeSteelMulti(double newSteelMulti) {
        this.steelMulti = newSteelMulti;
    }
    
    /**
    * changeFireMulti
    * 
    * Changing the matchup into fire 
    * @param double 
    * returns @void
    **/
    public void changeFireMulti(double newFireMulti) {
        this.fireMulti = newFireMulti;
    }
    
    //Getters

    /**
    * getDamage
    * 
    * Return the damage of the weapon 
    * @param  
    * returns int
    **/
    public int getDamage() {
        return this.damage;
    }
    
    /**
    * getNumHits
    * 
    * Return the number of hits of the weapon 
    * @param  
    * returns int
    **/
    public int getNumHits() {
        return this.numHits;
    }
    
    /**
    * getArmorPen
    * 
    * Return the armor pen of the weapon 
    * @param  
    * returns int
    **/
    public int getArmorPen() {
        return this.armorPen;
    }
    
    /**
    * getAirMulti
    * 
    * Return the multiplier of the weapon into air
    * @param  
    * returns double
    **/
    public double getAirMulti() {
        return this.airMulti;
    }
    
    /**
    * getSteelMulti
    * 
    * Return the multiplier of the weapon into steel
    * @param  
    * returns double
    **/
    public double getSteelMulti() {
        return this.steelMulti;
    }
    
    /**
    * getFireMulti
    * 
    * Return the multiplier of the weapon into fire
    * @param  
    * returns double
    **/
    public double getFireMulti() {
        return this.fireMulti;
    }
    
    //Methods that do something

    /**
    * t1Weapons
    * 
    * Generating weapons between turns 1-3
    * @param 
    * returns Weapons[]
    **/
    public static Weapons[] t1Weapons() {
        Weapons[] t1 = new Weapons[3];
        t1[0] = new Weapons("Club", 1,"Simple wooden melee weapon, good into air and bad into steel." , 7, 1, 0, 2, 0.5, 1);
        t1[1] = new Weapons("Karambit", 1,"Cool steel knife, good into steel and bad into fire.", 3, 5, 0, 1, 2, 0.5);
        t1[2] = new Weapons("Water Gun", 1,"High power water gun, good into fire and bad into air." , 7, 1, 0, 0.5, 1, 2);
        
        return t1;
    }
    
    /**
    * t2Weapons
    * 
    * Generating weapons between turns 4-6
    * @param 
    * returns Weapons[]
    **/
    public static Weapons[] t2Weapons() {
        Weapons[] t2 = new Weapons[3];
        t2[0] = new Weapons("Chainsaw", 2,"Leatherface's chainsaw, good into air and bad into steel" , 11, 1, 3, 2, 0.5, 1);
        t2[1] = new Weapons("Katana", 2,"Ripped staight outta Katana Zero, good into steel and bad into air", 4, 4, 1, 1, 2, 0.5);
        t2[2] = new Weapons("Wind blade", 2,"Tornado in a blade, good into fire and bad into air" , 6, 2, 1, 0.5, 1, 2);
         
        return t2;
    }
    
    /**
    * t3Weapons
    * 
    * Generating real items between turns 7+
    * @param 
    * returns Weapons[]
    **/
    public static Weapons[] t3Weapons() {
        Weapons[] t3 = new Weapons[3];
        t3[0] = new Weapons("Flamethrower", 3, "Fire from the depths of hell, good into steel and bad into air", 8, 15, 1, 0.5, 2, 1);
        t3[1] = new Weapons("Hydro Cannon", 3, "Not your little brother's squirt gun, good into fire and bad into steel", 25, 1, 10, 1, 0.5, 2);
        t3[2] = new Weapons("Thunderblade", 3, "Zeus in a blade, good into air and bad into fire", 15, 2, 0, 2, 1, 0.5);
        
        return t3;
    }
    
}
