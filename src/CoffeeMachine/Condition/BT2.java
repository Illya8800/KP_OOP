package CoffeeMachine.Condition;

import CoffeeMachine.Condition.MenuMachine.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BT2 extends BT implements ActionListener {
    Menu menu = new Menu();
    @Override
    public void actionPerformed(ActionEvent e) {
        setNullAction();
        menu.menu();
    }

    public void setCurrentAction(){

    }
}
