package CoffeeMachine.ActionList;

import CoffeeMachine.Drink.Beverage;
import CoffeeMachine.Recepture.Recepture;
import Form.MainForm;

import java.awt.event.ActionEvent;

import static CoffeeMachine.ActionList.NextButtonAction1.selectReceptureButtonAction2;
import static CoffeeMachine.Drink.Beverage.receptures;

public class SelectReceptureButtonAction3 extends Action{

    Recepture recepture;



    @Override
    public void actionPerformed(ActionEvent e) {
        Beverage.loadRecepture(); //получаем все напитки

        System.out.println("SelectReceptureButtonAction3");
        MainForm.text.setText("В рецепте напитка #" + String.valueOf(selectReceptureButtonAction2.getIdRecepture() - 1));

        //Можем просмотреть кол-во ингридиента на конкретном шнеке
        int timeRotateShnek1 = receptures.get(selectReceptureButtonAction2.getIdRecepture() - 1).getShnekRotate1();
        int timeRotateShnek2 = receptures.get(selectReceptureButtonAction2.getIdRecepture() - 1).getShnekRotate2();
        int timeRotateShnek3 = receptures.get(selectReceptureButtonAction2.getIdRecepture() - 1).getShnekRotate3();
        int timeRotateShnek4 = receptures.get(selectReceptureButtonAction2.getIdRecepture() - 1).getShnekRotate4();
        int timeRotateShnek5 = receptures.get(selectReceptureButtonAction2.getIdRecepture() - 1).getShnekRotate5();




        recepture = receptures.get(selectReceptureButtonAction2.getIdRecepture() - 1);

        recepture.setShnekRotate1(timeRotateShnek1);
        recepture.setShnekRotate2(timeRotateShnek2);
        recepture.setShnekRotate3(timeRotateShnek3);
        recepture.setShnekRotate4(timeRotateShnek4);
        recepture.setShnekRotate5(timeRotateShnek5);



    }


}
