
package joc;



public class Alien extends Player {
    
    //Constructor
    public Alien(String name, int attackP, int defenseP, int life) {
        super(name, attackP, defenseP, life);
    }
    
    @Override
    public int getAttackP(){
        if (this.getLife() > 20) {
            System.out.println(this.getAttackP());
            this.setAttackP(this.getAttackP() + 3);
            this.setDefenseP(this.getDefenseP() - 3);
        }
        return this.getAttackP();
    }
}
