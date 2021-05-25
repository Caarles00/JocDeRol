
package joc;


public class Item {
    String nomItem;
    int attcakBonus;
    int defenseBonus;

    //Constructor
    public Item(String nomItem, int attcakBonus, int defenseBonus) {
        this.nomItem = nomItem;
        this.attcakBonus = attcakBonus;
        this.defenseBonus = defenseBonus;
    }

    @Override
    public String toString() {
        return this.nomItem + " BA: " + this.attcakBonus + " / " + " BD: " + this.defenseBonus;
    }
    
    
}
