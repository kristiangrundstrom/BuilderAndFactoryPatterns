package inlamning2_del1.GuitarStore;

import guitars.*;

public class GuitarFactory {    
    Guitar guitar = null;
    
    public Guitar makeGuitar(String brand) {    
        
        switch (brand) {
            case "Washburn":
                guitar = new Washburn();
                return guitar;
            case "Martin":
                guitar = new Martin();
                return guitar;
            default:
                return null;
        }
    }
}
