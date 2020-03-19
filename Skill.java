package thegreatlabyrinth;

public class Skill {
    
    private String[] skillName = {
        "FireBall (10 Damage | -70 Mana)", // BLACK MAGE
        "Cura (Restore 5 Health | -90 Mana)", // WHITE MAGE
        "Arcane Bolt (5 Damage | -55 Mana)", // MAGE
        "Quick Shot (7 Damage | -50 Mana)", // GUNSLINGER
        "Better Aim (+3 Base Damage, Sure Hit| -60 Mana)", //BOWMAN
        "Prepared Strike(+7 Base Damage| -65 Mana", // KNIGHT
        "Enchance Defend(+5 Defend | -65 Mana)", //CRUSADER
        "Strong Attack (7 Damage | -60 Mana)", //BANDIT
        "Stab (11 Damage | -95 Mana) " // ASSASSIN

    };
    
    private String[] skillType = {
        "damage",
        "hp",
        "damage",
        "damage",
        "specialdamage",
        "attack",
        "defend",
        "damage",
        "damage"

    };
    
    private int[] skillVal = {
        10, // Fireball
        5, // Cura
        5, // Arcane bolt
        7, // Quick Shot
        3, // Better Aim
        7, // Prepared Strike
        5, // Enchance Defend
        7, // Strong Attack
        11 // Stab
        
    };
    
    private int[] manaConsumption = {
        70, // Fireball
        90,// Cura
        55, // Arcane Bolt
        50, // Quick Shot
        60, // Better Aim
        65, // Prepared Strike
        65, // Enchance Defend
        60, // Strong Attack
        90 // Stab
            
    };
    
    public String getSkillName(int skillId){
        return skillName[skillId];
    }
    
    public String getSkillType(int skillId){
        return skillType[skillId];
    }
    
    public int getSkillVal(int skillId){
        return skillVal[skillId];
    }
    public int getManaConsumption (int skillId){
        return manaConsumption[skillId];
    }
}
