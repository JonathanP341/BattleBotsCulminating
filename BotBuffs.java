/*
 * Jonathan Peters
 * Making the class for the shop items
 */

/**
 *
 * @author Jonathan Peters
 */
public class BotBuffs {
    private String name;
    private int tier;
    private String description;
    
    public BotBuffs(String name, int tier, String description) {
        this.name = name;
        this.tier = tier;
        this.description = description;
    }
    
    //Setters

    /**
    * changeName
    * 
    * Changes the name of the object
    * @param String
    * returns @void
    **/
    public void changeName(String newName) {
        this.name = newName;
    }
    
    /**
    * changeTier
    * 
    * Changes the tier of the object
    * @param int
    * returns @void
    **/
    public void changeTier(int newTier) {
        this.tier = newTier;
    }
    
    /**
    * changeDescription
    * 
    * Changes the description of the object
    * @param String
    * returns @void
    **/
    public void changeDescription(String newDescription) {
        this.description = newDescription;
    }
    
    //Getters

    /**
    * getName
    * 
    * Gets the name of the object
    * @param 
    * returns String
    **/
    public String getName() {
        return this.name;
    }
    
    /**
    * getTier
    * 
    * Gets the tier of the object
    * @param 
    * returns int
    **/
    public int getTier() {
        return this.tier;
    }
    
    /**
    * getDescription
    * 
    * Gets the description of the object
    * @param 
    * returns String
    **/
    public String getDescription() {
        return this.description;
    }
    
    
    
}
