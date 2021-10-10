package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Doppio;
import Form.MainForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoppioBT extends Doppio implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(2000);
        shnekRotate(shnekRotate1,shnekRotate2,shnekRotate3,shnekRotate4,shnekRotate5);
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\Doppio.png");

    }
}
