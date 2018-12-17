package inlamning2_del1.GuitarStore;

import inlamning2_del1.LesPaul;


public class GuitarFactory {    
    
    public Guitar makeGuitar(String brand) {
        
        Guitar guitar = null;
        
        switch (brand) {
            case "Washburn":
                guitar = new Washburn();
                return guitar;
            case "Martin":
                guitar = new Martin();
                return guitar;
        }
        
        return null;
    }
    
}
