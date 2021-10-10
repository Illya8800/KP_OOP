package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Doppio;

import java.awt.event.ActionEvent;

public class MacchiatoBT extends Doppio {
    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(2000);//добавить кофе до 2000 и молоко
        shnekRotate(receptures.get(6));
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\Macchiato.png");

    }
}
