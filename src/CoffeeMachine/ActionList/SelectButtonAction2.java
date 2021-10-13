package CoffeeMachine.ActionList;

import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.Drink.Decorator.Shnek;
import Form.MainForm;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class SelectButtonAction2 extends Action{

    private CoffeeMachine cm = new CoffeeMachine();
    private ArrayList<Shnek> shneks = cm.getShneks();
    private int shnekNumber = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("SelectButtonAction2");
        MainForm.text.setText("На шнеке #"+ shnekNumber + " " + shneks.get(shnekNumber).getCountIngridient() + " грамм");
        shnekNumber++;
        if (shnekNumber == 5) shnekNumber = 0;
    }

    public int getShnekNumber() {
        return shnekNumber;
    }
}
