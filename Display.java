package thegreatlabyrinth;

public class Display {
    
    
        public static void skillMenu(Player player, Skill skill){
         int[] skills = player.skills;
        
        System.out.println("== Your skills ==");
        for(int i = 1; i <= skills.length; i += 1){
            if(skills[ i - 1 ] == -1)
                System.out.println("Skill [" + i + "] Is Empty.");
            else
                System.out.println("Skill [" + i + "] " + skill.getSkillName(skills[ i - 1 ]));   
        }
    }
        public static void itemMenu(Player player, Item item){
        int[] items = player.items;
        
        System.out.println("== Your items ==");
        for(int i = 1; i <= items.length; i += 1){
            if(items[ i - 1 ] == -1)
                System.out.println("Pocket [" + i + "] No Item.");
            else
                System.out.println("Pocket [" + i + "] " + item.getItemName(items[ i - 1 ]));
            
        }
       
    }
    public static void menu(){
        System.out.println("************** [ T H E  G R E A T  L A B Y R I N T H ]  **************\n"
                + "[1] New Game\n"
                + "[2] Continue\n"
                + "[3] Exit");
    }
    
    public static void battleMenu(){
        System.out.println("[1] Attack\n"
                + "[2] Defend\n"
                + "[3] Items\n"
                + "[4] Skills");
    }
    public static void showstats(Player player,Equipment eqp){
       int playerDamage = player.baseAtk + eqp.getWeaponDamage(player.weaponID);
       int playerArmor = player.baseDef + eqp.getArmorDef(player.armorID);
                
                        System.out.println("************* YOUR CHARACTER STATS *************");
                        System.out.println("Your HP is: " + player.maxHP);
                        System.out.println("Your Class is: " + player.userclass);
                        System.out.println("Your Mana is: "+ player.mana);
                        System.out.println("Your HitRate is: " + player.hitRate);
                        System.out.println("Your Damage is: " + playerDamage);
                        System.out.println("Your Armor/Defense is: " +player.armorID); 
    }
}
    
    



