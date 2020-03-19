package thegreatlabyrinth;

import java.util.Random;

public class Enemy {
    
    public String name;
    public int weaponID;
    public int hp;
    public int baseAtk;
    public int baseDef; 
    public int hitRate;
    public String element;
    public int enemyEXP;

    
    
        public Enemy(String name, int enemyEXP  , int hp, int baseAtk, int baseDef, int hitRate, String element){
            
        this.name = name;
        this.hp = hp;
        this.baseAtk = baseAtk;
        this.baseDef = baseDef;
        this.hitRate = hitRate;
        this.element = element;
        this.enemyEXP = enemyEXP;
 
        
        }
        
        public int attack(Player player){
        Random rand = new Random();
        Equipment eqp = new Equipment();
        int missRate = rand.nextInt(11);
        if(hitRate > missRate){ // hit
            
            int enemyDamage = this.baseAtk;
            if(element.equals("Fire") && player.element.equals("Nature")){
                enemyDamage += 2;
            }else if(element.equals("Water") && player.element.equals("Fire")){
                enemyDamage += 2;
            }else if(element.equals("Nature") && player.element.equals("Rock")){
                enemyDamage += 2;
            }else if(element.equals("Rock") && player.element.equals("Water")){
                enemyDamage += 2;
            }
            int playerDamageTaken = enemyDamage - (player.baseDef + eqp.getArmorDef(player.armorID));
            if(playerDamageTaken <= 0) playerDamageTaken = 0;
            player.hp -= Math.abs(playerDamageTaken);
            System.out.println(this.name + " attacked!");
            System.out.println("You took " + Math.abs(playerDamageTaken) + " damage.");
            System.out.println("Your HP: " + player.hp);
            System.out.println("Your Mana: "+ player.mana);
        }
        else{ // miss
            System.out.println(this.name + " attacked but missed!");
            System.out.println("Your HP: " + player.hp);
        }
        
        return player.hp;
    }
    

    
}

