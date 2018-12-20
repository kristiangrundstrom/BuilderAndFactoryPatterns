package inlamning2_del1;

import inlamning2_del1.GuitarStore.Guitar;
import inlamning2_del1.Guitars.*;

public class SoloFactory {
    
    public ISolo getGuitarModel(String guitarModel, String color, int amountOfStrings) {
        
        Guitar guitar = null;
        
        switch (guitarModel) {
            case "Les Paul":
                guitar = new LesPaul(color,amountOfStrings);
                return guitar;
            case "Starcaster":
                guitar = new Fender(color,amountOfStrings);
                return guitar;
            case "Xv500":
                guitar = new Ibanez(color,amountOfStrings);
                return guitar;
        }

        return null;
    }    
}
