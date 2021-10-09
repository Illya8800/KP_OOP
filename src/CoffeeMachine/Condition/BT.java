package CoffeeMachine.Condition;

import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.Drink.Decorator.Shnek;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public abstract class BT implements ActionListener {
    private CoffeeMachine cm = new CoffeeMachine();
    protected ArrayList<Shnek> shneks = cm.getShneks();

}
