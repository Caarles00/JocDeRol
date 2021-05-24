
package joc;

import java.util.ArrayList;

public class Team{
    
    //Atributs
    private String teamName;
    private ArrayList players = new ArrayList();
    
    
    //Constructor
    public Team(String teamName, String name, int attackP, int defenseP, int life) {
        this.teamName = teamName;
    }
    
    //Mètodes
    public void add(Player p){
        players.add(p);
    }
    
    public void remove(Player p){
        players.remove(p);
                  
    }
    
    public void llistar(){
        for (int i = 0; i < players.size(); i++) {
            System.out.println(i);
        }
    }
    
    public boolean equals(Team t){
        return true;
    }
    

    @Override
    public String toString() {
        return "Equip: " + this.teamName;
    }
    
    
    
}
