package CoffeeMachine.ActionList;

import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.Condition.MenuMachine.Menu;
import CoffeeMachine.Drink.Decorator.Shnek;
import Form.MainForm;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import static CoffeeMachine.ActionList.SelectReceptureButtonAction2.selectReceptureButtonAction3;
import static CoffeeMachine.ActionList.SelectReceptureButtonAction3.minusButtonAction;
import static CoffeeMachine.ActionList.SelectReceptureButtonAction3.plusButtonAction;
import static Form.MainForm.buttonListDrink;
import static Form.MainForm.buttonListSugar;

public class NextButtonAction1 extends Action{

    private int numMenu;

    public static SelectButtonAction2 selectButtonAction2 = new SelectButtonAction2();
    public static SelectReceptureButtonAction2 selectReceptureButtonAction2 = new SelectReceptureButtonAction2();

    private CoffeeMachine cm = new CoffeeMachine();
    private ArrayList<Shnek> shneks = cm.getShneks();

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("NextButtonAction1");
        Menu.menu.get(numMenu);


        switch (numMenu) {
            case 0 -> {
                MainForm.text.setText("Рецепты напитков");
                
                buttonListDrink.get(1).addActionListener(selectReceptureButtonAction2);
                
                int shnekId = selectReceptureButtonAction2.getIdRecepture();
                
                if (shneks.get(shnekId).getIdShnek() == 5){
                    buttonListDrink.get(1).removeActionListener(selectReceptureButtonAction2);
                    shnekId = 0;
                } else {
                    shnekId++;
                }
                buttonListDrink.get(1).removeActionListener(selectButtonAction2);
            }
            case 1 -> {
                MainForm.text.setText(Menu.menu.get(1).toString());

                buttonListSugar.get(0).removeActionListener(minusButtonAction);
                buttonListSugar.get(1).removeActionListener(plusButtonAction);

                buttonListDrink.get(2).removeActionListener(selectReceptureButtonAction3);

                buttonListDrink.get(1).removeActionListener(selectReceptureButtonAction2);
                buttonListDrink.get(1).removeActionListener(selectReceptureButtonAction3);
            }
            case 2 -> {
                MainForm.text.setText(Menu.menu.get(2).toString());
            }
            case 3 -> {
                MainForm.text.setText("Количество ингридиентов");
                buttonListDrink.get(1).addActionListener(selectButtonAction2);
                if (selectButtonAction2.getShnekNumber() == 5)
                    buttonListDrink.get(1).removeActionListener(selectButtonAction2);
            }
        }

        numMenu++;
        if (numMenu == 4) numMenu = 0;

    }
}
