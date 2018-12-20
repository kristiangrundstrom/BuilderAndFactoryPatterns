package inlamning2_del1;

import guitars.*;

public class SoloFactory {
    
    public ISolo getGuitarModel(String guitarModel, String color, int amountOfStrings) {
        
        switch (guitarModel) {
            case "Les Paul":
                return new LesPaul(color,amountOfStrings);
            case "Starcaster":
                return new Fender(color,amountOfStrings);
            case "Xv500":
                return new Ibanez(color,amountOfStrings);
        }

        return null;
    }
}
