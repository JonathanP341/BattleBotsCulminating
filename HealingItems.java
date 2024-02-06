/*
 * Jonathan Peters
 * Items that can heal your bot or give it more damage
 */


public class HealingItems extends BotBuffs { //Would prefer to call it statItems but w/e
    private int healingBuff;
    private int damageBuff;
    private int armorBuff;
    //Might add more possible item buffs, but idk for now
    
    public HealingItems(String name, int tier, String description, int healingBuff, int damageBuff, int armorBuff) {
        super(name, tier, description);
        this.healingBuff = healingBuff;
        this.damageBuff = damageBuff;
        this.armorBuff = armorBuff;
    }
    
    //Getters

    /**
    * getHealingBuff
    * 
    * Gets the size of the heal of the item
    * @param 
    * returns int
    **/
    public int getHealingBuff(){
        return this.healingBuff;
    }
    
    /**
    * getDamageBuff
    * 
    * Gets the size of the damage buff of the item
    * @param 
    * returns int
    **/
    public int getDamageBuff(){
        return this.damageBuff;
    }
    
    /**
    * getDamageBuff
    * 
    * Gets the size of the armor buff of the item
    * @param 
    * returns int
    **/
    public int getArmorBuff(){
        return this.armorBuff;
    }
    
    
    //Setters

    /**
    * changeHealingBuff
    * 
    * Changing the size of the heal
    * @param int
    * returns @void
    **/
    public void changeHealingBuff(int newHealingBuff) {
        this.healingBuff = newHealingBuff;
    }
    
    /**
    * changeDamageBuff
    * 
    * Changing the size of the damage buff
    * @param int
    * returns @void
    **/
    public void changeDamageBuff(int newDamageBuff){
        this.damageBuff = newDamageBuff;
    }
    
    /**
    * changeArmorBuff
    * 
    * Changing the size of the armor buff
    * @param int
    * returns @void
    **/
    public void changeArmorBuff(int newArmorBuff) {
        this.armorBuff = newArmorBuff;
    }
    
    
    //Methods that do something

    /**
    * t1HealingItems
    * 
    * Generating the items that the user can buy between turns 1-3
    * @param 
    * returns healingItems[]
    **/
    public static HealingItems[] t1HealingItems() {
        //Making the items that the user can use 
        HealingItems[] t1 = new HealingItems[3];
        t1[0] = new HealingItems("Oil Change", 1, "Heals", 2, 0, 0);
        t1[1] = new HealingItems("Steroids", 1, "Increases damage for a price",-1, 3, 0);
        t1[2] = new HealingItems("Massage", 1, "Best of both worlds", 1, 1, 0);
        
        return t1;
    }
    
    /**
    * t2HealingItems
    * 
    * Generating the items that the user can buy between turns 4-6
    * @param 
    * returns healingItems[]
    **/
    public static HealingItems[] t2HealingItems() {
        //Making tier 2 items
        HealingItems[] t2 = new HealingItems[3];
        t2[0] = new HealingItems("Pure Protein", 2, "BIG DAMAGE BUFF", 0, 3, 0);
        t2[1] = new HealingItems("Polish", 2, "Increase armor", 1, 0, 2);
        t2[2] = new HealingItems("Nurse Joy", 2, "Healing Buff", 3, 1, 0);
        
        return t2;
    }
    
    /**
    * t3HealingItems
    * 
    * Generating the items that the user can buy between turns 7+
    * @param 
    * returns healingItems[]
    **/
    public static HealingItems[] t3HealingItems() {
        //Making tier 3 items
        HealingItems[] t3 = new HealingItems[4];
        t3[0] = new HealingItems("Robot Spa", 3, "Big Heal", 5, 1, 0);
        t3[1] = new HealingItems("Malware", 3, "Steroids on Steroids", -2, 7, 0);
        t3[2] = new HealingItems("Exoskeleton", 3, "INCREASE armor", 0, 1, 5);
        
        return t3;
    }
    
}
