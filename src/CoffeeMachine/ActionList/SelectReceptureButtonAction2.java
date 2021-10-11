package CoffeeMachine.ActionList;

import Form.MainForm;

import java.awt.event.ActionEvent;

public class SelectReceptureButtonAction2 extends Action{

    private byte idRecepture;

    public byte getIdRecepture() {
        return idRecepture;
    }

    public static SelectReceptureButtonAction3 selectReceptureButtonAction3 = new SelectReceptureButtonAction3();

    @Override
    public void actionPerformed(ActionEvent e) {

        MainForm.text.setText("Напиток под номером #" + String.valueOf(idRecepture));
        if (idRecepture == 7)
            idRecepture = 0;
        idRecepture++;

        MainForm.buttonListDrink.get(2).addActionListener(selectReceptureButtonAction3);

    }


}


/*
        switch (idRecepture){
            case 0 -> {
                recepture = Beverage.receptures.get(0);
                recepture.setShnekRotate1(59);
            }
        }
*/