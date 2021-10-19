package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Espresso;

import java.awt.event.ActionEvent;

public class EspressoBT extends Espresso {

    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                shnekRotate(receptures.get(0));
            }
        }).start();
        setMainPNG(path[0]);
    }
}
