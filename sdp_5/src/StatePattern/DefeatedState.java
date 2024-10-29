package StatePattern;

import Main.Character;

public class DefeatedState extends CharacterState {
    public DefeatedState(Character character){
        super(character);
    }
    @Override
    public void attack(){
        System.out.println(character.getName() + "is defeated and cannot attack");
    }
}
