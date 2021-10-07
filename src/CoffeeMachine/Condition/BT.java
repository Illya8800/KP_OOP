package CoffeeMachine.Condition;

import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.ElementsCoffeeMachine.Shnek;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public abstract class BT implements ActionListener {
    protected CoffeeMachine cm = new CoffeeMachine();
    protected ArrayList<Shnek> shneks = cm.getShneks();

}
