package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Espresso;

import java.awt.event.ActionEvent;

public class LatteBT extends Espresso {
    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(1000);//добавить кофе до
        shnekRotate(receptures.get(5));
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\Latte.png");

    }
}
