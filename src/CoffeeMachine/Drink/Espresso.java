package CoffeeMachine.Drink;


public class Espresso extends Beverage {
    @Override
    public void rotate(int workTime) {
        cooking();
        shneks.get(0).rotate(1000);
    }


}
