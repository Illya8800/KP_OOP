package CoffeeMachine.Condition.MenuMachine;

import CoffeeMachine.ActionList.NextButtonAction1;
import CoffeeMachine.Condition.BT;
import CoffeeMachine.Drink.Beverage;
import CoffeeMachine.Drink.Decorator.Shnek;

import java.util.ArrayList;

import static CoffeeMachine.Drink.Beverage.receptures;
import static Form.MainForm.buttonListDrink;

public class Menu {

    public static final ArrayList<Object> menu = new ArrayList<>(4);

    private DataClass dataClass = new DataClass();

    private ArrayList<Shnek> shneks = dataClass.getShneks();

    public static NextButtonAction1 nextButtonAction1 = new NextButtonAction1();

    private void getMenu(){
        Beverage.loadRecepture();
        menu.add(receptures);
        menu.add(dataClass.getSerialNumber());//MainForm.text.setText(menu.get().toString());
        menu.add(dataClass.getPhoneNum());//MainForm.text.setText(menu.get().toString());
        menu.add(shneks);//Кол-во ингридиентов
    }


    public void menu(){
        getMenu();

        for (javax.swing.JButton jButton : buttonListDrink) {
            jButton.removeActionListener(BT.nullAction);
        }
        buttonListDrink.get(0).removeActionListener(nextButtonAction1);
        buttonListDrink.get(0).addActionListener(nextButtonAction1);
    }
}


