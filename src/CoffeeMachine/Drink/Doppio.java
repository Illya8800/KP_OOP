package CoffeeMachine.Drink;


public class Doppio extends Beverage {
    @Override
    public void rotate(int workTime) {
        cooking();
        shneks.get(0).rotate(2000);
    }
}
