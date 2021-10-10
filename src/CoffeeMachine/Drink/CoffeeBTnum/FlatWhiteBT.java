package CoffeeMachine.Drink.CoffeeBTnum;

import CoffeeMachine.Drink.Doppio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlatWhiteBT extends Doppio implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(1000);//добавить кофе до 2000 и молоко
        shnekRotate(shnekRotate1,shnekRotate2,shnekRotate3,shnekRotate4,shnekRotate5);
        setMainPNG("C:\\IntelIdeaProject\\KP_OOP\\IMG\\FlatWhite.png");

    }
}
