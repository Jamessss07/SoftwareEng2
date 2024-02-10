# Problem

__Suppose we have three types of characters in a GameApp:__

1. Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
2. Wizard: Casts spells; uses magic barrier to defend
3. Archer: Shoots arrows; uses dodge to to defend

__Implement two types of Strategy:__

__A.  DefenseStrategy__
1. Shield
2. Dodge
3. CreateMagic

__B.  AttackStrategy__
1.  CastSpell
2.  ShootArrow
3.  SwingSword

__Refactor the existing codes and provide the UML Diagram:__

        public class Character {
            private String type;
        
            public Character(String type) {
                this.type = type;
            }
        
            public void attack() {
                if (type.equals("Knight")) {
                    System.out.println("Knight attacks with a sword!");
                } else if (type.equals("Wizard")) {
                    System.out.println("Wizard casts a spell!");
                } else if (type.equals("Archer")) {
                    System.out.println("Archer shoots an arrow!");
                }
            }
        
            public void defend() {
                if (type.equals("Knight")) {
                    System.out.println("Using a shield to defend!");
        	System.out.println("Dodgin to avoid attack!");
                    System.out.println("Creating a magic barrier for defense!"");		
        
                } else if (type.equals("Wizard")) {
                    System.out.println("Creating a magic barrier for defense!"");
                } else if (type.equals("Archer")) {
                    System.out.println("Using a shield to defend!"");
                }
            }
        }

# UML Class Diagram
![Strategy Pattern](https://github.com/RouteGodzu/SoftwareEng2/assets/103111416/43426830-1a41-48dc-9767-4df9194d4ae9)


