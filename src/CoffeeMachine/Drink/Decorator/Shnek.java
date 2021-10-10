package CoffeeMachine.Drink.Decorator;

import CoffeeMachine.Drink.Beverage;

public abstract class Shnek extends Beverage {

    private int countIngridient = 7000;
    protected byte idShnek;

    public int getCountIngridient() {
        return countIngridient;
    }

    protected abstract int coefficient();
    protected abstract int minCountIngridient();

    @Override
    public void rotate (int workTime) {
        if(workTime > -1 && workTime < 5000 && countIngridient > minCountIngridient()){
            try {
                Thread.sleep(workTime);
                countIngridient -= (int)workTime / coefficient();
                System.out.println("На шнеке #" + idShnek + " сталось " + countIngridient + " грамм");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Неправильный рецепт на " + idShnek + " шнеке");
        }
    }
}