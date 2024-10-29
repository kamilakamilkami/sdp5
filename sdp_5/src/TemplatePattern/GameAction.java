package TemplatePattern;

public abstract class GameAction {
    public final void executeAction(){
        System.out.println("Starting action...");
        action();
        System.out.println("Action complete.\n");
    }

    protected abstract void action();
}
