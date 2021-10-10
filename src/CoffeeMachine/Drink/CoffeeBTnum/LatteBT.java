package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Espresso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LatteBT extends Espresso implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(1000);//добавить кофе до
        shnekRotate(shnekRotate1,shnekRotate2,shnekRotate3,shnekRotate4,shnekRotate5);
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\Latte.png");

    }
}
