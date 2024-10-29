package VisitorPattern;

import Main.Character;

public class BoostEffectVisitor implements EffectVisitor{
    @Override
    public void visit(Character character){
        System.out.println(character.getName() + "receives a power boost!");
    }

}
