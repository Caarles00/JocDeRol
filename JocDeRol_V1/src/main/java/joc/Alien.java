
package joc;



public class Alien extends Player {
    
    //Constructor
    public Alien(String name, int attackP, int defenseP, int life) {
        super(name, attackP, defenseP, life);
    }
    
    @Override
    public int getAttackP(){
        if (this.getLife() < 20) {
            this.attackP= this.attackP + 3;
        }
        return this.attackP;
    }
}
