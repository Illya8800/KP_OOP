package CoffeeMachine;

import CoffeeMachine.Drink.Decorator.*;

import java.util.ArrayList;

public class CoffeeMachine {

    private static final Shnek coffee = new Coffee((byte) 1);
    private static final Shnek sugar = new Sugar((byte) 2);
    private static final Shnek milk = new Milk((byte) 3);
    private static final Shnek cream = new Cream((byte) 4);
    private static final Shnek chocolate = new Chocolate((byte) 5);

    public ArrayList<Shnek> getShneks (){
        ArrayList<Shnek> shneks = new ArrayList<>(5);
        shneks.add(coffee);
        shneks.add(sugar);
        shneks.add(milk);
        shneks.add(cream);
        shneks.add(chocolate);
        return shneks;
    }


}
