package inlamning2_del1.GuitarStore;

import guitars.*;

public class GuitarFactory {    
    
    public Guitar makeGuitar(String brand) {    
        
        switch (brand) {
            case "Washburn":
                return new Washburn();
            case "Martin":
                return new Martin();
            default:
                return null;
        }
    }
}
