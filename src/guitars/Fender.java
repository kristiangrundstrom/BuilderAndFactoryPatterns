package guitars;

import inlamning2_del1.GuitarStore.Guitar;
import inlamning2_del1.ISolo;

public class Fender extends Guitar implements ISolo {
    private String color;
    private int amountOfStrings;
    
    public Fender(String color, int amountOfStrings) {
        this.color = color;
        this.amountOfStrings = amountOfStrings;
    }
    @Override
    public void playSolo() {
        System.out.println("Funky soloing going on here!");
    }
    
}
