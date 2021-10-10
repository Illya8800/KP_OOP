package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Doppio;

import java.awt.event.ActionEvent;

public class DoppioBT extends Doppio {
    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(2000);
        shnekRotate(receptures.get(1));
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\Doppio.png");

    }
}
