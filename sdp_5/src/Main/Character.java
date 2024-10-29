package Main;

import StatePattern.CharacterState;
import StrategyPattern.FightingStrategy;
import TemplatePattern.GameAction;
import VisitorPattern.EffectVisitor;
import StatePattern.NormalState;
import StrategyPattern.MeleeStrategy;

public class Character {
    private String name;
    private CharacterState state;
    private FightingStrategy strategy;

    public Character(String name) {
        this.name = name;
        this.state = new NormalState(this);
        this.strategy = new MeleeStrategy();
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void setStrategy(FightingStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        state.attack();
    }

    public void fight() {
        strategy.fight();
    }

    public void executeGameAction(GameAction action) {
        action.executeAction();
    }

    public void accept(EffectVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Character: " + name + ", State: " + state.getClass().getSimpleName() + ", Strategy: " + strategy.getClass().getSimpleName();
    }
}
