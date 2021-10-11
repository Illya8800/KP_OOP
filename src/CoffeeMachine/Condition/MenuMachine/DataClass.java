package CoffeeMachine.Condition.MenuMachine;

import CoffeeMachine.CoffeeMachine;
import CoffeeMachine.Drink.Decorator.Shnek;

import java.util.ArrayList;

public class DataClass {
    private String serialNumber = "SerialNum: fnwbjhwiklkjh";
    private String phoneNum = "Впрсы по сотрудн: 0953675158";

    private CoffeeMachine cm = new CoffeeMachine();
    private ArrayList<Shnek> shneks = cm.getShneks();

    public ArrayList<Shnek> getShneks() {
        return shneks;
    }

    public String getSerialNumber() {
        System.out.println("SerialNumber");
        return serialNumber;
    }

    public String getPhoneNum() {
        System.out.println("PhoneNum");
        return phoneNum;
    }


}
