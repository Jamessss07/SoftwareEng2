package StrategyPatternSW;
public class Archer implements SkillsType {
    public String output = new String();

    @Override
    public String attack(){
        ShootArrow shootArrow = new ShootArrow();
        output += "Archer:\n" + shootArrow.attack();
        return output;
    }

    @Override
    public String defend(){
        output = "";
        Shield shield = new Shield();
        output += shield.defend() + "\n";
        return output;
    }
}