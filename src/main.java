import CoffeeMachine.Drink.Beverage;
import CoffeeMachine.Recepture.Recepture;
import Form.MainForm;

import java.io.*;
import java.util.ArrayList;

import static CoffeeMachine.Drink.Beverage.receptures;

public class main {
    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        mainForm.createFrom();
        Beverage.loadRecepture();
        //readRecepture();
        //newfile();
    }

    public static void newfile(){
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("receptures.ser", false);
            ObjectOutput ou = new ObjectOutputStream(fo);

            ArrayList<Recepture> receptures = new ArrayList<>(7);
            Recepture temp = new Recepture();

            temp.setShnekRotate1(0);
            temp.setShnekRotate2(0);
            temp.setShnekRotate3(0);
            temp.setShnekRotate4(0);
            temp.setShnekRotate5(0);


            receptures.add(temp);//Espresso
            receptures.add(temp);//Doppio
            ou.writeObject(temp);//Espresso
            ou.writeObject(temp);//Doppio


            temp.setShnekRotate1(750);
            temp.setShnekRotate2(0);
            temp.setShnekRotate3(0);
            temp.setShnekRotate4(0);
            temp.setShnekRotate5(0);
            receptures.add(temp);//Doppio
            ou.writeObject(temp);//Espresso




            ou.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void readRecepture(){
        try {
            FileInputStream fileStream = new FileInputStream("receptures.ser");
            ObjectInputStream oi = new ObjectInputStream(fileStream);
            for (int i = 0; i < 7; i++) {
                Recepture recept = (Recepture) oi.readObject();
                receptures.add(recept);
                System.out.println("Шнек 0 = " + receptures.get(i).getShnekRotate1());
                System.out.println("Шнек 1 = " + receptures.get(i).getShnekRotate2());
                System.out.println("Шнек 2 = " + receptures.get(i).getShnekRotate3());
                System.out.println("Шнек 3 = " + receptures.get(i).getShnekRotate4());
                System.out.println("Шнек 4 = " + receptures.get(i).getShnekRotate5());
            }

            oi.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

