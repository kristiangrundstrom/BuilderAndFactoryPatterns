package inlamning2_del1.Guitars;

import inlamning2_del1.GuitarStore.Guitar;
import inlamning2_del1.ISolo;

public class Washburn extends Guitar implements ISolo {
    
    private String color = "blue";
    private String pickups = "humbuckers";
    private String pickguard = "tortoise";
    private int amountOfStrings = 6;

    @Override
    public String getPickguard() {
        return pickguard;
    }

    @Override
    public String getPickups() {
        return pickups;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getAmountOfStrings() {
        return amountOfStrings;
    }
    
    @Override
    public void playSolo() {
        System.out.println("New Washburn can also play a solo!");
    }
    
}
