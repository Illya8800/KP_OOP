package CoffeeMachine.Drink;

import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.Drink.Decorator.Shnek;
import CoffeeMachine.Interface.GetIngridient;
import CoffeeMachine.Recepture.Recepture;
import Form.MainForm;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public abstract class Beverage implements GetIngridient {

    private CoffeeMachine cm = new CoffeeMachine();
    protected ArrayList<Shnek> shneks = cm.getShneks();

    public static ArrayList<Recepture> receptures = new ArrayList<>(7);

    public static void loadRecepture(){
        try {
            FileInputStream fileStream = new FileInputStream("receptures.ser");
            ObjectInputStream oi = new ObjectInputStream(fileStream);


            receptures.clear();

            for (int i = 0; i < 7; i++) {
                Recepture recept = (Recepture) oi.readObject();
                receptures.add(recept);

                System.out.println("Шнек 0 = " + receptures.get(i).getShnekRotate1());
                System.out.println("Шнек 1 = " + receptures.get(i).getShnekRotate2());
                System.out.println("Шнек 2 = " + receptures.get(i).getShnekRotate3());
                System.out.println("Шнек 3 = " + receptures.get(i).getShnekRotate4());
                System.out.println("Шнек 4 = " + receptures.get(i).getShnekRotate5());
                System.out.println("=====================================");

            }

            oi.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



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

    protected void shnekRotate(Recepture recepture){
        shneks.get(0).rotate(recepture.getShnekRotate1());
        shneks.get(1).rotate(recepture.getShnekRotate2());
        shneks.get(2).rotate(recepture.getShnekRotate3());
        shneks.get(3).rotate(recepture.getShnekRotate4());
        shneks.get(4).rotate(recepture.getShnekRotate5());
    }

}
