package CoffeeMachine.Condition;

import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.ElementsCoffeeMachine.Shnek;

import java.util.ArrayList;

public abstract class BT {
    public CoffeeMachine cm = new CoffeeMachine();
    public ArrayList<Shnek> shneks = cm.getShneks();

}
