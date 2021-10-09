package CoffeeMachine.Drink;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Espresso extends Beverage implements ActionListener {
    @Override
    public void rotate(int workTime) {
        cooking();
        shneks.get(1).rotate(workTime);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        rotate(1000);
    }
}
