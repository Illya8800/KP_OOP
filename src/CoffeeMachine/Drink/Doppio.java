package CoffeeMachine.Drink;

public class Doppio extends Beverage {
    @Override
    public void rotate(int workTime) {

        shneks.get(1).rotate(2000);
    }
}
