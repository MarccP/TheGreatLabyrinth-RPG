package thegreatlabyrinth;

public class CharacterCreation {

    
    public static void playerName(){       
        System.out.print("So, What is your name? : ");
    }
    
    public static void playerGender(){
        System.out.println("Ok, Are you a Male or A Female? :");
        System.out.println(" \n"
                + " [1] Male (+2 HP) \n"
                + " [2] Female (+1 HitRate, +50 Mana)\n");
    }
    
    public static void playerRace(){
                
        System.out.print("What is your race? :");
        
                System.out.print(" \n"
                + " [1] Elf (Nature, 8 HP , +50 Mana) \n"
                + " [2] Human (Water, 10 HP) \n"
                + " [3] Dwarf (Rock , 14 HP , -1 HitRate)\n"
                + " [4] Orc (Fire , 17 HP , -2 HitRate)\n");
        
    }
    public static void playerClass(){
        System.out.println("\n [Choose a Statue...]");
        System.out.println("\n"
                + " [1] Statue of the Thief (+2 HitRate)\n"
                + " [2] Statue of the Swordsman (+3 HP , -2 HitRate)\n"
                + " [3] Statue of the Ranger (+1 HP , +1 HitRate)\n"
                + " [4] Statue of the Mage (+2 HP , -1 HitRate)\n");
    }
    public static void secondclassThief(){
            System.out.println("******** SECOND CLASS SELECTION ******** \n"
                    + "[1] Bandit \n"
                    + "[2] Assasin \n");
    }
    public static void secondclassSwordsman(){
        System.out.println("******** SECOND CLASS SELECTION ******** \n"
                    + "[1] Knight \n"
                    + "[2] Crusader \n");
    }
    public static void secondclassRanger(){
        System.out.println("******** SECOND CLASS SELECTION ******** \n"
                    + "[1] Bowman \n"
                    + "[2] Gunslinger \n");
    }
    public static void secondclassMage(){
        System.out.println("******** SECOND CLASS SELECTION ******** \n"
                    + "[1] White Mage \n"
                    + "[2] Black Mage \n");
    }    
    
    
}
