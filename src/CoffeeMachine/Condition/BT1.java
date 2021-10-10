package CoffeeMachine.Condition;

import CoffeeMachine.Drink.Decorator.Shnek;
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
        new Thread(new Runnable() {
            @Override
            public void run() {
                MainForm.setButtonEnabled(false);
                for (int i = 0; i < 3; i++) {
                    try {
                        MainForm.text.setText("Промывка");
                        Thread.sleep(500);
                        MainForm.text.setText("Промывка.");
                        Thread.sleep(500);
                        MainForm.text.setText("Промывка..");
                        Thread.sleep(500);
                        MainForm.text.setText("Промывка...");
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    finally {
                        MainForm.text.setText("Приятного аппетита");
                    }
                }
            MainForm.setButtonEnabled(true);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                rotate(500);

            }
        }).start();
    }




}