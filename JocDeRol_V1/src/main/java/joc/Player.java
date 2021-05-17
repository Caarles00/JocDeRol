
package joc;

import java.util.ArrayList;


public abstract class Player {
    
    //Atributs 
    private String name;
    private int attackP;
    private int defenseP;
    private int life;
    private ArrayList teams = new ArrayList();
    
    //Constructor
    public Player(String name, int attackP, int defenseP, int life) {
        this.name = name;
        this.attackP = attackP;
        this.defenseP = defenseP;
        this.life = life;
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
    
    //Mètodes 
    public void attack(Player p){
        System.out.println("");
    }
    
    protected void hit(int attackPoints){
        
    }
    
    public void add(Team t){
        teams.add(t);
    }
    
    public void remove(Team t){
        teams.remove(t);
    }
    
    public void llistar(){
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return getName() + "PA:" + this.attackP + " / PD:" + this.defenseP + " / PV:" + this.life;
    }
    
    
    
}
