package StatePattern;

import Main.Character;

public abstract class CharacterState {
    protected Character character;

    public CharacterState(Character character){
        this.character = character;
    }

    public abstract void attack();
}
