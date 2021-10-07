package CoffeeMachine.Condition;

import CoffeeMachine.ElementsCoffeeMachine.Shnek;
import CoffeeMachine.Interface.GetIngridient;
import Form.MainForm;

import java.awt.event.ActionEvent;

public class BT1 extends BT implements GetIngridient {

    @Override
    public void rotate(int workTime) {
        for (Shnek temp: shneks) {
            temp.rotate(workTime);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        MainForm.text.setText("Промывка...");
        new Thread(new Runnable() {
            @Override
            public void run() {
                rotate(500);
                MainForm.text.setText("Приятного аппетита");
            }
        }).start();
    }




}