package VisitorPattern;

import Main.Character;

public class DamageEffectVisitor implements EffectVisitor{
    @Override
    public void visit(Character character){
        System.out.println(character.getName() + " takes damage!");
    }
}
