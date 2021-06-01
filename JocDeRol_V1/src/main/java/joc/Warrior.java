
package joc;


public class Warrior extends Human {
    
    //Constructor
    public Warrior(String name, int attackP, int defenseP, int life) {
        super(name, attackP, defenseP, life);
    }
    
    @Override
    protected void hit(int attackPoints, Player p){
        int vida_Restant1 = 0;//Punts de vida - els punts de defensa, en cas  de que els punts d'atac sigua major als de defensa
        int vida_Restant2 = 0;//Punts de vida - els punts de defensa, en cas  de que els punts d'atac sigua major als de defensa
        int escut_restant1 = 0;//Punts d'atac - la defensa, en cas de que l'escut no siga < 0
        int escut_restant2 = 0;//Punts d'atac - la defensa, en cas de que l'escut no siga < 0
        
        //Player 1
        if (p.getLife() > 0) {
            if (this.getAttackP() >= p.getDefenseP()) {
                vida_Restant1 = this.getAttackP() - p.getDefenseP();
                p.setLife(p.getLife() - vida_Restant1);
            }else{//En aquest cas el jugador seguira tinguent escut
                escut_restant1 = p.getDefenseP() - this.getAttackP();
                p.setDefenseP(escut_restant1);
                vida_Restant1 = p.getLife();
            }
            if (p.getLife() <= 0) {
                vida_Restant1 = 0;
                System.out.println(p.getName() + "es colpejat amb " + this.getAttackP() + " punts i es defen amb " + p.getDefenseP() + ". Vides: " + vida_Restant1);
                System.out.println(p.getName() + "ha mort!!");
            }else{
                System.out.println(p.getName() + "es colpejat amb " + this.getAttackP() + " punts i es defen amb " + p.getDefenseP() + ". Vides: " + vida_Restant1);
                p.setLife(vida_Restant1);
            }
        }
        
        //Player 2
        if (p.getLife() > 0) {
            if (this.getLife() > 0) {
                if (p.getAttackP() >= this.getDefenseP()) {
                    vida_Restant2 = p.getAttackP() - this.getDefenseP();
                    p.setLife(p.getLife() - vida_Restant2);
                }else{
                    escut_restant2 = this.getDefenseP() - p.getAttackP();
                    this.setDefenseP(escut_restant2); 
                }
            //Habilitat warrior
            if (vida_Restant2 < 5) {
                vida_Restant2 = 0;
                setLife(this.getLife() - vida_Restant2);
            }
            vida_Restant2 = this.getLife() - vida_Restant2;

            if (vida_Restant2 <= 0) {

                System.out.println(getName()  + " es colpejat amb " + p.getAttackP() + " i es defen amb " + this.getDefenseP() + ". Vides: " + getLife() + " - " + vida_Restant2 + " = " + vida_Restant2);
                System.out.println(this.getName() + " ha muerto");
                this.setLife(vida_Restant2);
            } else {
                System.out.println(getName() + " es colpejat amb " + p.getAttackP() + " i es defen amb " + this.getDefenseP() + ". Vides: " + getLife() + " - " + vida_Restant2 + " = " + vida_Restant2);
                this.setLife(vida_Restant2);
            }    
        }else{
            System.out.println("Player "+this.getName() + " esta muert");
            }
    }else{
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("DESPRES DE L'ATAC");
        System.out.println(toString());
        System.out.println(p.toString());
        System.out.println("");
    }
}
