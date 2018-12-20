package inlamning2_del1.GuitarStore;

import inlamning2_del1.ISolo;

public class Guitar implements ISolo {
    
    private String color;
    private int amountOfStrings;
    
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
    }
}
