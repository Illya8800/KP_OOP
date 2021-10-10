package CoffeeMachine.Condition;

import CoffeeMachine.ActionList.NullAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Form.MainForm.actionListDrink;
import static Form.MainForm.buttonListDrink;

public class BT2 extends BT implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < buttonListDrink.size(); i++) {
            buttonListDrink.get(i).removeActionListener((ActionListener) actionListDrink.get(i));
            buttonListDrink.get(i).addActionListener(new NullAction());
        }
    }


}
