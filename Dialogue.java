package thegreatlabyrinth;

public class Dialogue {
    
    public static void welcome(){
        System.out.println("Welcome to the Great Labyrinth! \n"
                + "[Press enter to continue...]");
        
    }
    
    public static void showIntroStory(){
        System.out.println("Once upon a time, A Kingdom in a south, The Kingdom of Alkemia is known for its prosperity and peacefullness\n"
                + "The King was known for being kind, and the people respect him for his kindness and loyalty to his kingdom.\n "
                + "One day, a group of villagers reported to the king that other kingdoms joined forces and plotted to attack his country. \n"
                + "The King then hired a sorceress who he thought that will protect them from the attacks. \n"
                + "But, The sorceress tricked them and instead she was the one who plotted the downfall of the king. \n "
                + "She was successfull and the kingdom crumbled to pieces.\n"
                + "[Press enter to continue...]");
        
    }
    
    public static void showNewGameStory(){
        System.out.println("As one of the Generals in the Kingdom, You were chosen to restore the kingdoms former glory\n"
                + "Your job was to hunt down the sorceress who hid in a great labyrinth... and that was last thing you remembered.\n"
                + "[Press enter to continue...]");
    }
    
    public static void ch1d1(){
        System.out.println("You woke up in a dark room where only a pile of bones and skeletons can only be seen.\n"
                + "You tried to inspect the whole room, then suddenly a spirit who has a fairy-like structure appeared right before your eyes.\n \n"
                + "Spirit : Young warrior you were unconcious in this room.\n"
                + "As you tried to recall what happened and the only thing you remember was your goal in this labyrinth. \n \n"
                + "Spirit : But fear not young warrior! For i will guide you in your goal. \n"
                + "[Press enter to continue...]");
    }
    
    
    public static void ch1d2(){
        System.out.println("You noticed that you are wearing a pendant around your neck that has a strange marking. \n"
                + "You roam around the room and inspect every corner and the only thing you can find are bones and dust. \n"
                + "After exploring the room for 10 minutes, You found a wooden door and it seems to be the exit.\n \n"
                + "[Decide : Keep Inspecting the room or Go out?]\n \n"
                + "[Press enter to continue...]");
    }
    
    public static void ch1d3_decision1(){ // PLAYER EXITS THE ROOM
        System.out.println("You gave up exploring the room and instead went outside the door immediately. \n"
                + "[Press enter to continue...]");
        
    }
    
    public static void ch1d3_decision2(){ // PLAYER INSPECTS THE ROOM
        System.out.println("You decided to inspect the room further. \n"
                + "While inspecting the room once again, you found a wooden trunk. \n"
                + "And you heard weird noises from the wooden trunk, With curiosity you opened it\n"
                + "Suddenly a Wild Small Spider appeared and pounced at you. \n"
                + "[Press enter to continue...]");
    }
    public static void ch1d3_decisionschest(){
        System.out.println("After Defeating the Spider, You opened the wooden trunk. \n"
                + "You didn't find anything except a Letter saying Don't Trust. \n"
                + "You also found a Berry beside the note and you decided to pick it up. \n"
                + "(!) Berry Acquired! \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch1d3(){
        System.out.println("You went outside the room, You cant see anything since the hallway is dark.\n"
                + "You tried to find a torch but the hallway was too dark to see. The Spirit said..\n"
                + "\nSpirit : Don't worry! I'll guide you through this dark path!\n"
                + "You saw the spirit chanted a spell that instantly enlightened the way, all the torch in the wall are ignited.\n"
                + "You get one of the torch in the wall of the hallway and continued walking.\n"
                + "[Press enter to continue...]");
        
    }
    public static void ch1d3class(){
        System.out.println("After walking for a couple of minutes, The pendant around your neck is glowing. \n"
                + "You stumbled upon 4 statues. You inspected the 4 statues and it seems that each statue is holding a weapon. \n"
                + "The First statue is holding a long sword and wears a full plated armor. \n"
                + "The Second statue is holding two daggers and wears a hooded robe around him. \n"
                + "The Third statue is holding a bow and has a quivver behind its back. \n"
                + "The Last statue is holding a staff on its right and a book on its left. \n"
                + "[Press enter to continue...] ");
    }
    public static void ch1d3class2(){
        System.out.println("The Spirit explained what are the use of this statues. \n"
                + "It seems that this statues gives a person skills and power instantly just by holding it. \n"
                + "The Spirit told you that getting the statues power will benefit your journey. \n"
                + "You agreed with the Spirit and went to the 4 statues. The 4 Statues are labled. \n"
                + "[Press enter to continue...]");
    }
    public static void ch1d3classdone(){
        System.out.println("After acquiring the new powers of the statue you touched you continued walking. \n"
                + "While walking you were observing the walls of the Labyrinth and it seems there are strange marks. \n"
                + "You tried to investigate the markings in the wall but can't understand a thing. \n"
                + "You ignored the marks and continued walking in the hallway. \n"
                + "[Press enter to continue...]");
    }
    public static void ch1d4(){
        System.out.println("After walking for 30 minutes, You noticed a troll guarding two doors.\n"
                + "You tried to find other paths but there was none, so you approached the troll.\n"
                + "\nTroll: Halt! Who goes there?!\n"
                + "\nYou told the troll that you wanted to enter one of the doors behind him.\n"
                + "\nTroll: Oh. So you wanted to enter my doors? Sure! Pick one!\n \n"
                + "[Decide : First or the Second Door?]\n \n"
                + "[Press enter to continue...]");
    }
    public static void ch1d4_decision1(){ // PLAYER CHOSE LEFT DOOR
        System.out.println("You decided to choose the left door and entered it immediately. \n"
                + "Once you entered the left door, you saw another hallway and continued walking \n"
                + "After walking for 40 minutes, You noticed that you keep on passing by the same door.\n"
                + "Until you realized that you're just going back and forth and fooled by the troll \n"
                + "You went back to the door and left the hallway. \n"
                + "[Press enter to continue...]");
    }
    public static void ch1d4_talk1(){ // CONTINUATION OF DECISION ch1d4_decision1
        System.out.println("Once you exited the door, you noticed that the troll is laughing at you. \n"
                + "\n Troll : Hahahahaha i guess you chose the wrong door. \n"
                + "(Feeling emberrased)... You rushed to the right door. \n"
                + "[Press enter to continue...]");
    }
    public static void ch1d4_decsion2(){
        System.out.println("You decided to choose the right door. \n"
                + "You looked at the face of the troll and it seems he is not happy about your decision. \n"
                + "You ignored the troll and entered the right door immediately. \n"
                + "[Press enter to continue...]");
        
    }
    public static void ch1d5(){
        System.out.println("After entering the door you saw a forest. \n"
                + "The Forest is filled with bugs and animals roaming around the forest. \n"
                + "You can also feel the dark magic inside the forest. \n"
                + "You continued your journey and went inside the forest. \n"
                + "[Press enter to continue...]");
    }
    public static void ch1river(){
        System.out.println("While walking for a couple of minutes, you noticed a river nearby. \n"
                + "Feeling thirsty you're deciding whether you're gonna drink from the river or not. \n"
                + "You asked the Spirit if the river is harmful but the Spirit has no knowledge of the river. \n"
                + "[Decide: Drink from the River or Ignore and Continue walking.] \n \n"
                + "[Press enter to continue...]");
    }
    public static void ch1drink(){
        System.out.println("You decided to drink from the river, You ran at the river and have a sip. \n"
                + "You feel replenished and all your wounds have been healed. \n"
                + "(!) Full health! and +2 Health \n"
                + "[Press enter to continue...]");
    }
    public static void ch1ignore(){
        System.out.println("You ignored the river and continued walking forward. \n"
                + "Afer walking for 10 minutes you feel dizzy because you're thirst has taken over. \n"
                + "You tried to find something that will help your thirst, suddenly you spotted a well. \n"
                + "You tried to drink from the well but a Small and Hairy One-Horned Beetle came out from the bucket of the well. \n"
                + "The Spirit told you that its an Baby Hispidacta, The Baby Hispidacta Spits in venom and readys for battle.\n"
                + "[Press enter to continue...]");
    }
    public static void ch1well(){
        System.out.println("After defeating the Insect you immediately drank from the well. \n"
                + "You feel replenished and your wounds have been healed. \n"
                + "(!) Full health! and +1 Health \n"
                + "[Press enter continue...]");
    }
 //*************************************** CHAPTER 2 *************************************************************
    public static void ch2d1(){
        System.out.println("While wandering around the Forest, you noticed the insects and animals. \n"
                + "You were curios and amaze of the animals and insects because they look different and you've never seen like it. \n"
                + "One looks like a deer but has bear-like Feet, horns on its forehead and has a purplish color on its fur. \n"
                + "Some of the insects is taller than the animals in the forest and has spikes on their shells. \n"
                + "[Press enter to continue...]");
    }
    public static void ch2d2(){
        System.out.println("You wanted to inspected the deer so you tried go approach it. \n"
                + "\nSpirit : Don't! Its dangerous don't go near it! \n"
                + "Hearing the spirits warning, you step away but you're to curios. \n"
                + "[Decide : Approach the Deer or Ignore it?] \n \n"
                + "[Press enter to continue...]");
    }
    public static void ch2d2ignore(){ // PLAYER IGNORED THE DEER
        System.out.println("Hearing the Spirits warning, You agreed with her and ignored the Bear-Like Deer. \n"
                + "Wandering in the forest, you found Knife lying on the grass. \n"
                + "You picked up the Rusty Knife and decided to use it as a weapon instead of using your fist. \n"
                + "You also found Ragged Clothes nearby the pile of skeletons and equipped it immediately. \n"
                + "[Press enter to continue...]");
    }
    public static void ch2d2ignore2(){
        System.out.println("After walking through the forest ");
    }
    public static void ch2d2deer(){// PLAYER APPROACHED THE DEER AND RECEIVED A DAGGER
        System.out.println("You ignored the spirits warning and continued to approach the deer anyways. \n"
                + "As soon as you approach the deer, the deer heard your footsteps and suddenly looked at you. \n"
                + "You gave gestures that you don't mean any harm, but the deer ignored it and came charging at you. \n"
                + "You saw a Dagger pierced on a tree and you immediately picked it up. \n"
                + "[Press enter to continue...]");
    }
    public static void ch2d2deerdialogue(){
        System.out.println("You prepared your knife and ready your self to kill the Bear-Like Deer. \n"
                + "You approach the deer and tried to stab the deer, but suddenly the deer spoke. \n"
                + "\nBear-Like Deer : Wait! Your making a grave mistake!\n"
                + "\nSpirit : What!? The Deer talked!\n"
                + "You were shocked and gotten curious of the Bear-Like Deer so you tried to have conversation. \n"
                + "[Press enter to continue...]");
    }
    public static void ch2d2deerdialogue2(){
        System.out.println("You talked to the Bear-Like Deer for 30 minutes, The Deers Name is Bopis. \n"
                + "You talked about your goal and that you are finding for the sorceress that created the labyrinth. \n"
                + "\n Bopis: You Forgot your memory? Thats sad. But don't worry i can guide you to this forest! \n"
                + "Bopis notices that you have ripped clothes. He then went to a nearby Hallow tree. \n"
                + "He took out a Leather Armor Set out of the Hallow Tree and Gave it to you. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d2deerdialogue3(){
        System.out.println("You thank Bopis for the Armor and asked him to guide you to the forest. \n"
                + "While walking, You noticed that the pile of bones in the area looks weird. \n"
                + "Wounds are Fractures are rarely seen in the bones and you asked Bopis the reason why. \n"
                + "Bopis answered that they did'nt die Fighting but they died because of Old Age. \n"
                + "You wondered how they died because of ageing, While thinking a group of goblins approach your group. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d2deerignore(){
        System.out.println("You continued your journey and walked until you stumbled upon a swamp. \n"
                + "The swamp looks dangerous and the water is dark and sticky but it seems there are no signs of monsters. \n"
                + "You crossed the swamp until Two Swamp Elementals surprised you, They looked angry and wanted to fight. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d2swampelemental(){
        System.out.println("After Defeating the First Swamp Elemental, The Spirit tried to stall the other one. \n"
                + "You rush in to help the spirit, You thanked for the spirits effort. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2Goblin(){
        System.out.println("Thinking that there just mere goblins, you said to Bopis that let's just kill them. \n"
                + "But Bopis said that you should be careful Goblins are nasty, cowardly creatures they'll either fight \n"
                + "you fairly or will do something. \n"
                + "\nBopis: We could use different methods to drive off this goblins.\n"
                + "You thought of Intimidating the goblins instead of fighting them.\n"
                + "[Decide: Intimadate the Goblins or Fight them ?]\n \n"
                + "[Press enter to continue...]");
    
        
    }
    public static void ch2d1Goblin(){
        System.out.println("You chose to intimidate the Goblins, but not knowing that goblins are unfair. \n"
                + "All the goblins Laughed at you because you tried to intimidate them. \n"
                + "\nGoblin Leader: HAHAHA! you think you can intimidate us that easily! \n"
                + "\nGolin Leader: Lets see if you survive a fight with our strongest warrior.");
    }
    public static void Ch2d1Goblin2(){
        System.out.println("The Goblins sent out a 7-Ft Troll, But this is not just any ordinary troll. \n"
                + "The Trolls skin is Gray and it looks like its skin is hard as rock \n"
                + "He carries a Stone hammer and a Round wooden shield, The goblins cheered for the troll. \n"
                + "The Goblin leader ordered the troll to Fight you and your party. \n"
                + "[Press Enter to Continue...]");
    }
    
    public static void ch2d2map(){
        System.out.println("After Defeating the Stone Troll, The Goblin was amazed of your skills. \n"
                + "The Goblin Whispered among themselves until their leader step up.\n"
                + "\nGoblin Leader: You've Defeated our Strongest warrior. \n"
                + "\nGoblin Leader: We Goblins, Have been following the Strongest warrior of the Forest. \n"
                + "The Goblin Leader gave a Map leading to a Magical Sword. You Thanked them and head to where the map lead. \n"
                + "[Press Eneter to Continue...]\n");
    }
    public static void ch2d2apple(){
        System.out.println("You bid Farewell to the Goblins but before that the Goblin gave you a Pink Apple. \n"
                + "The Goblin Leader told you to eat it immediately because it will replenish your health. \n"
                + "You trusted the Goblin and ate the Pink Apple. You feel rejuvenated from the apple. \n"
                + "(!) Full Health! \n"
                + "[Press Enter to Continue...]\n");
    }
    public static void ch2d2sword(){
        System.out.println("You and your party followed the map where the magical sword is located. \n"
                + "The map lead you to a Hollow tree, The map said that the sword is inside the Tree. \n"
                + "You peeked into the hole of the Hollow tree until you saw a Silver Long Sword. \n"
                + "You were Disappointed since its not Magical at all, But you Still picked up the sword. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d1fightgoblin(){
        System.out.println("You told Bopis that you wanted to fight the goblins, The spirit agreed with your decision. \n"
                + "Bopis has no choice but to agree so you went on and fought the goblins. \n"
                + "The Goblin Leader and some of the Goblins Fled, And you tried to chase them. \n"
                + "You chased Three Goblins, And ready your self for a battle. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d1after(){
        System.out.println("After fighting the three goblins, You found a Pink Apple lying on the ground. \n"
                + "It seems that one of the goblins is carrying this Pink Apple, The Spirit Told you about the apple. \n"
                + "The Pink Apple has the power to replenish your health immediately. \n"
                + "Bopis Adviced you to eat it immediately since you were wounded from your battle, You ate the apple. \n"
                + "(!) Full Health! \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d2night(){
        System.out.println("After walking and being guided by Bopis. You realised that the Forest is dark. \n"
                + "Bopis said that he have to comeback to his family but he showed you where to go to leave the forest. \n"
                + "He also gave you a tent, firewood and some food. He also told you one thing before he left. \n"
                + "\nBopis(Whispering) : Becareful with the pendant you're wearing, All the warriors i saw wearing those are already dead. \n"
                + "You wanted to ask why but Bopis ran rapidly, You didn't want to remove the pendant because it benefits you. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d2camp(){
        System.out.println("After Camping, It was Already morning and You wokeup. \n"
                + "It seems that The Spirit is Still asleep  you sat down on a nearby tree for a while, until you noticed a skeleton nearby. \n"
                + "You saw bracelet on its arm and it has the same strange marking of your pendant, You Looked at The Spirit. \n"
                + "You compared the Strange Marking until you noticed that the Marking Looks like Fairy Wings. \n"
                + "You ignored it and went back to the camp, The Spirit was already awake and Your Party is Ready to continue. \n"
                + "[Press Enter to Continue...] ");
    }
    public static void ch2d1lost (){
        System.out.println("You and The Spirit continued walking after defeating the Swamp Elementals. \n"
                + "After Walking for an Hour, It seems that You and The Spirit is Lost in the Forest. \n"
                + "Feeling scared you looked below until you found Glowing Flowers nearby the path. \n"
                + "You are thinking that if you Followed the Flowers it will lead you out of the forest. \n"
                + "[Decide: Follow the Flowers or Continue Finding the Exit ?]\n \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d1gameover1(){
        System.out.println("You ignored the flowers since flowers can't be used like a compass. \n"
                + "You also thought that following something like a flower will worsen your travels. \n"
                + "You decided to continue finding the exit , But the Forest is too big and wide. \n"
                + "You lose hope escaping the forest and instead was forced to live here. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d1gameover(){ // FOREST GAME OVER
        System.out.println("Several Years Later, You grew old and was lying on the bed you made. \n"
                + "You regretted going to the labyrinth and finding the sorceress that destroyed your kingdom. \n"
                + "You bid farewell to The Spirit that guided you until your death. You also thank her. \n"
                + "In the end, you never saved the kingdom and you also never found the Sorceress. \n"
                + "!********************* GAME OVER *********************!");
    }
    public static void ch2d1follow(){
        System.out.println("You followed the flowers since theres no other methods you can think of. \n"
                + "You told The Spirit that its best to follow the Glowing Flower. \n"
                + "You and The Spirit Followed the Flower until you noticed that its already dark. \n"
                + "You can't continue walking since its too dark so you decided to setup a camp. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d1incident(){
        System.out.println("Seems like the lack of Camping materials make it more dangerous to camp outside. \n"
                + "You and The Spirit only collected nearby twigs and leaves and created a fire in the middle. \n"
                + "The Good Thing is that no monsters approach you but insects are the problem. \n"
                + "Being bitten by these insects, It damages your health and you feel kinda sick. \n"
                + "(!) -2 HP! \n"
                + "[Press Enter to Continue...]");
    }
    
    public static void ch2d3(){
        System.out.println("You continued walking until you finally found a light that looks like an exit. \n"
                + "\nSpirit : That is the Exit! Im Sure of it ! \n"
                + "You were happy to find out that is the Exit of the Forest, You rushed to the exit. \n"
                + "\nSpirit : Wait! Dont g- \n"
                + "You ignored what is The Spirit is Saying and head to the Exit, Until you bumped in to a Forcefield. \n"
                + "[Press Enter to Continue...]");
    }
    
    public static void ch2d4(){
        System.out.println("The Spirit let out a Sigh, She Told you that theres a condition before exiting the Dungeon. \n"
                + "Looking at the Forcefield, It seems that The Fairy Marking is Carved into the Forcefield. \n"
                + "The Spirit Told you that you have to collect 5 accessories with the same marking of the Forcefield. \n"
                + "She Also Told you that if you keep on entering without the required conditions you will die. \n"
                + "You listened to The Spirits Warning and decided that you will Follow the Conditions. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d5(){
        System.out.println("The only way to get this accessories, is the skeletons you found on your journey. \n"
                + "You were thinking if you'll go back and retrace your steps or find other skeletons. \n"
                + "You have no Map that will guide you on your journey. \n"
                + "[Decide : Retrace your Steps or Find another way.] \n \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d5retrace(){
        System.out.println("You decided to Retrace your steps and go to the Skeletons you found before. \n"
                + "Walking back to the place that you already went, You found the skeletons. \n"
                + "Each of the skeletons wears different kind of accessories but has the same marking. \n"
                + "You picked up the accessories from the skeletons and went back to the exit. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d5other(){
        System.out.println("You decided to Find other ways and find other skeletons. \n"
                + "While finding other way you dropped pebbles on the path to ignore getting lost. \n"
                + "You found new skeletons and picked up their accessories while walking. \n"
                + "When you got the required ammount of accessories you tried to went back to the exit. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d5lost(){
        System.out.println("It seems like the pebble you dropped on the path are gone and you are lost. \n"
                + "You went to different paths , climb different trees and cross rivers, \n"
                + "But you still cant find the exit, Until night came and the forest is pitch black. \n"
                + "Feeling depressed You found a Trail of a Bear near the path.  \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d5trail(){
        System.out.println("This Bear Trail is bigger than the Bear you know outside the labyrinth. \n"
                + "You were thinking if following the Trail will show you the way to the Exit. \n"
                + "[Decide: Follow the Trail or Keep Finding other ways.] \n \n"
                + "[Press Enter to Continue]");
    }
    public static void ch2d5gameover3(){
        System.out.println("You ignored the Bear Trail since it looks suspicious. \n"
                + "You decided to continue finding the exit , But the Forest is too big and wide. \n"
                + "You lose hope escaping the forest and instead was forced to live here. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d5followtrail(){
        System.out.println("You decided to follow the Trail since theres no any other options left. \n"
                + "While following the trail you found a Bomb on a nearby sachel. \n"
                + "(!) Bomb Acquired! \n"
                + "After following you finally found the Exit and The Spirit is waiting for you. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch2d5exit(){
        System.out.println("After acquiring the accesories to meet the conditions of the exit, \n"
                + "You gave the accessories to The Spirit and told that you are done with your task. \n"
                + "The Spirit chanted something that made the 5 accessories glow, until the forcefield shattered. \n"
                + "The Exit is open and you decided to leave the Forest once and for all and continue your journey. \n"
                + "[Press Enter to Exit...]");
    }//CHAPTER 3
    public static void ch3d1boss(){
        System.out.println("After a few minutes walking through the forest you finally saw a path out the enchated forest. \n"
                + "Once you were out the forest you sighted a Canyon but there was one problem there's a Huge Giant that,"
                + "was guarding the gateway through the canyon. \n"
                + "You were looking a path around the Giant, but there was none so you instead try to talked to giant and \n"
                + "asked if you could pass through the gates."
                + "\nGiant: Who goes there?\n"
                + "\nGiant: Ahh so a young warrior wanted pass through these gates.\n"
                + "\nGiant: Hahaha! well the only way i will allow you to pass is if you defeat me on battle.\n"
                + "\nGiant: So whats it gonna be? "
                + "\nGiant: Fight me and you will be allowed to pass through these gates"
                + "\nGiant: Or run and I shall eat you alive"
                + "[Decide: Fight the  Giant or Die ?]\n \n"
                + "[Press Enter to Continue...]");
    }
    //BOSS BATTLE
    public static void ch3d1Fight(){
        System.out.println("You laughed and told the Giant that you wanted to fight \n"
                + "Readying you weapons you walk infron of the giant and told that you are ready. \n"
                + "\nGiant: Hahaha, Its been a long time since I've engaded in battle\n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d1Death(){
        System.out.println("You were scared of the Giant so you decided to accept your fate. \n"
                + "\nGiant: Coward! prepare to die.\n"
                + "[Press Enter to Continue...]");
    }
    //CHAPTER THREE (CANYONS)
    public static void ch3d1Canyon(){
        System.out.println("After a fierce battle with a the giant happly let us throught the gates.\n"
                + "While entering the gates the giant suddenly talked.\n"
                + "\nGiant: Becareful inside the canyon is full of danger. \n"
                + "\nGiant: One last thing, know who you can trust. \n");
    }
    
    public static void ch3d2Canyon(){
        System.out.println("Once in the canyon you were amazed on how big and vass the canyons are.\n"
                + "Whilew walking, you noticed a well near by, after the battle with the giant you were tired.\n"
                + "Hoping that the well will replenish your health you decided to drink from the well."
                + "(!) Full Health\n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3Bandits(){
        System.out.println("After drinking from the well you continue your way through the canyons.\n"
                + "While walking through the canyons you noticed a group of bandits blocking your way\n"
                + "You were tired from walking through the canyons for 20 minutes, You tried to reason with them.\n"
                + "You asked if you could pass through the canyons. They told you to choose other paths instead.\n"
                + "[Press Enter to Continue...]");
        
    }
    public static void ch3d3bandits2(){
        System.out.println("The Spirit told you that this is the only path to continue your journey.\n"
                + "Since there is no other choice, You told the spirit to just confront them.\n"
                + "The Spirit disagree with your decisions since The Bandits also has a role of being Guards of the Canyons. \n"
                + "The Spirit told you that you can sneak at night if possible. And avoid being caught.\n"
                + "[Decide : Sneak at Night or Confron them] /n /n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3confront(){// PLAYER CONFRONTED THE BANDITS
        System.out.println("You told The Spirit that you'll just confront them instead of waiting till night. \n"
                + "The Spirit said that it was your choice anyways and agreed to help you against the bandit. \n"
                + "You went infront of the Group of bandits and readied your weapon and you warned them. \n"
                + "You said that you wanted to pass through or else you 'll have no choice but to kill them. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3confront2(){
        System.out.println("The Bandits Laugh and they also prepared their weapons. \n"
                + "You counted how many bandits are their, and it seems that they are many. \n"
                + "The Spirit winked at you like she'll do something about it, The Spirit Casted something. \n"
                + "After a while, You noticed that most of the bandits are asleep. And 3 Strong Bandits are left. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3bandittalk(){
        System.out.println("Bandit 1: Wait, What happened to our fellow bandits! What magic is this!? \n"
                + "\nBandit 2: I think its that Spirits Magic that caused all this! Becareful! \n"
                + "\nBandit 3: That Spirit, Looks familiar... I Think i've seen her many times before... \n"
                + "\nBandit 1&2 : Nevermind that, Lets just kill them! \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3banditdefeated(){ // END OF CONFRONT THE BANDITS
        System.out.println("After defeating the bandits, You found a satchel lying on the body of one of the bandits. \n"
                + "You decided to open the satchel and found a Hi-Potion inside of the satchel. \n"
                + "You picked up the Hi-Potion and place it into your inventory. \n"
                + "(!) +1 Hi-Potion\n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3sneak(){
        System.out.println("You agreed with the Spirits proposal and decided to sneak when its night. \n"
                + "You and The Spirit waited rest and on a nearby tree and waited till night. \n"
                + "Night came, You told the spirit that it is time to sneak to the bandits camp. \n"
                + "The Spirit casted something that can conceal your weapon and armors noise. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3sneak1(){
        System.out.println("Spectating the bandits camp, You found 2 possible buildings to enter. \n"
                + "1. A Tent, Where one bandit is guarding at the entrance. \n"
                + "2. Below the Tower, Where 2 bandits are patrolling the area. \n"
                + "[Decide : The Tent or Below the Tower] \n \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3sneaktent(){// PLAYER SNEAK ON TENT
        System.out.println("You decided to sneak to the tent, While sneaking you did'nt notice the bandit. \n"
                + "The Bandit is outside the tent guarding, But he is kinda sleepy. \n"
                + "What will you do? Throw something to distract or Sneak behind and kill him? \n"
                + "(When you're caught, Its an automatic Gameover) \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3sneaktower(){
        System.out.println("You decided to sneak to the tower, and sneak right through the tower. \n"
                + "It seems you can't sneak further since there is a bandit at the tower watching. \n"
                + "What will you do? Go up and kill the bandit or Keep on sneaking? \n"
                + "(Whern you're caught, Its an automatic Gameover) \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3killtent(){
        System.out.println("You decided to go behind the guard and kill him to enter the tent. \n"
                + "While sneaking behind , You were surpirsed that he did'nt notice you. \n"
                + "You took this oppurtunity and killed the bandit guarding the tent. \n"
                + "You killed the bandit guarding the tent and killed , After that you entered the tent. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3insidetent(){
        System.out.println("Since its night, Most of the bandits in the tents are sleeping. \n"
                + "Sneaking and ignoring the bandits, You sneak on every tent easily. \n"
                + "Since the Tents are near the other way you sneaked easily. While sneaking you overheard something. \n"
                + "[Press Enter to Continue...] ");
    }
    public static void ch3d3overheard(){
        System.out.println("Bandit 3: (While Drinking Alcohol) I'ght! Im gonna tell you guys a secret! \n"
                + "\nBandit 1 : (Drunk) What?! A Story from an Old Man! Im Curious, C'mon tell tell the tale! \n"
                + "\nBandit 3: Ok, ok! This is the story of the one who created the labyrinth! \n"
                + "\nBandit 2: Story of the one who created the labyrinth?! Ok Bring it! \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3overheard1(){
        System.out.println("(Bandit 3 Narrating The Story) Long ago, There was a Fairy who lives on a forest. \n"
                + "The Fairy is not ordinary, This kind of Fairy is Different from the rest. \n"
                + "The Fairies Task was to Protect and Guard the Forest they were assigned too, But this fairy did'nt listen. \n"
                + "She Played with her powers and Fooled people who enters her forest. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3overheard2(){
        System.out.println("Until one day, A King was Displeased with this so he ordered his troops to destroy the forest. \n"
                + "The King was Successful and the Forest which the fairy is guarding was destroyed. \n"
                + "The Fairy gotten mad and sword that she will destroy every kingdom she see. \n"
                + "One morning, She disguised as a Beautiful Woman and sedduced the king. \n"
                + "She became the new queen. Then night came She killed The King that destroyed her forest. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3overheard3(){
        System.out.println("No Safeplace to return too, She used almost all of her power to create a Dungeon. \n"
                + "After escaping , She is somewhat happy what she did and wanted to try it again. \n"
                + "Everytime a King from a Kingdom needed something, She goes there and destroys the kingdom. \n"
                + "Whether its a Nice or Bad Kingdom, It does'nt Matter, She did this for Many years. \n"
                + "The Dungeon also Grew and Turned into a Labyrinth Where the People who hunts her entered. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3overheard4(){
        System.out.println("But thats not all, The Fairy also played with- \n"
                + "The Story was cut, You wondered why the bandit didn't continue his story. \n"
                + "You saw that the group of bandits was already sleeping. \n"
                + "You continue sneaking through the tents until you found the exit. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3sneaked(){
        System.out.println("Sneaking Successfully, you've gained Exp! \n"
                + "(!) + 150 EXP! \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3distract(){
        System.out.println("You decided to distract the bandit, You picked up a stone and threw it. \n"
                + "The Bandit who is sleepy was alerted and woke up immediately. \n"
                + "He Traced where the stone came from until he found you. \n"
                + "You were captured, Interrogated, And killed at the end. \n"
                + "You regretted your decision and failed to find the sorceress. \n");
    }
    public static void ch3d3killtower(){
        System.out.println("You decided to kill the bandit up the tower, You sneaked going up. \n"
                + "The Bandits back was opened, So you decided to kill him. After that you sneaked out. \n"
                + "Since there is no one watching you. You easily sneaked through until you overheard a Converstion. \n"
                + "[Press Enter to Continue...]");
        
    }
    public static void ch3d3keeponsneaking(){
        System.out.println("You decided to keep on sneaking and ignored the Bandit watching at the tower. \n"
                + "While sneaking , You thought that he cant see you, But then the bandit shouted. \n"
                + "It seems that you were found out and the Bandits caught you. \n"
                + "You tried to fight back but you failed and you were killed in action. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3canyon(){
        System.out.println("After you reached your path, You continued your journey. \n"
                + "While walking, You were observing The Canyons, It was a Normal canyon unlike the forest. \n"
                + "But theres something different, The Lake below has a weird color, It looks like a purple lake. \n"
                + "The monsters here looks dangerous, Huge monsters and Golems can be seen from afar. \n"
                + "But it looks like these monsters are not Dangerous unless if you did something bad to them. \n"
                + "[Press Enter to Continue...]");
    }
    public static void ch3d3canyon1(){
        System.out.println("You noticed that the bodies and skeletons is less than there is in the forest. \n"
                + "While walking and The Spirit as a guide, It looks like a Slime jumped at you. \n"
                + "[Press Enter to Continue...] ");
    }
    public static void ch3d3slime(){
        System.out.println("After defeating the Slime, ");
    }
    
    
}
