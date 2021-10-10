package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Doppio;

import java.awt.event.ActionEvent;

public class FlatWhiteBT extends Doppio {
    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(1000);//добавить кофе до 2000 и молоко
        shnekRotate(receptures.get(3));
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\FlatWhite.png");

    }
}
