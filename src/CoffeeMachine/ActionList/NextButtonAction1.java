package CoffeeMachine.ActionList;

import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.Condition.MenuMachine.Menu;
import CoffeeMachine.Drink.Decorator.Shnek;
import Form.MainForm;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import static Form.MainForm.buttonListDrink;

public class NextButtonAction1 extends Action{

    private int numMenu;

    public static SelectButtonAction2 selectButtonAction2 = new SelectButtonAction2();

    private CoffeeMachine cm = new CoffeeMachine();
    private ArrayList<Shnek> shneks = cm.getShneks();

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("NextButtonAction1");
        Menu.menu.get(numMenu);


        switch (numMenu){
            case 0 : {
                MainForm.text.setText("Рецепты напитков");
                buttonListDrink.get(1).removeActionListener(selectButtonAction2);
                break;
            }
            case 1 : {
                MainForm.text.setText(Menu.menu.get(1).toString());
                buttonListDrink.get(1).removeActionListener(selectButtonAction2);
                break;
            }
            case 2 : {
                MainForm.text.setText(Menu.menu.get(2).toString());
                buttonListDrink.get(1).removeActionListener(selectButtonAction2);
                break;
            }
            case 3 : {
                MainForm.text.setText("Количество ингридиентов");
                buttonListDrink.get(1).addActionListener(selectButtonAction2);
                if (selectButtonAction2.getShnekNumber() == 5) buttonListDrink.get(1).removeActionListener(selectButtonAction2);
                break;
            }
        }

        numMenu++;
        if (numMenu == 4) numMenu = 0;

    }
}
