package CoffeeMachine.Drink.Decorator;

public class Coffee extends Shnek{

    public Coffee(byte idShnek){
        if(idShnek > 0 && idShnek < 8){
            this.idShnek = idShnek;
        } else {
            System.err.println("Неверный номер шнека. Допустимыйе номера: [1;7]");
        }
    }

    @Override
    protected int coefficient() {
        return 100;
    }

    @Override
    protected int minCountIngridient() {
        return coefficient() * 10;
    }

}
