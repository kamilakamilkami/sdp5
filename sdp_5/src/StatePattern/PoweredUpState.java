package StatePattern;

import Main.Character;

public class PoweredUpState extends CharacterState {
    public PoweredUpState(Character character){
        super(character);
    }

    @Override
    public void attack(){
        System.out.println(character.getName() + "attacks with double strength!");
    }
}
