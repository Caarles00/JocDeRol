
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
        int op1, op2, op3, op4, op5, opTipusJug, puntsAtac, puntsDef, puntsVida, pDefensa, pAtac;
        boolean seguir = true;
        String nom, deletePlayer, addP_to_T, addP_to_T_2, assignarItem, assignarItem_P, nomEquip, borrarEquip, nomItem, borrarItem;
        
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
                            System.out.println("1.1.4 Assignar jugardor a equip ");
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
                                    opTipusJug = Leer.leerEntero("Quin tipus de jugador vols ser?");
                                    switch(opTipusJug){
                                        //Alien
                                        case 1:
                                            System.out.println("Has triat ser Alien!");
                                            nom = Leer.leerTexto("Nom: ");
                                            
                                            puntsAtac = Leer.leerEntero("Punts d'atac, entre 1 i 100: ");
                                            while(puntsAtac < 1 || puntsAtac > 100){
                                                puntsAtac = Leer.leerEntero("Error, torna a introduir els punts d'atac: ");
                                            }
                                            
                                            puntsDef = Leer.leerEntero("Punts de defensa, ha de ser menor 100: ");
                                            while(puntsDef < 0 || puntsDef > 100){
                                                puntsDef = Leer.leerEntero("Error, torna a introduir els punts de defensa: ");
                                            }
                                            
                                            puntsVida = Leer.leerEntero("Punts de vida, entre 50 i 150: ");
                                            while(puntsVida < 50 || puntsVida > 150){
                                                puntsVida = Leer.leerEntero("Error, torna a introduir els punts de vida: ");
                                            }
                                            
                                            //Alien creat
                                            Alien alien = new Alien(nom, puntsAtac, puntsDef, puntsVida);
                                            players.add(alien);
                                            break;
                                            
                                        //Warrior
                                        case 2:
                                            System.out.println("Has triat ser Warrior!");
                                            nom = Leer.leerTexto("Nom: ");
                                            
                                            puntsAtac = Leer.leerEntero("Punts d'atac, entre 1 i 100: ");
                                            while(puntsAtac < 1 || puntsAtac > 100){
                                                puntsAtac = Leer.leerEntero("Error, torna a introduir els punts d'atac: ");
                                            }
                                            
                                            puntsDef = Leer.leerEntero("Punts de defensa, ha de ser menor 100: ");
                                            while(puntsDef < 0 || puntsDef > 100){
                                                puntsDef = Leer.leerEntero("Error, torna a introduir els punts de defensa: ");
                                            }
                                            
                                            puntsVida = Leer.leerEntero("Punts de vida, entre 50 i 150: ");
                                            while(puntsVida < 50 || puntsVida > 150){
                                                puntsVida = Leer.leerEntero("Error, torna a introduir els punts de vida: ");
                                            }
                                            //Warrior creat
                                            Warrior warrior = new Warrior(nom, puntsAtac, puntsDef, puntsVida);
                                            players.add(warrior);
                                            break;
                                            
                                        //Human
                                        case 3:
                                            System.out.println("Has triat ser Humà!");
                                            nom = Leer.leerTexto("Nom: ");
                                            
                                            puntsAtac = Leer.leerEntero("Punts d'atac, entre 1 i 100: ");
                                            while(puntsAtac < 1 || puntsAtac > 100){
                                                puntsAtac = Leer.leerEntero("Error, torna a introduir els punts d'atac: ");
                                            }
                                            
                                            puntsDef = Leer.leerEntero("Punts de defensa, ha de ser menor 100: ");
                                            while(puntsDef < 0 || puntsDef > 100){
                                                puntsDef = Leer.leerEntero("Error, torna a introduir els punts de defensa: ");
                                            }
                                            System.out.println("Un humà no pot tindre mes de 100 punts de vida");
                                            puntsVida = Leer.leerEntero("Punts de vida, entre 50 i 100: ");
                                            while(puntsVida < 50 || puntsVida > 150){
                                                puntsVida = Leer.leerEntero("Error, torna a introduir els punts de vida: ");
                                            }
                                            //Humà creat
                                            Human huma = new Human(nom, puntsAtac, puntsDef, puntsVida);
                                            players.add(huma);
                                            break;
                                        default:
                                            System.out.println("Opció incorrecta");
                                    }
                                    break;
                                    
                                case 2:
                                    System.out.println("Has triat mostrar jugadors");
                                    //Recorreguem el array de players per a trure la informació amb el toString()
                                    for (int i = 0; i < players.size(); i++) {
                                        System.out.println(players.get(i).toString());
                                    }
                                    break;
                                    
                                case 3:
                                    //En cas de que l'array de players no estiga buit
                                    if (!players.isEmpty()) {
                                        System.out.println("====================");
                                        System.out.println(" LLISTA DE JUGADORS ");
                                        System.out.println("====================");
                                        for (int i = 0; i < players.size(); i++) {
                                            System.out.println(players.get(i).toString());
                                        }
                                        System.out.println("====================");
                                        deletePlayer = Leer.leerTexto("Quin jugador vols borrar? ");
                                        for (int i = 0; i < players.size(); i++) {
                                            if (players.get(i).getName().equalsIgnoreCase(deletePlayer)) {
                                                Player jugadorAssignat = players.get(i);
                                                players.remove(jugadorAssignat);
                                            }
                                        }
                                    }else{
                                        System.out.println("Ni hi ha cap jugador");
                                    }
                                    break;
                                    
                                case 4:
                                    if (!players.isEmpty() && !teams.isEmpty()) {
                                        //Llistem els jugadors
                                        System.out.println("====================");
                                        System.out.println(" LLISTA DE JUGADORS ");
                                        System.out.println("====================");
                                        for (int i = 0; i < players.size(); i++) {
                                            System.out.println(players.get(i));
                                        }
                                        System.out.println("====================");
                                        addP_to_T = Leer.leerTexto("A quin jugador vols assignar-li un equip? ");
                                        for (int i = 0; i < players.size(); i++) {
                                            if (players.get(i).getName().equalsIgnoreCase(addP_to_T)) {
                                                Player jugadorAssignat = players.get(i);
                                                //Llistem els equips
                                                System.out.println("====================");
                                                System.out.println("  LLISTA D'EQUIPS   ");
                                                System.out.println("====================");
                                                for (int j = 0; j < teams.size(); j++) {
                                                    System.out.println(teams.get(j));
                                                }
                                                System.out.println("====================");
                                                addP_to_T_2 = Leer.leerTexto("A quin equip vols assignar-lo? ");
                                                for (int j = 0; j < teams.size(); j++) {
                                                    if (teams.get(i).getTeamName().equalsIgnoreCase(addP_to_T_2)) {
                                                        teams.get(i).getPlayers().add(jugadorAssignat);
                                                    }
                                                }
                                            }
                                        }
                                        System.out.println("");  
                                    }else{
                                        System.out.println("Es necessari que almenys exitisca un jugador i un equip");
                                    }
                                    break;
    
                                case 5:
                                    for (int i = 0; i < items.size(); i++) {
                                        if (!items.isEmpty()) {
                                            System.out.println("====================");
                                            System.out.println("   LLISTA D'ITEMS   ");
                                            System.out.println("====================");
                                            for (int j = 0; j < items.size(); j++) {
                                                System.out.println(items.get(j));
                                            }
                                            System.out.println("====================");
                                            assignarItem = Leer.leerTexto("Digues el nom de l'bjecte que vols assignar");
                                            for (int j = 0; j < items.size(); j++) {
                                                if (items.get(i).getNomItem().equalsIgnoreCase(assignarItem)) {
                                                    if (!players.isEmpty()) {
                                                        System.out.println("====================");
                                                        System.out.println(" LLISTA DE JUGADORS ");
                                                        System.out.println("====================");
                                                        for (int k = 0; k < players.size(); k++) {
                                                            System.out.println(players.get(k));
                                                        }
                                                        System.out.println("====================");
                                                        assignarItem_P = Leer.leerTexto("A quin jugador vols assignar l'objecte?");
                                                        for (int k = 0; k < players.size(); k++) {
                                                            if (players.get(k).getName().equalsIgnoreCase(assignarItem_P)) {
                                                                //
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("Per a poder assignar un objecte has de crear algun jugador abans");
                                                    }
                                                }else{
                                                    System.out.println("Objecte incorrecte");
                                                }
                                            }
                                        }else{
                                        System.out.println("No hi ha cap item, alemnys has de crear un");
                                        }
                                    }
                                    break;
                                    
                                case 6:
                                    System.out.println("Has triat eixir");
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
                                    nomEquip = Leer.leerTexto("Quin nom vols per a l'equip?");
                                    Team equip = new Team(nomEquip);
                                    teams.add(equip);
                                    break;
                                case 2:
                                    if (!teams.isEmpty()){
                                        System.out.println("====================");
                                        System.out.println("  LLISTA D'EQUIPS   ");
                                        System.out.println("====================");
                                        for (int j = 0; j < teams.size(); j++) {
                                            System.out.println(teams.get(j));
                                        }
                                        System.out.println("====================");
                                    }else{
                                        System.out.println("No hi ha cap equip");    
                                    }
                                    break;
                                case 3:
                                    if (!teams.isEmpty()){
                                        System.out.println("====================");
                                        System.out.println("  LLISTA D'EQUIPS   ");
                                        System.out.println("====================");
                                        for (int j = 0; j < teams.size(); j++) {
                                            System.out.println(teams.get(j));
                                        }
                                        System.out.println("====================");
                                        borrarEquip = Leer.leerTexto("Digues el nom del equip que vols borar: ");
                                        for (int i = 0; i < teams.size(); i++) {
                                            if (teams.get(i).getTeamName().equalsIgnoreCase(borrarEquip)) {
                                                Team equipAssignat = teams.get(i);
                                                players.remove(equipAssignat);
                                            }else{
                                                System.out.println("Nom incorrecte");
                                            }
                                        }
                                    }else{
                                        System.out.println("Abans de borrar un equip, primer has de crear-lo");
                                    }
                                    break;
                                case 4:
                                    if (!players.isEmpty() && !teams.isEmpty()) {
                                        //Llistem els jugadors
                                        System.out.println("====================");
                                        System.out.println(" LLISTA DE JUGADORS ");
                                        System.out.println("====================");
                                        for (int i = 0; i < players.size(); i++) {
                                            System.out.println(players.get(i));
                                        }
                                        System.out.println("====================");
                                        addP_to_T = Leer.leerTexto("A quin jugador vols assignar-li un equip? ");
                                        for (int i = 0; i < players.size(); i++) {
                                            if (players.get(i).getName().equalsIgnoreCase(addP_to_T)) {
                                                Player jugadorAssignat = players.get(i);
                                                //Llistem els equips
                                                System.out.println("====================");
                                                System.out.println("  LLISTA D'EQUIPS   ");
                                                System.out.println("====================");
                                                for (int j = 0; j < teams.size(); j++) {
                                                    System.out.println(teams.get(j));
                                                }
                                                System.out.println("====================");
                                                addP_to_T_2 = Leer.leerTexto("A quin equip vols assignar-lo? ");
                                                for (int j = 0; j < teams.size(); j++) {
                                                    if (teams.get(i).getTeamName().equalsIgnoreCase(addP_to_T_2)) {
                                                        teams.get(i).getPlayers().add(jugadorAssignat);
                                                    }else{
                                                        System.out.println("Nom incorrecte");
                                                    }
                                                }
                                            }
                                        }
                                        System.out.println("");  
                                    }else{
                                        System.out.println("Es necessari que almenys exitisca un jugador i un equip");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Has triat eixir");
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
                            System.out.println("1.3.2 Mostrar objectes           ");
                            System.out.println("1.3.3 Esborrar objecte           ");
                            System.out.println("1.3.4 Assignar objecete a jugador");
                            System.out.println("1.3.5 Eixir                      ");
                            System.out.println("=================================");
                            op5 = Leer.leerEntero("Tria una opció: ");
                            switch(op5){
                                case 1:
                                    nomItem = Leer.leerTexto("Nom de l'objecte: ");
                                    pAtac = Leer.leerEntero("Punts d'atac extra: ");
                                    pDefensa = Leer.leerEntero("Punts de defensa extra: ");
                                    Item objecte = new Item(nomItem, pAtac, pDefensa);
                                    items.add(objecte);
                                    break;
                                case 2:
                                    if (!items.isEmpty()) {
                                        System.out.println("====================");
                                        System.out.println("   LLISTA D'ITEMS   ");
                                        System.out.println("====================");
                                        for (int j = 0; j < items.size(); j++) {
                                            System.out.println(items.get(j));
                                        }
                                        System.out.println("====================");
                                    }else{
                                        System.out.println("No hi ha cap objecte");
                                    }
                                    break;
                                case 3:
                                    if (!items.isEmpty()) {
                                        System.out.println("====================");
                                        System.out.println("   LLISTA D'ITEMS   ");
                                        System.out.println("====================");
                                        for (int j = 0; j < items.size(); j++) {
                                            System.out.println(items.get(j));
                                        }
                                        System.out.println("====================");
                                        borrarItem = Leer.leerTexto("Nom del item que vols borrar: ");
                                        for (int i = 0; i < items.size(); i++) {
                                            if (items.get(i).getNomItem().equalsIgnoreCase(borrarItem)) {
                                                Item objecteAssignat = items.get(i);
                                                items.remove(objecteAssignat);
                                            }else{
                                                System.out.println("Nom incorrecte");
                                            }
                                        }
                                    }else{
                                        System.out.println("Abans de borrar un objecte has de crear-lo primer");
                                    }
                                    break;
                                case 4:
                                    if (!players.isEmpty()) {
                                        if (!items.isEmpty()) {
                                            System.out.println("====================");
                                            System.out.println("   LLISTA D'ITEMS   ");
                                            System.out.println("====================");
                                            for (int i = 0; i < items.size(); i++) {
                                                System.out.println(items.get(i));
                                            }
                                            System.out.println("====================");
                                            nomItem = Leer.leerTexto("Nom de l'objecte que vols assignar a un jugador: ");
                                            for (int i = 0; i < items.size(); i++) {
                                                if (items.get(i).getNomItem().equalsIgnoreCase(nomItem)) {
                                                    Item itemAssignat = items.get(i);
                                                    
                                                    System.out.println("====================");
                                                    System.out.println(" LLISTA DE JUGADORS ");
                                                    System.out.println("====================");
                                                    for (int j = 0; j < players.size(); j++) {
                                                        System.out.println(players.get(j));
                                                    }
                                                    System.out.println("====================");
                                                    nom = Leer.leerTexto("Nom del jugador: ");
                                                    for (int j = 0; j < players.size(); j++) {
                                                        if (players.get(i).getName().equalsIgnoreCase(nom)) {
                                                            //
                                                        }else{
                                                            System.out.println("Nom incorrecte");
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("Nom incorrecte");
                                                }
                                            }  
                                        }else{
                                            System.out.println("Primer has de crear u objecte");
                                        }
                                    }else{
                                        System.out.println("Primer has de crear un jugadors");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Has triat eixir");
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
