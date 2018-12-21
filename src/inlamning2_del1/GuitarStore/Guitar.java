package inlamning2_del1.GuitarStore;

import inlamning2_del1.ISolo;

public class Guitar implements ISolo {
    
    private String color;
    private int amountOfStrings;
    private String pickguard;
    private String pickups;
       
    public String getColor() {
        return color;
    }

    public int getAmountOfStrings() {
        return amountOfStrings;
    }

    public String getPickguard() {
        return pickguard;
    }

    public String getPickups() {
        return pickups;
    }
    
    @Override
        public void playSolo() {
    }
}
