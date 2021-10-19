package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Doppio;

import java.awt.event.ActionEvent;

public class FlatWhiteBT extends Doppio {
    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(2000);//добавить кофе до 2500 и молоко
        new Thread(new Runnable() {
            @Override
            public void run() {
                shnekRotate(receptures.get(3));
            }
        }).start();
        setMainPNG(path[3]);

    }
}
