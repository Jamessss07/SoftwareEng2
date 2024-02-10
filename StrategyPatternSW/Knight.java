package StrategyPatternSW;

public class Knight implements SkillsType {
    public String output = new String();
    @Override
    public String attack(){
        SwingSword swingSword = new SwingSword();
        output += "Knight: \n" + swingSword.attack();
        return output;
    }

    @Override
    public String defend(){
        output = "";
        Shield shield = new Shield();
        Dodge dodge = new Dodge();
        CreateMagic barrier = new CreateMagic();
        output +=  shield.defend() + "\n" +
                   dodge.defend() + "\n" +
                   barrier.defend() +"\n";
        return output;
    }
}
