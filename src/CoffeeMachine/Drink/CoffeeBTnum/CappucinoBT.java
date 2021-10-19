package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Espresso;

import java.awt.event.ActionEvent;

public class CappucinoBT extends Espresso {
    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(1000);//добавить кофе до 1500
        new Thread(new Runnable() {
            @Override
            public void run() {
                shnekRotate(receptures.get(4));
            }
        }).start();
        setMainPNG(path[4]);
    }
}
