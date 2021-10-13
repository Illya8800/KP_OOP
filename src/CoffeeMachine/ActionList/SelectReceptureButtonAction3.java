package CoffeeMachine.ActionList;

import CoffeeMachine.Drink.Beverage;
import CoffeeMachine.Recepture.Recepture;
import Form.MainForm;

import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import static CoffeeMachine.ActionList.NextButtonAction1.selectReceptureButtonAction2;
import static CoffeeMachine.Drink.Beverage.receptures;
import static Form.MainForm.buttonListSugar;

public class SelectReceptureButtonAction3 extends Action{

    private static int idShnek = 0;
    private static int timeRotateShnek;

    public static PlusButtonAction plusButtonAction = new PlusButtonAction();
    public static MinusButtonAction minusButtonAction = new MinusButtonAction();

    static byte currentIdShnek;

    private static ArrayList<Recepture> localReceptures = receptures;

    private Recepture recepture;
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("SelectReceptureButtonAction3");

        MainForm.text.setText("Шнек " + currentIdShnek + " " + timeRotateShnek + " мс");

        //Beverage.loadRecepture(); //получаем все напитки


        buttonListSugar.get(0).removeActionListener(minusButtonAction);
        buttonListSugar.get(1).removeActionListener(plusButtonAction);
        buttonListSugar.get(0).addActionListener(minusButtonAction);
        buttonListSugar.get(1).addActionListener(plusButtonAction);




        /*switch (idShnek){
            case 0 -> {
                System.out.println("idShnek = " + idShnek);
                System.out.println("idRecepture = " + selectReceptureButtonAction2.getIdRecepture());
            }
            case 1 -> {
                System.out.println("idShnek = " + idShnek);
                System.out.println("idRecepture = " + selectReceptureButtonAction2.getIdRecepture());
            }

            case 2 -> {
                System.out.println("idShnek = " + idShnek);
                System.out.println("idRecepture = " + selectReceptureButtonAction2.getIdRecepture());
            }
            case 3 -> {
                System.out.println("idShnek = " + idShnek);
                System.out.println("idRecepture = " + selectReceptureButtonAction2.getIdRecepture());
            }
            case 4 -> {
                System.out.println("idShnek = " + idShnek);
                System.out.println("idRecepture = " + selectReceptureButtonAction2.getIdRecepture());
            }
        }
        */



        currentIdShnek = (byte) idShnek;

        timeRotateShnek = localReceptures.get(currentIdShnek).getShnekRotate(currentIdShnek);

        MainForm.text.setText("Шнек " + currentIdShnek + " " + localReceptures.get(currentIdShnek).getShnekRotate(currentIdShnek) + " мс");;
        if (idShnek == 4) {idShnek = 0;} else {idShnek++;}

        //recepture.setShnekRotate1(timeRotateShnek);//ГДЕ СОХРАНЯТЬ?

    }



    private static int plus() {
        if (timeRotateShnek < 5000){
            localReceptures.get(selectReceptureButtonAction2.getIdRecepture()).setShnekRotate(currentIdShnek, localReceptures.get(selectReceptureButtonAction2.getIdRecepture()).getShnekRotate(currentIdShnek) + 100);
            timeRotateShnek += 100;

        }
        return timeRotateShnek;
    }

    private static int minus() {
        if(timeRotateShnek > 0){
            localReceptures.get(selectReceptureButtonAction2.getIdRecepture()).setShnekRotate(currentIdShnek, localReceptures.get(selectReceptureButtonAction2.getIdRecepture()).getShnekRotate(currentIdShnek) - 100);
            timeRotateShnek -= 100;
        }
        return timeRotateShnek;
    }

    static class PlusButtonAction extends Action{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("PlusButtonAction");
            plus();
            saveFile();
            MainForm.text.setText("Шнек " + currentIdShnek + " " + localReceptures.get(currentIdShnek).getShnekRotate(currentIdShnek) + " мс");
        }
    }

    static class MinusButtonAction extends Action{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("MinusButtonAction");
            minus();
            saveFile();
            MainForm.text.setText("Шнек " + currentIdShnek + " " + localReceptures.get(currentIdShnek).getShnekRotate(currentIdShnek) + " мс");
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

}