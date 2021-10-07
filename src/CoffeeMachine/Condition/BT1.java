package CoffeeMachine.Condition;

import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.ElementsCoffeeMachine.Shnek;
import CoffeeMachine.Interface.GetIngridient;
import Form.MainForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BT1 extends BT implements GetIngridient, ActionListener {

    @Override
    public void rotate(int workTime) {
        for (Shnek temp: shneks) {
            temp.rotate(workTime);
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            MainForm.text.setText("Промывака машины?");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        rotate(500);
        MainForm.text.setText("Приятного аппетита???");
    }
}