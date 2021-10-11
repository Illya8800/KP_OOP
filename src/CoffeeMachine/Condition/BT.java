package CoffeeMachine.Condition;

import CoffeeMachine.ActionList.NullAction;
import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.Drink.Decorator.Shnek;
import Form.MainForm;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import static Form.MainForm.actionListDrink;
import static Form.MainForm.buttonListDrink;

public abstract class BT implements ActionListener {
    private final CoffeeMachine cm = new CoffeeMachine();
    protected ArrayList<Shnek> shneks = cm.getShneks();
    public static NullAction nullAction = new NullAction();


    protected void setDefaultAction(){
        buttonListDrink.get(0).addActionListener(MainForm.espressoBT);
        buttonListDrink.get(1).addActionListener(MainForm.doppioBT);
        buttonListDrink.get(2).addActionListener(MainForm.americanoBT);
        buttonListDrink.get(3).addActionListener(MainForm.flatWhiteBT);
        buttonListDrink.get(4).addActionListener(MainForm.cappucinoBT);
        buttonListDrink.get(5).addActionListener(MainForm.latteBT);
        buttonListDrink.get(6).addActionListener(MainForm.macchiatoBT);
    }
    protected void setNullAction() {

        for (int i = 0; i < buttonListDrink.size(); i++) {
            buttonListDrink.get(i).removeActionListener((ActionListener) actionListDrink.get(i));
            buttonListDrink.get(i).addActionListener(nullAction);
        }
    }
}
