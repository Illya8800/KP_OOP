package CoffeeMachine.Condition;

import CoffeeMachine.Condition.MenuMachine.Menu;
import Form.MainForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static CoffeeMachine.ActionList.NextButtonAction1.selectButtonAction2;
import static CoffeeMachine.ActionList.NextButtonAction1.selectReceptureButtonAction2;
import static CoffeeMachine.ActionList.SelectReceptureButtonAction2.selectReceptureButtonAction3;
import static CoffeeMachine.ActionList.SelectReceptureButtonAction3.minusButtonAction;
import static CoffeeMachine.ActionList.SelectReceptureButtonAction3.plusButtonAction;
import static CoffeeMachine.Condition.MenuMachine.Menu.nextButtonAction1;
import static Form.MainForm.buttonListDrink;
import static Form.MainForm.buttonListSugar;

public class BT2 extends BT {
    Menu menu = new Menu();
    @Override
    public void actionPerformed(ActionEvent e) {
        MainForm.text.setText("Режим программирования");
        dropCurrentAction();
        setNullAction();
        menu.menu();
    }

    public void dropCurrentAction(){
        for (javax.swing.JButton jButton : buttonListDrink) {
            jButton.removeActionListener(BT.nullAction);
        }

        buttonListDrink.get(0).removeActionListener(nextButtonAction1);
        buttonListDrink.get(1).removeActionListener(selectButtonAction2);
        buttonListDrink.get(1).removeActionListener(selectReceptureButtonAction2);
        buttonListDrink.get(2).removeActionListener(selectReceptureButtonAction3);

        buttonListSugar.get(0).removeActionListener(minusButtonAction);
        buttonListSugar.get(1).removeActionListener(plusButtonAction);

    }
}
