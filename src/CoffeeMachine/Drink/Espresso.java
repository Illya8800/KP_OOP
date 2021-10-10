package CoffeeMachine.Drink;


import java.awt.event.ActionListener;

public abstract class Espresso extends Beverage implements ActionListener {
    @Override
    public void rotate(int workTime) {
        cooking();
        shneks.get(0).rotate(1000);
    }


}
