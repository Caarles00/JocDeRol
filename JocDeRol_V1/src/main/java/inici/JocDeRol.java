
package inici;

import joc.Alien;
import joc.Human;
import joc.Warrior;


public class JocDeRol {
    
    public static void provaFase(){
        System.out.println("Human:");
        Human h = new Human("Carles", 20, 50, 200);
        
        System.out.println("Warrior:");
        Warrior w = new Warrior("Odin", 30, 40, 150);
        
        System.out.println("Alien:");
        Alien a = new Alien("Ete", 60, 20, 100);
    }
    
}
