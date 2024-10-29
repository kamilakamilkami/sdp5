package VisitorPattern;

import Main.Character;

public interface EffectVisitor {
    void visit(Character character);
}
