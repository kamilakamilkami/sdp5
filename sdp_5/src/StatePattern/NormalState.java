package StatePattern;

import Main.Character;

public class NormalState extends CharacterState{
    public NormalState(Character character){
        super(character);
    }
    @Override
    public void attack(){
        System.out.println(character.getName() + "attacks with normal strength");
    }

}
