package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Espresso;

import java.awt.event.ActionEvent;

public class EspressoBT extends Espresso {

    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(1000);
        shnekRotate(receptures.get(0));
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\Espresso.png");
    }
}
