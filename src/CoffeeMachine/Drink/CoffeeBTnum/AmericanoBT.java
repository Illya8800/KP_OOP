package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Espresso;

import java.awt.event.ActionEvent;

public class AmericanoBT extends Espresso {
    @Override
    public void actionPerformed(ActionEvent e) {

        rotate(1000);//добавить кофе до 1750
        new Thread(new Runnable() {
            @Override
            public void run() {
                shnekRotate(receptures.get(2));
            }
        }).start();
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\Americano.png");
    }
}