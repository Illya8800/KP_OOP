package CoffeeMachine.ActionList;

import Form.MainForm;

import java.awt.event.ActionEvent;

import static CoffeeMachine.ActionList.SelectReceptureButtonAction3.minusButtonAction;
import static CoffeeMachine.ActionList.SelectReceptureButtonAction3.plusButtonAction;
import static Form.MainForm.buttonListSugar;

public class SelectReceptureButtonAction2 extends Action{

    private byte idRecepture;

    public byte getIdRecepture() {
        return idRecepture;
    }

    public static SelectReceptureButtonAction3 selectReceptureButtonAction3 = new SelectReceptureButtonAction3();

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("SelectReceptureButtonAction2");
        MainForm.text.setText("Напиток под номером #" + String.valueOf(idRecepture));
        if (idRecepture == 6){
            idRecepture = 0;
        } else {
            idRecepture++;
        }
        MainForm.buttonListDrink.get(2).removeActionListener(selectReceptureButtonAction3);
        MainForm.buttonListDrink.get(2).addActionListener(selectReceptureButtonAction3);

        buttonListSugar.get(0).removeActionListener(minusButtonAction);
        buttonListSugar.get(1).removeActionListener(plusButtonAction);


    }


}