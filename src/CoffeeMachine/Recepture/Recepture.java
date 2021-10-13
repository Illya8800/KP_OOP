package CoffeeMachine.Recepture;

import java.io.Serializable;
import java.util.ArrayList;

public class Recepture implements Serializable {

    private int shnekRotate1;
    private int shnekRotate2;
    private int shnekRotate3;
    private int shnekRotate4;
    private int shnekRotate5;

    public int getShnekRotate(byte num) {
        switch (num){
            case 0 ->{
                return shnekRotate1;
            }
            case 1 ->{
                return shnekRotate2;
            }
            case 2 ->{
                return shnekRotate3;
            }
            case 3 ->{
                return shnekRotate4;
            }
            case 4 ->{
                return shnekRotate5;
            }
        }
        return -1;
    }


    public void setShnekRotate(byte num, int shnekRotate) {
        switch (num){
            case 0 ->{
                this.shnekRotate1 = shnekRotate;
            }
            case 1 ->{
                this.shnekRotate2 = shnekRotate;
            }
            case 2 ->{
                this.shnekRotate3 = shnekRotate;
            }
            case 3 ->{
                this.shnekRotate4 = shnekRotate;
            }
            case 4 ->{
                this.shnekRotate5 = shnekRotate;
            }
        }
    }

    public int getShnekRotate1() {
        return shnekRotate1;
    }

    public int getShnekRotate2() {
        return shnekRotate2;
    }

    public int getShnekRotate3() {
        return shnekRotate3;
    }

    public int getShnekRotate4() {
        return shnekRotate4;
    }

    public int getShnekRotate5() {
        return shnekRotate5;
    }

    public void setShnekRotate1(int shnekRotate1) {
        this.shnekRotate1 = shnekRotate1;
    }

    public void setShnekRotate2(int shnekRotate2) {
        this.shnekRotate2 = shnekRotate2;
    }

    public void setShnekRotate3(int shnekRotate3) {
        this.shnekRotate3 = shnekRotate3;
    }

    public void setShnekRotate4(int shnekRotate4) {
        this.shnekRotate4 = shnekRotate4;
    }

    public void setShnekRotate5(int shnekRotate5) {
        this.shnekRotate5 = shnekRotate5;
    }
}
