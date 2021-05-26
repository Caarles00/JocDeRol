
package inici;

import io.Leer;
import java.util.ArrayList;
import java.util.Scanner;
import joc.Alien;
import joc.Human;
import joc.Item;
import joc.Player;
import joc.Team;
import joc.Warrior;



public class JocDeRol {
    
    public static void main(String[] args) {
        
        //Arrays per a guardar els jugadors, grups i per a les armes
        ArrayList<Player> players = new ArrayList();
        ArrayList<Team> teams = new ArrayList();
        ArrayList<Item> items = new ArrayList();
        
        Scanner teclat = new Scanner(System.in);
        int op1, op2, op3, op4, op5, opTipusJug;
        boolean seguir = true;
        String nom;
        
        //Menú joc de rol
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
                            System.out.println("1.1.1 Crear jugador             ");
                            System.out.println("1.1.2 Mostrar jugadors          ");
                            System.out.println("1.1.3 Esborrar jugadors         ");
                            System.out.println("1.1.4 Assignar jugar a equip    ");
                            System.out.println("1.1.5 Assignar objecte a jugador");
                            System.out.println("1.1.6 Eixir                     ");
                            System.out.println("================================");
                            op3 = Leer.leerEntero("Tria una opció: ");
                            switch(op3){
                                case 1:
                                    System.out.println("============");
                                    System.out.println("1. Alien    ");
                                    System.out.println("2. Warrior  ");
                                    System.out.println("3. Human    ");
                                    System.out.println("============");
                                    opTipusJug = Leer.leerEntero("Quin tipus de jugador vols triar?");
                                    switch(opTipusJug){
                                        case 1:
                                            System.out.println("Has triat ser 👽");
                                            nom = Leer.leerTexto("Digues el nom del Alien");
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        default:
                                            System.out.println("Opció incorrecta");
                                    }
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opció incorrecta");
                            }
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
                            op4 = Leer.leerEntero("Tria una opció: ");
                            switch(op4){
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Opció incorrecta");
                            }
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
                            op5 = Leer.leerEntero("Tria una opció: ");
                            switch(op5){
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Opció incorrecta");
                            }
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
