package StrategyPatternSW;

public class Wizard implements SkillsType {
    public String output = new String();
    @Override
    public String attack(){
        CastSpell castSpell = new CastSpell();
        output += "Wizard: \n" + castSpell.attack();
        return output;
    }

    @Override
    public String defend(){
        output = "";
        CreateMagic barrier = new CreateMagic();
        output += barrier.defend() +"\n";
        return output;
    }
}