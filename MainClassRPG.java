package thegreatlabyrinth;

import java.io.*;

public class MainClassRPG {

    public static BufferedReader br;    
    public static Player player;
    public static Enemy enemy;
    public static Equipment eqp = new Equipment();
    public static Item item = new Item();
    public static Skill skill = new Skill();


    
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        Display.menu();
        System.out.print("Enter your choice: ");
        short choice = Short.parseShort(br.readLine());
        
        switch(choice){
            case 1:
                newGame();
                break;
            case 2:
                continue_();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                break;
            
        }
        

        

    }
    
    
    
    public static void newGame() throws IOException{
        Dialogue.welcome();
        br.readLine();
        CharacterCreation.playerName();
        String playerName = br.readLine();
        

        CharacterCreation.playerGender();
        short chooseGender = Short.parseShort(br.readLine());
        
        String playerGender = "Undefined";
        switch(chooseGender){
            case 1:
                playerGender = "Male";
                break;
            case 2:
                playerGender = "Female";
                break;
            default:
                break;
        }
        
        int playerhitRate = 8;
        int classmana = 100;
        CharacterCreation.playerRace();
        short chooseRace = Short.parseShort(br.readLine());
        
        String playerRace = "Nothing";
        switch(chooseRace){
            case 1:
                playerRace = "Elf (Nature)";
                break;
            case 2:
                playerRace = "Human (Water)";
                break;
            case 3:
                playerRace = "Dwarf (Rock)";
                break;
            case 4:
                playerRace = "Orc (Fire)";
            default:
                break;
            
        }
        int raceHP = 0;
        String raceElement = "Undefined";
        
        if(playerRace.equals("Elf (Nature)")){
            raceHP = 8;
            playerhitRate += 0;
            classmana += 50;
            raceElement = "Nature";
            
        }
        else if(playerRace.equals("Human (Water)")){
            raceHP = 10;
            playerhitRate += 0;
            raceElement = "Water";
        }
        else if(playerRace.equals("Dwarf (Rock)")){
            raceHP = 14;
            playerhitRate -= 1;
            raceElement = "Rock";
        }
        else if(playerRace.equals("Orc (Fire)")){
            raceHP = 17;
            playerhitRate -= 2;
            raceElement = "Fire";
        }
        

        
        
        
        if(playerGender.equals("Male")){
            raceHP += 2;
            playerhitRate += 1;
            
        }else if(playerGender.equals("Female")){
            playerhitRate += 1;
            classmana += 50;
            
            
        }
        
        int playermana = classmana;
        
        

        System.out.println("============ CHARACTER SHEET ==============");
        System.out.println(""
        + "Your Name is : " + playerName);
        System.out.println("Your Gender is : "+ playerGender);
        System.out.println("Your Race : "+ playerRace);
        System.out.println("Your HP is: "+ raceHP);
        System.out.println("You Mana is: "+ playermana);
        System.out.println("Your Hit Rate is: " + playerhitRate);
        System.out.println("Your Element is : " + raceElement);
        System.out.println("========== ELEMENTS =================");
        System.out.println("(!) Water Defeats Fire \n"
                + "(!) Nature Defeats Rock \n"
                + "(!) Fire Defeats Nature \n"
                + "(!) Rock Defeats Water \n"
                + "( +2 Damage to User or Enemy )");
        System.out.println("[Press enter to continue...]");
        br.readLine();
        
        int chooseClass = 1;
        player = new Player(playerName,chooseClass,chooseRace,raceHP,0,0,chooseGender,raceElement,playerhitRate,playermana,"NOTHING");
        
        Dialogue.showIntroStory();
        br.readLine();
        Dialogue.showNewGameStory();
        br.readLine();

        chapter1();
        System.out.println("[Press Enter to Continue...]");
        br.readLine();
        chapter2();
        br.readLine();
       
  
  
        
        
    }
    
    
    public static void continue_(){
        
        
    }
    
    public static void chapter1() throws IOException{
    
        
        System.out.println("*************** CHAPTER 1 ****************");
        Dialogue.ch1d1();
        br.readLine();
        Dialogue.ch1d2();
        br.readLine();
 
//--------------------------------------- PLAYER DECIDE IF EXIT OR INSPECT THE ROOM --------------------------------

       

        try{   
        Decisions.decisionch1d1();
        System.out.print("\n"
                + "Enter your Decision: ");
        short decisionch1d1 = Short.parseShort(br.readLine());
        
        switch(decisionch1d1){
            
            case 1:
                Dialogue.ch1d3_decision1();
                br.readLine();
 
            case 2:
                Dialogue.ch1d3_decision2();
                br.readLine();
                enemy = new Enemy("Wild Small Spider",30,9,3,2,6,"Nature");
                battle();

                player.playerEXP += enemy.enemyEXP;   
                Dialogue.ch1d3_decisionschest();
                        
                 int[] items = player.items;
        
                 System.out.println("== Your items ==");
                 for(int i = 1; i <= items.length; i += 1){
                 if(items[ i - 1 ] == -1)
                 player.items[i - 1] = 3;
                 
                else
                 System.out.println("Pocket [" + i + "] Slot is Full!");
                 break;
            }

            
        }
        }catch(IOException | NumberFormatException e){
            System.out.println("Error! Invalid Input! \n"
                    + "Error Found! : " + e + " \n" 
                    + "(!) Decision Auto-Picked! Replaying Last Decision...  \n"
                    + "[Press Enter to Continue...]" );
            br.readLine();
          
        }
   

    
        
    

    
        
    
//--------------------------------------- PLAYER DECIDE IF EXIT OR INSPECT THE ROOM^ --------------------------------
        Dialogue.ch1d1();
        br.readLine();
        Dialogue.ch1d3();
        br.readLine();
        Dialogue.ch1d3class();
        br.readLine();
        Dialogue.ch1d3class2();
//-------------------------------------- PLAYER FOUND STATUES, CLASS PICK -------------------------------------------
        CharacterCreation.playerClass();
        short newClass = Short.parseShort(br.readLine());
        String playerClass = player.userclass;
        switch(newClass){
            case 1:
                playerClass = "Thief";
                player.pclass = 1;
                break;
            case 2:
                playerClass = "Swordsman";
                player.pclass = 2;
                break;
            case 3:
                playerClass = "Ranger";
                player.pclass = 3;
                break;
            case 4:
                playerClass = "Mage";
                player.pclass = 4;
            default:
                break;
        }
        int classmana = player.maxMana;
        int playermana = classmana;
        int raceHP = player.hp;
        int playerhitRate = player.hitRate;
        
        if(playerClass.equals("Thief")){
            raceHP += 0;
            playerhitRate += 2;
            
        }
        else if(playerClass.equals("Swordsman")){
            raceHP += 3;
            playerhitRate -= 2;
        }
        else if(playerClass.equals("Ranger")){
            raceHP += 1;
            playerhitRate += 1;
        }
        else if(playerClass.equals("Mage")){
            raceHP += 2;
            playerhitRate -= 1;
            playermana += 50;
            player.skills[0] = 2;
        }
        
        System.out.println("You touch the Statue of the "+ playerClass +" and felt the power of the Statue. \n"
                + "You acquired the power of the Statue and gain powerful Stats. \n ");
        System.out.println("[Press enter to continue...]");
        br.readLine();
        
        Dialogue.ch1d3classdone();
        br.readLine();
//-------------------------------------- PLAYER FOUND STATUES, CLASS PICK^ -------------------------------------------
//-------------------------------------- PLAYER DECIDE IF LEFT OR RIGHT DOOR -------------------------------------    

        try{
        Decisions.decisionch1d2();
        System.out.print("\n"
        + "Enter your Decision: ");
        short decisionch1d2 = Short.parseShort(br.readLine());
        
        switch(decisionch1d2){
            case 1:
                Dialogue.ch1d4_decision1();
                br.readLine();
                Dialogue.ch1d4_talk1();
                br.readLine();
                break;
            case 2:
                Dialogue.ch1d4_decsion2();
                br.readLine();
                break;
            default:
                break;
        }
        }catch(IOException | NumberFormatException e){
            System.out.println("Error! Invalid Input! \n"
                    + "Error Found! : " + e + " \n" 
                    + "(!) Decision Auto-Picked! Replaying Last Decision...  \n"
                    + "[Press Enter to Continue...]" );
            br.readLine();

        }


    
//-------------------------------------- PLAYER DECIDE IF LEFT OR RIGHT DOOR^ -------------------------------------
    
        Dialogue.ch1d5();
        br.readLine();
        Dialogue.ch1river();
        br.readLine();
//-------------------------------------- PLAYER DECIDE IF DRINK FROM RIVER OR NO -------------------------------------  

        try{
        Decisions.decisionch1river();
        System.out.println("\n"
                + "Enter your Decison: ");
        short decisionch1river = Short.parseShort(br.readLine());
                
        switch(decisionch1river){
                    case 1:
                        Dialogue.ch1drink();
                        player.maxHP += 2;
                        player.baseDef += 1;
                        player.hp = player.maxHP;
                        br.readLine();
                        break;
                    case 2:
                        Dialogue.ch1ignore();
                        br.readLine();
                        enemy = new Enemy("Baby Hispidacta",20,6,3,2,6,"Nature");
                        battle();
                        player.playerEXP += enemy.enemyEXP;  
                        
                        Dialogue.ch1well();
                        
                        br.readLine();
                        player.maxHP += 2;
                        player.hp = player.maxHP;
                        br.readLine(); 
                        break;
                        
                }
        }catch(IOException | NumberFormatException e){
            System.out.println("Error! Invalid Input! \n"
                    + "Error Found! : " + e + " \n" 
                    + "(!) Decision Auto-Picked! Replaying Last Decision...  \n" );
            br.readLine();


    }

                playermana = player.mana;
 
    
    
//-------------------------------------- PLAYER DECIDE IF DRINK FROM RIVER OR NO^ -------------------------------------
    
}




    

    
  
        
    

public static void chapter2() throws IOException{
    
    
    System.out.println("*************** CHAPTER 2 ****************");
        Dialogue.ch2d1();
        br.readLine();
        Dialogue.ch2d2();
        br.readLine();
        //---------------------------------------- PLAYER WILL DECIDE IF APPROACH THE DEER OR NOT! ---------------------------- 

        try{   
        
         Decisions.decisionch2d2();
        System.out.println("\n"
                + "Enter your Decision: ");
        short chapter2d = Short.parseShort(br.readLine());
        switch(chapter2d){
        
            case 1:
                Dialogue.ch2d2deer();
                br.readLine();
                player.weaponID = 1;
                System.out.println("(!) "+ eqp.getWeaponName(player.weaponID) + " was equipped! (4 Damage)");
                System.out.println("[Press enter to continue...]");
                br.readLine();
                enemy = new Enemy("Bear-Like Deer",100,12,4,3,5,"NONE");
                player.playerEXP += enemy.enemyEXP;  
                battle();
                br.readLine();
                if(player.playerEXP >= 100){
                    System.out.println("Your Pendant Suddenly glows. \n"
                            + "While holding the Pendant, The Pendant showed 2 Choices. \n");
                
                switch(player.pclass){
                        case 1:
                            CharacterCreation.secondclassThief();
                            System.out.print("\n"
                                + "Enter your Decision: ");
                            short thiefsecond = Short.parseShort(br.readLine());
                            
                            switch(thiefsecond){
                                case 1:
                                    player.maxHP += 2;
                                    player.hitRate += 1;
                                    player.baseDef += 1;
                                    player.pclass = 6;
                                    player.skills[0] = 7;
                                    player.userclass = "Bandit";
                                    break;
                                case 2:
                                    player.hitRate += 3;
                                    player.baseAtk += 2;
                                    player.pclass = 7;
                                    player.skills[0] = 8;
                                    player.userclass = "Assasin";
                                    break;
                            
                            }
                    }
                    switch(player.pclass){
                        case 2:
                            CharacterCreation.secondclassSwordsman();
                            short smsecond = Short.parseShort(br.readLine());
                            switch(smsecond){
                                case 1:
                                    player.maxHP += 2;
                                    player.baseAtk += 3;
                                    player.pclass = 8;
                                    player.skills[0] = 5;
                                    player.userclass = "Knight";
                                    break;
                                case 2:
                                    player.maxHP += 4;
                                    player.baseDef += 2;
                                    player.pclass = 9;
                                    player.skills[0] = 6;
                                    player.userclass = "Crusader";
                            
                            }
                    }
                    switch(player.pclass){
                        case 3:
                            CharacterCreation.secondclassRanger();
                            short rgsecond = Short.parseShort(br.readLine());
                            switch(rgsecond){
                                case 1:
                                    player.hitRate += 2;
                                    player.baseAtk += 3;
                                    player.pclass = 10;
                                    player.skills[0] = 4;
                                    player.userclass = "Bowman";
                                    break;
                                case 2:
                                    player.hitRate += 2;
                                    player.baseAtk += 2;
                                    player.pclass = 11;
                                    player.skills[0] = 3;
                                    player.userclass = "Gunslinger";
                            
                            }
                    }
                    switch(player.pclass){
                        case 4:
                            CharacterCreation.secondclassMage();
                            short mgsecond = Short.parseShort(br.readLine());
                            switch(mgsecond){
                                case 1:
                                    player.baseDef += 1;
                                    player.mana += 150;
                                    player.pclass = 1;
                                    player.skills[1] = 1;
                                    player.userclass = "White Mage";
                                case 2:
                                    player.baseDef += 1;
                                    player.mana += 150;
                                    player.pclass = 1;
                                    player.skills[1] = 0;
                                    player.userclass = "Black Mage";
                                    
                            
                            }
                    }
                }
                System.out.println("Here is Your Character Stats: ");
                Display.showstats(player, eqp); // STATS WILL BE SHOWN HERE ( SUBCLASS DISPLAY )
                
                System.out.println("\n[Press enter to continue...]");
                br.readLine();
                
                Dialogue.ch2d2deerdialogue();
                br.readLine();
                
                Dialogue.ch2d2deerdialogue2();
                br.readLine();
                player.armorID = 2;
                System.out.println("(!) "+ eqp.getArmorName(player.armorID) + " was equipped! (+3 Armor) \n"); // LEATHER ARMOR ACQUIRED
                
                Dialogue.ch2d2deerdialogue3();
                br.readLine();
                
                Dialogue.ch2Goblin();
                br.readLine();
                
                while(true){
                  try{  
                Decisions.goblins();
                System.out.print("\n"
                + "Enter your Decision: ");
                short goblins = Short.parseShort(br.readLine());
                switch(goblins){
                    case 1: // INTIMIDATE ( CASE 1 )
//------------------------------------------ PLAYER TOOK SILVER SWORD FROM GOBLIN MAP (INTIMIDATE)  ------------------------------                       
                        Dialogue.ch2d1Goblin();
                        br.readLine();
                        
                        enemy = new Enemy("Stone Troll",120,20,8,5,6,"Rock");
                        battle();
                        player.playerEXP += enemy.enemyEXP;
                        br.readLine();
                        
                        Dialogue.ch2d2map();
                        br.readLine();
                        
                        Dialogue.ch2d2apple(); // PLAYER ATE THE APPLE ( FULL HEALTH! )
                        player.hp = player.maxHP;
                        br.readLine();
                        
                        Dialogue.ch2d2sword();
                        player.weaponID = 3;
                        System.out.println("(!) "+ eqp.getWeaponName(player.weaponID) + " was equipped! (+6 Damage) \n");
                        br.readLine();
                        Dialogue.ch2d2night();
                        br.readLine();
                        break; // CASE 1 BREAK ON INTIMIDATE GOBLINS
                        
//------------------------------------------ PLAYER TOOK SILVER SWORD FROM GOBLIN MAP(INTIMIDATE) ^ ------------------------------    
                    case 2: // FIGHT ( CASE 2 )
//------------------------------------------ PLAYER FOUGHT GOBLINS! ---------------------------------------------------                       
                        Dialogue.ch2d1fightgoblin();
                        br.readLine();
                        
                        enemy = new Enemy("Goblin",40,10,5,3,8,"Nature");
                        battle();
                        player.playerEXP += enemy.enemyEXP;
                        br.readLine();
                        
                        System.out.println("(!) You went to the next Goblin.");
                        br.readLine();
                        enemy = new Enemy("2nd Goblin",40,10,5,3,8,"Nature");
                        battle();
                        player.playerEXP += enemy.enemyEXP;
                        br.readLine();
                        
                        System.out.println("(!) You went to the next Goblin.");
                        br.readLine();
                        enemy = new Enemy("3rd Goblin",40,10,5,3,8,"Nature");
                        battle();
                        player.playerEXP += enemy.enemyEXP;
                        br.readLine();
                        System.out.println("(!) You went to the next Goblin.");
                        br.readLine();
                        
                        Dialogue.ch2d1after();// PLAYER ATE THE APPLE ( FULL HEALTH! )
                        player.hp = player.maxHP;
                        br.readLine();
                        Dialogue.ch2d2night();
                        br.readLine();
     
                        
                  
//------------------------------------------ PLAYER FOUGHT GOBLINS! ---------------------------------------------------
                }
            }   catch(IOException | NumberFormatException e){
                System.out.println("Error! Invalid Input! \n"
                    + "Error Found! : " + e + " \n" 
                    + "(!) Decision Auto-Picked! Replaying Last Decision...  \n"
                    + "[Press Enter to Continue...]" );
                br.readLine();
                break;
                }
                break; // BREAK OF THE GOBLIN EVENT ^
                }
                
                
                break;// BREAK OF CASE 1 ( Approach the Deer)
            case 2:
                Dialogue.ch2d2ignore();
                br.readLine();
                player.weaponID = 2;
                player.armorID = 1;
                System.out.println("(!) "+ eqp.getWeaponName(player.weaponID) + " was equipped! (3 Damage)");
                System.out.println("(!) "+ eqp.getArmorName(player.armorID) + " was equipped! (+1 Armor) ");
                System.out.println("[Press enter to continue...]");
                br.readLine();
                        Dialogue.ch2d2deerignore();
                        br.readLine();
                        
                        enemy = new Enemy("Swamp Elemental",50,12,5,4,7,"Water");
                        battle();
                        player.playerEXP += enemy.enemyEXP;
                        br.readLine();
                        
                        Dialogue.ch2d2swampelemental();
                        br.readLine();
                        
                        enemy = new Enemy("Swamp Elemental",50,12,5,4,7,"Water");
                        battle();
                        player.playerEXP += enemy.enemyEXP;
                        br.readLine();
                        
                        if(player.playerEXP >= 100){
                            System.out.println("Your Pendant Suddenly glows. \n"
                            + "While holding the Pendant, The Pendant showed 2 Choices. \n");
                            switch(player.pclass){
                        case 1:
                            CharacterCreation.secondclassThief();
                            System.out.print("\n"
                                + "Enter your Decision: ");
                            short thiefsecond = Short.parseShort(br.readLine());
                            
                            switch(thiefsecond){
                                case 1:
                                    player.maxHP += 2;
                                    player.hitRate += 1;
                                    player.baseDef += 1;
                                    player.pclass = 6;
                                    player.skills[0] = 7;
                                    player.userclass = "Bandit";
                                    break;
                                case 2:
                                    player.hitRate += 3;
                                    player.baseAtk += 2;
                                    player.pclass = 7;
                                    player.skills[0] = 8;
                                    player.userclass = "Assasin";
                                    break;
                            
                            }
                        switch(player.pclass){
                        case 2:
                            CharacterCreation.secondclassSwordsman();
                            short smsecond = Short.parseShort(br.readLine());
                            switch(smsecond){
                                case 1:
                                    player.maxHP += 2;
                                    player.baseAtk += 3;
                                    player.pclass = 8;
                                    player.skills[0] = 5;
                                    player.userclass = "Knight";
                                    break;
                                case 2:
                                    player.maxHP += 4;
                                    player.baseDef += 2;
                                    player.pclass = 9;
                                    player.skills[0] = 6;
                                    player.userclass = "Crusader";
                            
                            }
                    }
                    switch(player.pclass){
                        case 3:
                            CharacterCreation.secondclassRanger();
                            System.out.print("\n"
                                + "Enter your Decision: ");
                            short rgsecond = Short.parseShort(br.readLine());
                            switch(rgsecond){
                                case 1:
                                    player.hitRate += 2;
                                    player.baseAtk += 3;
                                    player.pclass = 10;
                                    player.skills[0] = 4;
                                    player.userclass = "Bowman";
                                    break;
                                case 2:
                                    player.hitRate += 2;
                                    player.baseAtk += 2;
                                    player.pclass = 11;
                                    player.skills[0] = 3;
                                    player.userclass = "Gunslinger";
                            
                            }
                    }
                    switch(player.pclass){
                        case 4:
                            CharacterCreation.secondclassMage();
                            short mgsecond = Short.parseShort(br.readLine());
                            switch(mgsecond){
                                case 1:
                                    player.baseDef += 1;
                                    player.mana += 150;
                                    player.pclass = 1;
                                    player.skills[0] = 1;
                                    player.userclass = "White Mage";
                                case 2:
                                    player.baseDef += 1;
                                    player.mana += 150;
                                    player.pclass = 1;
                                    player.skills[0] = 0;
                                    player.userclass = "Black Mage";
                                    
                            
                            }
                        }
                    }
                        Dialogue.ch2d1lost();
                        br.readLine();
                   
                        try{ // DECISIONS FOLLOW FLOWERS OR DONT
                        Decisions.flowers();
                        short flowers = Short.parseShort(br.readLine());
                        
                        switch(flowers){
                            case 1:
                            Dialogue.ch2d1follow();
                            br.readLine();
                            
                            Dialogue.ch2d1incident();
                            player.hp -= 2; // PLAYER -2 HP
                            br.readLine();
                            break;
                        case 2: 
                            
                        Dialogue.ch2d1gameover1(); // LINES 720 - 724 = PLAYER GAME OVER
                        br.readLine();
                        
                        Dialogue.ch2d1gameover();
                        System.exit(0);
                        
                        break;
           }
                        }catch(IOException | NumberFormatException e){
                        System.out.println("Error! Invalid Input! \n"
                        + "Error Found! : " + e + " \n" 
                        + "(!) Decision Auto-Picked! Replaying Last Decision...  \n"
                        + "[Press Enter to Continue...]" );
                        br.readLine();
 
        
                        }
                break;// BREAK CASE 2 ( Ignore the Deer)
                        }
        }
        }catch(IOException | NumberFormatException e){
            System.out.println("Error! Invalid Input! \n"
                    + "Error Found! : " + e + " \n" 
                    + "(!) Decision Auto-Picked! Replaying Last Decision...  \n"
                    + "[Press Enter to Continue...]" );
            br.readLine();

}                  
            //CODE START HERE AFTER SWITCH ( CHAPTER2D )
            Dialogue.ch2d2camp();
            br.readLine();
            
            Dialogue.ch2d3();
            br.readLine();
            
            Dialogue.ch2d4();
            br.readLine();
            
            Dialogue.ch2d5();
            br.readLine();
            try{
               Decisions.accessory();
               short accessory = Short.parseShort(br.readLine());
                    
                        switch(accessory){
                            case 1:
                                
                                break;//BREAK OF CASE 1 ON FINDING ACCESSORY ( RETRACE STEPS )
                            case 2:
                                Dialogue.ch2d5other();
                                br.readLine();
                                
                                Dialogue.ch2d5lost();
                                br.readLine();
                                
                                Dialogue.ch2d5trail();
                                br.readLine();
                                    
                                    try{
                                        Decisions.trail();
                                        short trail = Short.parseShort(br.readLine());
                    
                                        switch(trail){
                                            case 1:
                                                Dialogue.ch2d5followtrail();
                                                br.readLine();
                                                int[] items = player.items;
        
                                                System.out.println("== Your items ==");
                                                for(int i = 1; i <= items.length; i += 1){
                                                if(items[ i - 1 ] == -1)
                                                player.items[i - 1] = 2;
                 
                                                else
                                                System.out.println("Pocket [" + i + "] Slot is Full!");
   
                                                }
                                            break;//BREAK OF CASE 1 ON BEAR TRAIL ( FOLLOW TRAIL )
                                            case 2:
                                                Dialogue.ch2d5gameover3();
                                                br.readLine();
                                                
                                                Dialogue.ch2d1gameover1();
                                                br.readLine();
                                                
                                                System.exit(0);
                                            break;//BREAK OF CASE 2 ON BEAR TRAIL( IGNORE TRAIL GAME OVER )
                        }
            }catch(Exception e){
            System.out.println("Error! Invalid Input! \n"
                    + "Error Found! : " + e + " \n" 
                    + "(!) Decision Auto-Picked! Replaying Last Decision...  \n"
                    + "[Press Enter to Continue...]" );
            br.readLine();

}                
        }
            }catch(IOException | NumberFormatException e){
            System.out.println("Error! Invalid Input! \n"
                    + "Error Found! : " + e + " \n" 
                    + "(!) Decision Auto-Picked! Replaying Last Decision...  \n"
                    + "[Press Enter to Continue...]" );
            br.readLine();
        }
            // CODE STARTS HERE AFTER ACCESSORY AND/OR TRAIL DECISIONS!
            Dialogue.ch2d5exit();
            br.readLine();
           
}

    public static void chapter3() throws IOException{
        System.out.println("******************** CHAPTER 3 ***************************");
         Dialogue.ch3d1boss();// BOSS BATTLE
         br.readLine();
         Decisions.boss();
         short boss = 1;
         try {
            boss = Short.parseShort(br.readLine());
        } catch (Exception e){}
    switch(boss){
        case 1:
            Dialogue.ch3d1Fight();
            battle();
              enemy = new Enemy("Canyon Giant",150,35,7,5,7,"Rock");
              player.playerEXP += enemy.enemyEXP;
              br.readLine();
              Dialogue.ch3d1Canyon();
              br.readLine();          
              
            break;
        case 2:
            Dialogue.ch3d1Death();
            System.exit(0);
            break;
    
    
    
}
       Dialogue.ch3d2Canyon();
       player.hp = player.maxHP;
       br.readLine();
       Dialogue.ch3d3Bandits();
       br.readLine();
       Dialogue.ch3d3bandits2();
       br.readLine();
       Decisions.bandits();
       br.readLine();
       short bandits = 1;
       try{
           bandits = Short.parseShort(br.readLine());
       }catch(Exception e){
           System.out.println("Error! Invalid Input! \n"
                    + "Error Found! : " + e + " \n" 
                    + "(!) Decision Auto-Picked! Replaying Last Decision...  \n"
                    + "[Press Enter to Continue...]" );
            br.readLine();
       }
       switch(bandits){
           case 1: // PLAYER CONFRONTS THE BANDIT
               int playerbandits = 1;
               Dialogue.ch3d3confront2();
               br.readLine();
               Dialogue.ch3d3bandittalk();
               br.readLine();
               battle();
               enemy = new Enemy("Bandit 1",50,15,5,3,6,"Water");
               player.playerEXP += enemy.enemyEXP;
               System.out.println("(!) Then Bandit 2 charged at you... \n"
                       + "[Press Enter to Continue...]");
               br.readLine();
               battle();
               enemy = new Enemy("Bandit 2",50,16,5,3,5,"Water");
               player.playerEXP += enemy.enemyEXP;
               System.out.println("(!) Then Bandit 3 charged at you... \n"
                       + "[Press Enter to Continue...]");
               br.readLine();
               battle();
               enemy = new Enemy("Bandit 3",50,20,6,3,6,"Water");
               player.playerEXP += enemy.enemyEXP;
               br.readLine();
               
               Dialogue.ch3d3banditdefeated();
               br.readLine();
               int[] items = player.items;
        
                 System.out.println("== Your items ==");
                 for(int i = 1; i <= items.length; i += 1){
                 if(items[ i - 1 ] == -1)
                 player.items[i - 1] = 1;
                 
                else
                 System.out.println("Pocket [" + i + "] Slot is Full!");
                 }
               
               break; 
               // BREAK OF CONFRONTING THE BANDITS
           case 2: // PLAYER SNEAKS!
               Dialogue.ch3d3sneak();
               br.readLine();
               Dialogue.ch3d3sneak1();
               br.readLine();
               Decisions.sneak();
               br.readLine();
               short sneak = 1;
               try{
                   sneak = Short.parseShort(br.readLine());
               }catch(Exception e){
                   System.out.println("Error! Invalid Input! \n"
                    + "Error Found! : " + e + " \n" 
                    + "(!) Decision Auto-Picked! Replaying Last Decision...  \n"
                    + "[Press Enter to Continue...]" );
                    br.readLine();
                   
               }
                    switch(sneak){ // SWITCH OF SNEAK ( PLAYER SNEAKS )
                        case 1: // PLAYER SNEAKS ON TENT!
                            Dialogue.ch3d3sneaktent();
                            br.readLine();
                            Decisions.tentsneak();
                            br.readLine();
                                short tentsneak = 1; 
                                try{
                                    tentsneak = Short.parseShort(br.readLine());
                                }catch(Exception e){
                                    System.out.println("Error! Invalid Input! \n"
                                    + "Error Found! : " + e + " \n" 
                                    + "(!) Decision Auto-Picked! Replaying Last Decision...  \n"
                                    + "[Press Enter to Continue...]" );
                                    br.readLine();
                                }
                                    switch(tentsneak){ // SWITCH OF TENT SNEAK ( PLAYER WILL DECIDE WHAT TO DO IN TENT )
                                        case 1:
                                            Dialogue.ch3d3killtent();
                                            br.readLine();
                                            
                                            Dialogue.ch3d3overheard();
                                            br.readLine();
                                            Dialogue.ch3d3overheard1();
                                            br.readLine();
                                            Dialogue.ch3d3overheard2();
                                            br.readLine();
                                            Dialogue.ch3d3overheard3();
                                            br.readLine();
                                            Dialogue.ch3d3overheard4();
                                            br.readLine();
                                            
                                            Dialogue.ch3d3sneaked();
                                            br.readLine();
                                            player.playerEXP += 150;
                                            break; // BREAK OF CASE 1 (tentsneak) (killbandit)
                                        case 2:
                                            Dialogue.ch3d3distract();
                                            br.readLine();
                                            System.out.println("************ GAME OVER! **************");
                                            System.exit(0);
                                            break; // BREAK OF CASE 2 (tentsneak) 
                                    }
                            break;
                        case 2: // PLAYER SNEAKS ON TOWER
                            Dialogue.ch3d3sneaktower();
                            br.readLine();
                            Decisions.towersneak();
                            br.readLine();
                                short towersneak = 1;
                                switch(towersneak){ // SWITCH OF TOWER SNEAK ( PLAYER SNEAK ON TOWER )
                                    case 1: // PLAYER WILL KILL THE BANDIT IN THE TOWER
                                        Dialogue.ch3d3killtower();
                                        br.readLine();
                                        
                                        Dialogue.ch3d3overheard();
                                        br.readLine();
                                        Dialogue.ch3d3overheard1();
                                        br.readLine();
                                        Dialogue.ch3d3overheard2();
                                        br.readLine();
                                        Dialogue.ch3d3overheard3();
                                        br.readLine();
                                        Dialogue.ch3d3overheard4();
                                        br.readLine();
                                            
                                        Dialogue.ch3d3sneaked();
                                        br.readLine();
                                        player.playerEXP += 150;
                                        break;
                                    case 2: // PLAYER WILL KEEP ON SNEAKING
                                        Dialogue.ch3d3keeponsneaking();
                                        br.readLine();
                                        System.out.println("************** GAME OVER! ****************");
                                        System.exit(0);
                                        break;
                                }
                            break; // BREAK OF SNEAK
                    }
               break; // CASE 2 BREAK 
       }
        // CODE STARTS HERE AFTER BANDITS
        Dialogue.ch3d3canyon();
        br.readLine();
        Dialogue.ch3d3canyon1();
        br.readLine();
        enemy = new Enemy("Slime",20,8,6,3,6,"Water");
        player.playerEXP += enemy.enemyEXP;
        
}     
    
    
    public static void battle() throws IOException{
        while(true){
        try{
          System.out.println("===== BATTLE START====");
          player.baseDef = player.newbaseDef;
        int turn = 1;
        while(enemy.hp > 0){
            
            System.out.println("\n************ TURN " + turn + "************");
            System.out.println(enemy.name +" is ready to have a battle.");
            System.out.println("What do you want to do?");
            Display.battleMenu();
            short choice = Short.parseShort(br.readLine());
            
            switch(choice){
                
                case 1:
                    enemy.hp = player.attack(enemy, turn);
                    break;
                case 2:
                    player.defend(enemy, turn);
                    break;
                case 3:
                    items();
                    break;
                case 4:
                    skill(turn);
                    break;
            }
            if(enemy.hp > 0){
                player.hp = enemy.attack(player);
                if(player.hp <= 0){
                    System.out.println("GAME OVER!");
                    System.exit(0);
                }
            }
            
            turn += 1;
        }
        break;
        } catch (IOException | NumberFormatException e) { 

            System.out.println("Invalid input!");
            continue;
            
       }
    }
   
}
    public static void skill(int turn) throws IOException {
        Display.skillMenu(player, skill);
        while(true){
            System.out.println("Select an skill [type 0 to exit]:");
            short schoice = Short.parseShort(br.readLine());
            if(schoice != 0){
                int skillId = player.skills[schoice - 1]; //get skill id
                
            if(skillId != -1){
                String skillName = skill.getSkillName(skillId);
                String skillType = skill.getSkillType(skillId);
               
                int type = 0;
                if(skillType.equals("hp")) type = 1;
                else if(skillType.equals("damage")) type = 2;
                else if(skillType.equals("specialdamage")) type = 3;
                else if(skillType.equals("attack")) type = 4;
                else if(skillType.equals("defend")) type = 5;
                
                switch(type){
                    case 1://HP
                    if(player.maxMana <= 0 || player.mana <= 0){
                        System.out.println("(!) CANNOT CAST SKILL! NO MANA!");
                        break;
                    }
                    player.hp += skill.getSkillVal(skillId);
                    if(player.hp > player.maxHP) player.hp = player.maxHP;
                        player.mana -= skill.getManaConsumption(skillId);
                        System.out.println("You cast: " + skillName);
                        System.out.println("Your HP is now " + player.hp + " /" + player.maxHP);
                        if(player.maxMana <= 0 || player.mana <= 0){
                            System.out.println("(!) CANNOT CAST SKILL! NO MANA!");
                        }
                        if(enemy.hp >= 0){
                        System.out.println("(!) Enemy Fell down!");
                        System.out.println("VICTORY! Total number of turns: " + turn );
                        System.out.println("Remaining HP : " + player.hp);
                        System.out.println("[Press Enter to continue...]");
                        br.readLine();
                        }
                        
                        break;
                    case 2://DAMAGE
                        if(player.maxMana <= 0 || player.mana <= 0){
                            System.out.println("(!) CANNOT CAST SKILL! NO MANA!");
                        }
                        
                        enemy.hp -= skill.getSkillVal (skillId);
                        player.mana -= skill.getManaConsumption(skillId);
                        System.out.println("You cast: " + skillName);
                        System.out.println("Enemy HP is now " + enemy.hp);
                        if(enemy.hp >= 0){
                        System.out.println("(!) Enemy Fell down!");
                        System.out.println("VICTORY! Total number of turns: " + turn );
                        System.out.println("Remaining HP : " + player.hp);
                        System.out.println("[Press Enter to continue...]");
                        br.readLine();
                        }
                        
                        break;
                    case 3://SPECIALDAMAGE
                        if(player.maxMana <= 0 || player.mana <= 0){
                            System.out.println("(!) CANNOT CAST SKILL! NO MANA!");
                        }
                        int playerDamage = player.baseAtk + eqp.getWeaponDamage(player.weaponID);
                        enemy.hp -= skill.getSkillVal (skillId) + playerDamage;
                        player.mana -= skill.getManaConsumption(skillId);
                        System.out.println("You cast to your self : " + skillName);
                        System.out.println("You attacked the enemy and dealt : " + playerDamage);
                        System.out.println("Enemy HP is now " + enemy.hp);
                        if(enemy.hp >= 0){
                        System.out.println("(!) Enemy Fell down!");
                        System.out.println("VICTORY! Total number of turns: " + turn );
                        System.out.println("Remaining HP : " + player.hp);
                        System.out.println("[Press Enter to continue...]");
                        br.readLine();
                        }
                        
                        break;
                    case 4://ATTACK
                        if(player.maxMana <= 0 || player.mana <= 0){
                            System.out.println("(!) CANNOT CAST SKILL! NO MANA!");
                        }
                        player.baseAtk = player.newbaseAtk;
                        player.baseAtk = eqp.getWeaponDamage(player.weaponID) + skill.getSkillVal(skillId);
                        if(enemy.hp >= 0){
                        System.out.println("(!) Enemy Fell down!");
                        System.out.println("VICTORY! Total number of turns: " + turn );
                        System.out.println("Remaining HP : " + player.hp);
                        System.out.println("[Press Enter to continue...]");
                        br.readLine();
                        }
                        
                        
                    case 5://DEFEND
                        if(player.maxMana <= 0 || player.mana <= 0){
                            System.out.println("(!) CANNOT CAST SKILL! NO MANA!");
                        }
                        player.baseDef = player.newbaseDef;
                        player.baseDef = eqp.getArmorDef(player.armorID) + skill.getSkillVal(skillId);
                        if(enemy.hp >= 0){
                        System.out.println("(!) Enemy Fell down!");
                        System.out.println("VICTORY! Total number of turns: " + turn );
                        System.out.println("Remaining HP : " + player.hp);
                        System.out.println("[Press Enter to continue...]");
                        br.readLine();
                        }
                        
                         
                }
                break;
                }
                else
                    System.out.println("No Skill in this Slot. (Requires Specific class to Acquire)");
            }
            
            else break; 
        }
    }

    
        public static void items() throws IOException {
        Display.itemMenu(player, item);
        while(true){
            System.out.println("Select an item to use [type 0 to exit]:");
            short choice = Short.parseShort(br.readLine());
            if(choice != 0){
                int itemId = player.items[choice - 1]; //get item id
            if(itemId != -1){
                String itemName = item.getItemName(itemId);
                String itemType = item.getItemType(itemId);
                int type = 0;
                if(itemType.equals("hp")) type = 1;
                else if(itemType.equals("damage")) type = 2;
                switch(type){
                    case 1:
                    player.hp += item.getItemVal(itemId);
                    if(player.hp > player.maxHP) player.hp = player.maxHP;
                        System.out.println("You used: " + itemName);
                        System.out.println("Your HP is now " + player.hp + " /" + player.maxHP);
                        player.items[choice - 1] = -1; // remove item
                        break;
                    case 2:
                        enemy.hp -= item.getItemVal (itemId);
                        System.out.println("You used: " + itemName);
                        System.out.println("Enemy HP is now " + enemy.hp);
                        player.items[choice - 1] = -1; // remove item
                        break;
                }
                break;
                }
                else
                    System.out.println("No item in pocket!");
            }
            
            else break; 
            
        
            
        }
    }
}

    

