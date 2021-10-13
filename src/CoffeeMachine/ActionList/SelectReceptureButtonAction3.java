package CoffeeMachine.ActionList;

import CoffeeMachine.Recepture.Recepture;

import Form.MainForm;

import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;

import static CoffeeMachine.ActionList.NextButtonAction1.selectReceptureButtonAction2;
import static Form.MainForm.buttonListSugar;

public class SelectReceptureButtonAction3 extends Action{

    private static int idShnek = 0;
    private static int timeRotateShnek;

    public static PlusButtonAction plusButtonAction = new PlusButtonAction();
    public static MinusButtonAction minusButtonAction = new MinusButtonAction();

    static byte currentIdShnek;

    private static ArrayList<Recepture> localReceptures = new ArrayList<>(7);

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("SelectReceptureButtonAction3");
        loadRecepture();

        buttonListSugar.get(0).removeActionListener(minusButtonAction);
        buttonListSugar.get(1).removeActionListener(plusButtonAction);
        buttonListSugar.get(0).addActionListener(minusButtonAction);
        buttonListSugar.get(1).addActionListener(plusButtonAction);

        currentIdShnek = (byte) idShnek;

        timeRotateShnek = localReceptures.get(selectReceptureButtonAction2.getIdRecepture()).getShnekRotate(currentIdShnek);

        MainForm.text.setText("Шнек " + currentIdShnek + " " + localReceptures.get(selectReceptureButtonAction2.getIdRecepture()).getShnekRotate(currentIdShnek) + " мс");

        if (idShnek == 4) {idShnek = 0;} else {idShnek++;}

        //recepture.setShnekRotate1(timeRotateShnek);//ГДЕ СОХРАНЯТЬ?
    }

    private static void plus() {
        if (timeRotateShnek < 5000){
            timeRotateShnek += 100;
            localReceptures.get(selectReceptureButtonAction2.getIdRecepture()).setShnekRotate(currentIdShnek, timeRotateShnek);
        }
    }

    private static void minus() {
        if(timeRotateShnek > 0){
            timeRotateShnek -= 100;
            localReceptures.get(selectReceptureButtonAction2.getIdRecepture()).setShnekRotate(currentIdShnek, timeRotateShnek);
        }
    }

    static class PlusButtonAction extends Action{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("PlusButtonAction");
            plus();
            saveFile();
            MainForm.text.setText("Шнек " + currentIdShnek + " " + localReceptures.get(selectReceptureButtonAction2.getIdRecepture()).getShnekRotate(currentIdShnek) + " мс");
        }
    }

    static class MinusButtonAction extends Action{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("MinusButtonAction");
            minus();
            saveFile();
            MainForm.text.setText("Шнек " + currentIdShnek + " " + localReceptures.get(selectReceptureButtonAction2.getIdRecepture()).getShnekRotate(currentIdShnek) + " мс");
        }
    }



    public static void saveFile(){
        try {
            FileOutputStream fo = new FileOutputStream("receptures.ser", false);
            ObjectOutputStream ou = new ObjectOutputStream(fo);

            System.out.println("receptures.size()" + localReceptures.size());

            for (Recepture recept: localReceptures) {

                ou.writeObject(recept);

            }
            ou.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    public void loadRecepture(){
        try {
            FileInputStream fileStream = new FileInputStream("receptures.ser");
            ObjectInputStream oi = new ObjectInputStream(fileStream);


            localReceptures.clear();

            for (int i = 0; i < 7; i++) {
                Recepture recept = (Recepture) oi.readObject();
                localReceptures.add(recept);

                System.out.println("Шнек 0 = " + localReceptures.get(i).getShnekRotate1());
                System.out.println("Шнек 1 = " + localReceptures.get(i).getShnekRotate2());
                System.out.println("Шнек 2 = " + localReceptures.get(i).getShnekRotate3());
                System.out.println("Шнек 3 = " + localReceptures.get(i).getShnekRotate4());
                System.out.println("Шнек 4 = " + localReceptures.get(i).getShnekRotate5());
                System.out.println("=====================================");

            }

            oi.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}