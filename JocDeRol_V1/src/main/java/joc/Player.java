
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
        System.out.println("ABANS DE L'ATAC");
        System.out.println("Atacant: " + this.getName() + " PA: " + getName() + "PA:" + this.attackP + " / PD:" + this.defenseP + " / PV:" + this.getLife());
        System.out.println("Atacat: " + p.toString());
        
    }
    
    protected void hit(int attackPoints, Player p){
        int sense_Escut1;//Punts d'atac - la defensa, es la diferencia entre els punts d'atac i els de defensa
        int sense_Escut2;//Punts d'atac - la defensa
        int vida_Restant1;//Punts de vida - senseEscut1
        int vida_Restant2;//Punts de vida - senseEscut2
        int escut_restant1;
        int escut_restant2;
        
        if (p.life > 0) {
            if (this.attackP >= p.defenseP) {
                sense_Escut1 = this.getAttackP() - p.defenseP;
                vida_Restant1 = p.getLife() - sense_Escut1;
            }else{//En aquest cas el jugador seguira tinguent escut
                escut_restant1 = p.defenseP - this.getAttackP();
                p.defenseP = escut_restant1;
                vida_Restant1 = p.getLife();
            }
            if (p.life <= 0) {
                vida_Restant1 = 0;
                System.out.println(p.name + "es colpejat amb " + this.attackP + " punts i es defen amb " + p.defenseP + ". Vides: " + vida_Restant1);
                System.out.println(p.name + "Ha mort!!");
            }
        }
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
    
    public boolean equals(Player p){
        return true;
    }

    @Override
    public String toString() {
        return getName() + "PA:" + this.attackP + " / PD:" + this.defenseP + " / PV:" + this.life;
    }
    
    
    
}
