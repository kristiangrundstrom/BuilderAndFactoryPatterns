package inlamning2_del1.Guitars;

import inlamning2_del1.GuitarStore.Guitar;
import inlamning2_del1.ISolo;

public class LesPaul extends Guitar implements ISolo {
    private String color;
    private int amountOfStrings;
    
    public LesPaul(String color, int amountOfStrings) {
        this.color = color;
        this.amountOfStrings = amountOfStrings;
    }
    @Override
    public void playSolo() {
        System.out.println("Screaming rock guitar solo from the Les Paul!");
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getAmountOfStrings() {
        return amountOfStrings;
    }
}
