package CoffeeMachine.Condition;

import Form.MainForm;

import java.awt.event.ActionEvent;

import static CoffeeMachine.ActionList.NextButtonAction1.selectButtonAction2;
import static CoffeeMachine.ActionList.NextButtonAction1.selectReceptureButtonAction2;
import static CoffeeMachine.ActionList.SelectReceptureButtonAction2.selectReceptureButtonAction3;
import static CoffeeMachine.ActionList.SelectReceptureButtonAction3.minusButtonAction;
import static CoffeeMachine.ActionList.SelectReceptureButtonAction3.plusButtonAction;
import static CoffeeMachine.Condition.MenuMachine.Menu.nextButtonAction1;
import static Form.MainForm.buttonListDrink;
import static Form.MainForm.buttonListSugar;

public class BT3 extends BT{
    @Override
    public void actionPerformed(ActionEvent e) {

        for (javax.swing.JButton jButton : buttonListDrink) {
            jButton.removeActionListener(BT.nullAction);
        }

        buttonListDrink.get(0).removeActionListener(nextButtonAction1);
        buttonListDrink.get(1).removeActionListener(selectButtonAction2);
        buttonListDrink.get(1).removeActionListener(selectReceptureButtonAction2);
        buttonListDrink.get(2).removeActionListener(selectReceptureButtonAction3);

        buttonListSugar.get(0).removeActionListener(minusButtonAction);
        buttonListSugar.get(1).removeActionListener(plusButtonAction);
        setDefaultAction();
        MainForm.text.setText("Приятного аппетита");
    }


}
