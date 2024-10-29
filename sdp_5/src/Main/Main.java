package Main;

import StatePattern.PoweredUpState;
import StrategyPattern.MagicStrategy;
import TemplatePattern.AttackAction;
import TemplatePattern.DefendAction;
import TemplatePattern.HealAction;
import VisitorPattern.BoostEffectVisitor;
import VisitorPattern.DamageEffectVisitor;

public class Main {
    public static void main(String[] args) {

        Character hero = new Character("Hero");

        System.out.println(hero);

        hero.attack();
        hero.setState(new PoweredUpState(hero));
        hero.attack();

        hero.fight();
        hero.setStrategy(new MagicStrategy());
        hero.fight();

        hero.executeGameAction(new AttackAction());
        hero.executeGameAction(new DefendAction());
        hero.executeGameAction(new HealAction());

        hero.accept(new BoostEffectVisitor());
        hero.accept(new DamageEffectVisitor());  
    }
}
