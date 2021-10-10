package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Espresso;
import Form.MainForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmericanoBT extends Espresso implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        rotate(1000);//добавить кофе до 1750
        shnekRotate(shnekRotate1, shnekRotate2, shnekRotate3, shnekRotate4, shnekRotate5);
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\Americano.png");
    }
}