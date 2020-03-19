package thegreatlabyrinth;

public class Equipment {
    
    public String[] weaponName = {
        "Fist",
        "Dagger",
        "Rusty Knife",
        "Silver Long Sword"
    };
    
    public int[] weaponDamage = {
        2,// Fist
        4, // Dagger
        3, // Rusty Knife
        6 // Silver Long Sword
    };
    
    public String[] armorName = {
        "Cloth Armor",
        "Ragged Clothes",
        "Leather Armor"

    };
    
    public int[] armorDef = {
        1,// Cloth Armor
        2,// Ragged Clothes
        4//Leather Armor
            

    };
    
    public String getWeaponName(int itemId){
        return this.weaponName[itemId];
    }
    
    public int getWeaponDamage(int itemId){
        return this.weaponDamage[itemId];
    }
    
    public String getArmorName(int itemId){
    return this.armorName[itemId];
    }
    
    public int getArmorDef(int itemId){
        return this.armorDef[itemId];
    }
    
    
}
