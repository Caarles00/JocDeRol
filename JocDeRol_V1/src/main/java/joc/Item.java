
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

    public String getNomItem() {
        return nomItem;
    }

    public int getAttcakBonus() {
        return attcakBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    @Override
    public String toString() {
        return this.nomItem + " BA: " + this.attcakBonus + " / " + " BD: " + this.defenseBonus;
    }
    
    
}
