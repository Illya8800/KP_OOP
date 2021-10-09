package CoffeeMachine.Drink;

import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.Drink.Decorator.Shnek;
import CoffeeMachine.Interface.GetIngridient;
import Form.MainForm;

import java.util.ArrayList;

public abstract class Beverage implements GetIngridient {

    private CoffeeMachine cm = new CoffeeMachine();
    protected ArrayList<Shnek> shneks = cm.getShneks();


    public void cooking(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    try {
                        MainForm.text.setText("Готовится кофе");
                        Thread.sleep(500);
                        MainForm.text.setText("Готовится кофе.");
                        Thread.sleep(500);
                        MainForm.text.setText("Готовится кофе..");
                        Thread.sleep(500);
                        MainForm.text.setText("Готовится кофе...");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        MainForm.text.setText("Приятного аппетита");
                    }

                }
            }
        }).start();

    }


}
