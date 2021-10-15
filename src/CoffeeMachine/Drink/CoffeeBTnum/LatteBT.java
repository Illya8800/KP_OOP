package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Espresso;

import java.awt.event.ActionEvent;

public class LatteBT extends Espresso {
    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(1000);//добавить кофе до
        new Thread(new Runnable() {
            @Override
            public void run() {
                shnekRotate(receptures.get(5));
            }
        }).start();
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\Latte.png");

    }
}
