package CoffeeMachine.Condition;

import Form.MainForm;

import java.awt.event.ActionEvent;

import static CoffeeMachine.ActionList.NextButtonAction1.selectButtonAction2;
import static CoffeeMachine.Condition.MenuMachine.Menu.nextButtonAction1;
import static Form.MainForm.buttonListDrink;

public class BT3 extends BT{
    @Override
    public void actionPerformed(ActionEvent e) {

        for (javax.swing.JButton jButton : buttonListDrink) {
            jButton.removeActionListener(BT.nullAction);
        }



        buttonListDrink.get(0).removeActionListener(nextButtonAction1);
        buttonListDrink.get(1).removeActionListener(selectButtonAction2);
        setDefaultAction();
        MainForm.text.setText("Приятного аппетита");
    }


}
