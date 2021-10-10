package CoffeeMachine.Drink;

import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.Drink.Decorator.Shnek;
import CoffeeMachine.Interface.GetIngridient;
import Form.MainForm;

import java.util.ArrayList;

public abstract class Beverage implements GetIngridient {

    private CoffeeMachine cm = new CoffeeMachine();
    protected ArrayList<Shnek> shneks = cm.getShneks();

    protected int shnekRotate1;
    protected int shnekRotate2;
    protected int shnekRotate3;
    protected int shnekRotate4;
    protected int shnekRotate5;

    public void cooking(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                MainForm.setButtonEnabled(false);
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
                MainForm.setButtonEnabled(true);
            }
        }).start();
    }

    protected void setMainPNG(String path){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    MainForm.setMainIMG(path);
                    Thread.sleep(3500);
                    String defaultPath = "C:\\IntelIdeaProject\\KP_OOP\\IMG\\DefaultPNG.png";
                    MainForm.setMainIMG(defaultPath);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }).start();
    }

    protected void shnekRotate(int shnekRotate1, int shnekRotate2, int shnekRotate3, int shnekRotate4, int shnekRotate5){
        shneks.get(0).rotate(shnekRotate1);
        shneks.get(1).rotate(shnekRotate2);
        shneks.get(2).rotate(shnekRotate3);
        shneks.get(3).rotate(shnekRotate4);
        shneks.get(4).rotate(shnekRotate5);
    }

}
