package thegreatlabyrinth;

public class Item {
    
    private String[] itemName = {
        "Potion (Restores 10 HP)",
        "Hi-Potion (Restores 25 HP)",
        "Bomb (Deals 10 damage to the enemy)",
        "Berry (Restores 5 HP)"
    };
    
    private String[] itemType = {
        "hp",
        "hp",
        "damage",
        "hp"
    };
    
    private int[] itemVal = {
        10,
        25,
        10,
        5
    };
    
    public String getItemName(int itemId){
        return itemName[itemId];
    }
    
    public String getItemType(int itemId){
        return itemType[itemId];
    }
    
    public int getItemVal(int itemId){
        return itemVal[itemId];
    }
}
