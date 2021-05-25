
package joc;

import java.util.ArrayList;


public abstract class Player {
    
    //Atributs 
    private String name;
    private int attackP;
    private int defenseP;
    private int life;
    private ArrayList teams = new ArrayList();
    private ArrayList items = new ArrayList();
    
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
        System.out.println("ABANS DE L'ATAC");
        System.out.println("Atacant: " + this.getName() + " PA: " + getName() + "PA:" + this.attackP + " / PD:" + this.defenseP + " / PV:" + this.getLife());
        System.out.println("Atacat: " + p.toString());
        
    }
    
    protected void hit(int attackPoints, Player p){
        int vida_Restant1 = 0;//Punts de vida - senseEscut1
        int vida_Restant2 = 0;//Punts de vida - senseEscut2
        int escut_restant1 = 0;//Punts d'atac - la defensa, en cas de que l'escut no siga < 0
        int escut_restant2 = 0;//Punts d'atac - la defensa, en cas de que l'escut no siga < 0
        
        //Player 1
        if (p.life > 0) {
            if (this.attackP >= p.defenseP) {
                vida_Restant1 = this.getAttackP() - p.defenseP;
                p.life = p.life - vida_Restant1;
            }else{//En aquest cas el jugador seguira tinguent escut
                escut_restant1 = p.defenseP - this.getAttackP();
                p.defenseP = escut_restant1;
                vida_Restant1 = p.getLife();
            }
            if (p.life <= 0) {
                vida_Restant1 = 0;
                System.out.println(p.name + "es colpejat amb " + this.attackP + " punts i es defen amb " + p.defenseP + ". Vides: " + vida_Restant1);
                System.out.println(p.name + "ha mort!!");
            }else{
                System.out.println(p.name + "es colpejat amb " + this.attackP + " punts i es defen amb " + p.defenseP + ". Vides: " + vida_Restant1);
                p.life = vida_Restant1;
            }
        }
        
        //Player 2
        if (p.life > 0) {
            if (this.life > 0) {
                if (p.attackP >= this.defenseP) {
                    vida_Restant2 = p.attackP - this.getDefenseP();
                    this.life = this.life - vida_Restant2;
                }else{
                    escut_restant2 = this.getDefenseP() - p.attackP;
                    this.defenseP = escut_restant2;
                }
            }
            if (this.life <= 0) {
                this.life = 0;
                System.out.println(name + " es colpejat amb " + p.attackP + " i es defen amb " + this.defenseP + ". Vides: " + life + "-" + vida_Restant2 + " = " + this.life);
                System.out.println(this.name + "ha mort!!");
            }else{
                vida_Restant2 = 0;//No lleva res perque l'escut es major als punts del atac
                System.out.println(name + " es colpejat amb " + p.attackP + " i es defen amb " + this.defenseP + ". Vides: " + life + "-" + vida_Restant2 + " = " + this.life);
            }
        }
        
        System.out.println("");
        System.out.println("DESPRES DE L'ATAC");
        System.out.println(toString());
        System.out.println(p.toString());
        System.out.println("");
    }
    
    //Team
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
    
    public boolean equals(Player p){
        return true;
    }
    
    //Item
    public void add(Item i){
        items.add(i);//Afegim l'item
        attackP = attackP + i.attcakBonus;//Sumem els punts d'atac que ens dona l'item
        defenseP = defenseP + i.defenseBonus;//Sumem els punts de defensa que ens dona l'item
    }
    
    public void remove(Item i){
        items.remove(i);//Borrem l'item
        attackP = attackP - i.attcakBonus;//Restem els punts d'atac que estaven afegits
        defenseP = attackP - i.defenseBonus;//Restem els punts de defensa que estaven afegits
        
    }

    @Override
    public String toString() {
        return getName() + "PA:" + this.attackP + " / PD:" + this.defenseP + " / PV:" + this.life + " i te de items " + this.items;
    }
    
    
    
}
