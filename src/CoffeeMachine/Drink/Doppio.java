package CoffeeMachine.Drink;

import java.awt.event.ActionListener;

public abstract class Doppio extends Beverage implements ActionListener {
    @Override
    public void rotate(int workTime) {
        cooking();
        shneks.get(0).rotate(2000);
    }


}
