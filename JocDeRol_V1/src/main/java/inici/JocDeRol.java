
package inici;

import io.Leer;
import java.util.Scanner;
import joc.Alien;
import joc.Human;
import joc.Warrior;



public class JocDeRol {
    
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int op1, op2;
        boolean seguir = true;
        
        System.out.println("=====================");
        System.out.println("      JOC DE ROL     ");
        System.out.println("=====================");
        System.out.println("1. Configuració      ");
        System.out.println("2. Jugar             ");
        System.out.println("3. Exir              ");
        System.out.println("=====================");
        op1 = Leer.leerEntero("Tria una opció: ");
        while(seguir = true){
            switch (op1){
                case 1:
                    System.out.println("====================");
                    System.out.println("    CONFIGURACIÓ    ");
                    System.out.println("====================");
                    System.out.println("1.1 Gestió jugadors ");
                    System.out.println("1.2 Gestió equips   ");
                    System.out.println("1.3 Gestió objectes ");
                    System.out.println("1.4 Exir            ");
                    System.out.println("====================");
                    op2 = Leer.leerEntero("Tria una opció");
                    switch(op2){
                        case 1:
                            System.out.println("================================");
                            System.out.println("        J U G A D O R S         ");
                            System.out.println("================================");
                            System.out.println("1.1.1 Creaj jugador             ");
                            System.out.println("1.1.2 Mostrar jugadors          ");
                            System.out.println("1.1.3 Esborrar jugadors         ");
                            System.out.println("1.1.4 Assignar jugar a equip    ");
                            System.out.println("1.1.5 Assignar objecte a jugador");
                            System.out.println("1.1.6 Eixir                     ");
                            System.out.println("================================");
                            break;
                        case 2:
                            System.out.println("==============================");
                            System.out.println("         E Q U I P S          ");
                            System.out.println("==============================");
                            System.out.println("1.2.1 Crear equip             ");
                            System.out.println("1.2.2 Mostrar equips          ");
                            System.out.println("1.2.3 Esborrar equip          ");
                            System.out.println("1.2.4 Assignar equip a jugador");
                            System.out.println("1.2.5 Eixir                   ");
                            System.out.println("==============================");
                            break;
                        case 3:
                            System.out.println("=================================");
                            System.out.println("         O B J E C T E S         ");
                            System.out.println("=================================");
                            System.out.println("1.3.1 Crear objecte              ");
                            System.out.println("1.3.2 Mostrar objecte            ");
                            System.out.println("1.3.3 Esborrar objecte           ");
                            System.out.println("1.3.4 Assignar objecete a jugador");
                            System.out.println("1.3.5 Eixir                      ");
                            System.out.println("=================================");
                            break;
                        default:
                            System.out.println("Opcio incorrecta");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Has triat eixir, fins la pròxima!");
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcio incorrecta");
            }
        }
        
    }
    public static void provaFase(){
        System.out.println("Human:");
        Human h = new Human("Carles", 20, 50, 200);
        
        
        System.out.println("Warrior:");
        Warrior w = new Warrior("Odin", 30, 40, 150);
        
        System.out.println("Alien:");
        Alien a = new Alien("Ete", 60, 20, 100);
   }
    
}
