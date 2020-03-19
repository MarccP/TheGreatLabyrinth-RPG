package thegreatlabyrinth;

import java.util.Random;

public class Player {
    
    public String name;
    public int race;
    public int elementID;
    public int weaponID;
    public int armorID;
    public int hp;
    public int maxHP;
    public int baseAtk;
    public int baseDef; 
    public int hitRate;
    public int[] items = new int[5];
    public int[] skills = new int [5];
    public int gender;
    public int pclass;
    public String element;
    public int playerEXP;
    public int mana;
    public int defend;
    public int maxMana;
    public int newbaseDef;
    public String userclass;
    public int newbaseAtk;
    
    public Player(String name,int pclass,int race,int hp, int weaponID, int armorID,int gender,String element,int hitRate,int mana,String userclass){
         //items
        items[0] = -1; // no item
        items[1] = -1;// no item
        items[2] = -1;// no item
        items[3] = -1;// no item
        items[4] = -1;// no item
        //skills
        skills[0] = -1; // no skill
        skills[1] = -1; // no skill
        skills[2] = -1; // no skill
        skills[3] = -1; // no skill
        skills[4] = -1; // no skill
        this.name = name;
        this.gender = gender;
        this.pclass = pclass;
        this.race = race;
        this.elementID = 0;
        this.weaponID = weaponID;
        this.armorID = armorID;
        this.playerEXP = 0;
        this.hp = hp;
        this.baseAtk = 1;
        this.baseDef = 1;
        this.hitRate = hitRate;
        this.element = element;
        this.maxHP = this.hp;
        this.mana = mana;
        this.maxMana = this.mana;
        this.defend = 2;
        this.newbaseDef = baseDef;
        this.newbaseAtk = baseAtk;
        this.userclass = userclass;
 

        
        
    }    
    
     public int attack(Enemy enemy, int turn){
        Random rand = new Random();
        Equipment eqp = new Equipment();
        int missRate  = rand.nextInt(10) + 1;
        int castRate = rand.nextInt(10) + 1;
        
        if(this.hitRate > missRate){ // Hit

            int playerDamage = this.baseAtk + eqp.getWeaponDamage(this.weaponID);
            if(element.equals("Fire") && enemy.element.equals("Nature")){
                playerDamage += 2;
            }else if(element.equals("Water") && enemy.element.equals("Fire")){
                playerDamage += 2;
            }else if(element.equals("Nature") && enemy.element.equals("Rock")){
                playerDamage += 2;
            }else if(element.equals("Rock") && enemy.element.equals("Water")){
                playerDamage += 2;
            }
            int enemyDamageTaken = enemy.baseDef - playerDamage;
            if(enemyDamageTaken >= 0) playerDamage = 0;
            enemy.hp -= Math.abs(enemyDamageTaken);
            System.out.println("You attacked with your " + eqp.getWeaponName(this.weaponID));
            System.out.println(enemy.name + "took (!) " + Math.abs(enemyDamageTaken) + " damage.");
            if(enemy.hp == 0){
                System.out.println("(!) Enemy Fell down!");
                System.out.println("VICTORY! Total number of turns: " + turn );
                System.out.println("Remaining HP : " + this.hp);
                System.out.println("[Press Enter to continue...]");
            }
            else System.out.println("Enemy HP: "+ enemy.hp);
        }
        else{ // Miss
            System.out.println("You attacked with your "+ eqp.getWeaponName(this.weaponID) + " but missed");
            System.out.println("Enemy HP: "+ enemy.hp);
            
        }
        
        return enemy.hp;
    }


     
     public int defend(Enemy enemy, int turn){
         Random rand = new Random();
         Equipment eqp = new Equipment();
         int counterRate  = rand.nextInt(11) + 1;
         
          if(this.hitRate > counterRate){
            int counterDamage = this.baseAtk + eqp.getWeaponDamage(this.weaponID);
            int playerDamage = counterDamage - 2;
            if(element.equals("Fire") && enemy.element.equals("Nature")){
                playerDamage += 2;
            }else if(element.equals("Water") && enemy.element.equals("Fire")){
                playerDamage += 2;
            }else if(element.equals("Nature") && enemy.element.equals("Rock")){
                playerDamage += 2;
            }
            int enemyDamageTaken = enemy.baseDef - playerDamage;
            if(enemyDamageTaken >= 0) playerDamage = 0;
            enemy.hp -= Math.abs(enemyDamageTaken);
            System.out.println("You countered the enemy attack with your " + eqp.getWeaponName(this.weaponID));
            System.out.println(enemy.name + "took (!) " + Math.abs(enemyDamageTaken) + " damage.");
            if(enemy.hp == 0){
                System.out.println("(!) Enemy Fell down!");
                System.out.println("VICTORY! Total number of turns: " + turn );
                System.out.println("Remaining HP : " + this.hp);
                System.out.println("[Press Enter to continue...]");
            }
            else System.out.println("Enemy HP: "+ enemy.hp);
          }
        else{ // Miss
            this.baseDef = this.defend + eqp.getArmorDef(this.armorID);
            
            
        }
            return this.baseDef;
    
    }
}