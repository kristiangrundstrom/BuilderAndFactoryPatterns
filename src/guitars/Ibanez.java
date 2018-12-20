package guitars;

import inlamning2_del1.GuitarStore.Guitar;
import inlamning2_del1.ISolo;

public class Ibanez extends Guitar implements ISolo {
   
    private String color;
    private int amountOfStrings;
    
    public Ibanez(String color, int amountOfStrings) {
        this.color = color;
        this.amountOfStrings = amountOfStrings;
    }
    
    @Override
    public void playSolo() {
        System.out.println("Heavy metal solo on a burning guitar going on!");
    }
    
}
