
package joc;


public abstract class Player {
    
    //Atributs privats
    private String name;
    private int attackP;
    private int defenseP;
    private int life;
    
    //Constructor
    public Player(String name, int attackP, int defenseP, int life) {
        this.name = name;
        this.attackP = attackP;
        this.defenseP = defenseP;
        this.life = life;
    }
    
    //Mètode attack() 
    public void attack(Player p){
        
    }
    
    //Getters
    public String getName() {
        return name;
    }

    public int getAttackP() {
        return attackP;
    }

    public int getDefenseP() {
        return defenseP;
    }

    public int getLife() {
        return life;
    }
    
    //Mètode hit()
    protected void hit(int attackPoints){
        
    }

    @Override
    public String toString() {
        return getName() + "PA:" + this.attackP + " / PD:" + this.defenseP + " / PV:" + this.life;
    }
    
    
    
}
