package inlamning2_del1;

import guitars.*;

public class SoloFactory {
    
    public ISolo getGuitarModel(String guitarModel) {
        
        switch (guitarModel) {
            case "Les Paul":
                return new LesPaul();
            case "Starcaster":
                return new Fender();
            case "Xv500":
                return new Ibanez();
            case "Martin":
                return new Martin();
            case "Washburn":
                return new Washburn();
        }

        return null;
    }
}
