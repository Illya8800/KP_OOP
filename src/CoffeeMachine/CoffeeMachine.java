package CoffeeMachine;

import CoffeeMachine.Drink.Drink;
import CoffeeMachine.ElementsCoffeeMachine.Shnek;

import java.util.ArrayList;

public class CoffeeMachine {
    private static final Shnek coffee = new Shnek((byte) 1);
    private static final Shnek sugar = new Shnek((byte) 2);
    private static final Shnek milk = new Shnek((byte) 3);
    private static final Shnek cream = new Shnek((byte) 4);
    private static final Shnek chocolate = new Shnek((byte) 5);


    ArrayList<Object> condition = new ArrayList<>();// Выставить объём
    ArrayList<Drink> drink = new ArrayList<>(7);

    public ArrayList<Shnek> getShneks (){
        ArrayList<Shnek> shneks = new ArrayList<>(5);
        shneks.add(coffee);
        shneks.add(sugar);
        shneks.add(milk);
        shneks.add(cream);
        shneks.add(chocolate);
        return shneks;
    }


    public void startCoffeMachine(){
        condition.add(drink);
    }

}
