package CoffeeMachine.ElementsCoffeeMachine;

import CoffeeMachine.Interface.GetIngridient;

public class Shnek implements GetIngridient {

    private int countIngridient = 7000;
    private byte idShnek;

    public int getCountIngridient() {
        return countIngridient;
    }

    public Shnek(byte idShnek){
        if(idShnek > 0 && idShnek < 8){
            this.idShnek = idShnek;
        } else {
            System.err.println("Неверный номер шнека. Допустимыйе номера: [1;7]");
        }
    }

    @Override
    public void rotate (int workTime) {
        if(workTime > 0 && workTime < 5000 && countIngridient > 500){
            try {
                Thread.sleep(workTime);
                countIngridient -= (int)workTime / 100;
                System.out.println("На шнеке #" + idShnek + " сталось " + countIngridient + " грамм");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Неправильный рецепт на " + idShnek + " шнеке");
        }
    }
}