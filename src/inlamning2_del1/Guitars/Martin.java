package inlamning2_del1.Guitars;

import inlamning2_del1.GuitarStore.Guitar;
import inlamning2_del1.ISolo;

public class Martin extends Guitar implements ISolo {
   
    private String color = "black";
    private String pickups = "piezo";
    private String pickguard = "n/a";
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
        System.out.println("A nice acoustic solo from this old Martin.");
    }
}
