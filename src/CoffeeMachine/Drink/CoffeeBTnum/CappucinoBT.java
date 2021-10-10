package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Espresso;

import java.awt.event.ActionEvent;

public class CappucinoBT extends Espresso {
    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(1000);//добавить кофе до 1500
        shnekRotate(receptures.get(4));
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\Cappuccino.png");
    }
}
