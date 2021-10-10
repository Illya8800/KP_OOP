package CoffeeMachine.Condition;

import CoffeeMachine.ActionList.NullAction;
import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.Drink.CoffeeBTnum.*;
import CoffeeMachine.Drink.Decorator.Shnek;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import static Form.MainForm.actionListDrink;
import static Form.MainForm.buttonListDrink;

public abstract class BT implements ActionListener {
    private CoffeeMachine cm = new CoffeeMachine();
    protected ArrayList<Shnek> shneks = cm.getShneks();

    protected void setDefaultAction(){
        buttonListDrink.get(0).addActionListener(new EspressoBT());
        buttonListDrink.get(1).addActionListener(new DoppioBT());
        buttonListDrink.get(2).addActionListener(new AmericanoBT());
        buttonListDrink.get(3).addActionListener(new FlatWhiteBT());
        buttonListDrink.get(4).addActionListener(new CappucinoBT());
        buttonListDrink.get(5).addActionListener(new LatteBT());
        buttonListDrink.get(6).addActionListener(new MacchiatoBT());
    }
    protected void setNullAction() {
        for (int i = 0; i < buttonListDrink.size(); i++) {
            buttonListDrink.get(i).removeActionListener((ActionListener) actionListDrink.get(i));
            buttonListDrink.get(i).addActionListener(new NullAction());
        }
    }
}
