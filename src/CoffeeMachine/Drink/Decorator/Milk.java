package CoffeeMachine.Drink.Decorator;

public class Milk extends Shnek {

    public Milk(byte idShnek){
        if(idShnek > 0 && idShnek < 8){
            this.idShnek = idShnek;
        } else {
            System.err.println("Неверный номер шнека. Допустимыйе номера: [1;7]");
        }
    }

    @Override
    protected int coefficient() {
        return 45;
    }

    @Override
    protected int coefficient(boolean isLow) {
        return (int) (coefficient() * 2.1);
    }

    @Override
    protected int minCountIngridient() {
        return coefficient() * 8;
    }

 }
