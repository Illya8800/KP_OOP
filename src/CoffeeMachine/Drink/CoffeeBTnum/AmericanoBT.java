package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Espresso;

import java.awt.event.ActionEvent;

public class AmericanoBT extends Espresso {
    @Override
    public void actionPerformed(ActionEvent e) {

        rotate(1000);//добавить кофе до 1750
        shnekRotate(receptures.get(2));
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\Americano.png");
    }
}