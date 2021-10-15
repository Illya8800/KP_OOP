package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Doppio;

import java.awt.event.ActionEvent;

public class DoppioBT extends Doppio {
    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(2000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                shnekRotate(receptures.get(1));
            }
        }).start();
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\Doppio.png");

    }
}
