package inlamning2_del1.GuitarStore;

import inlamning2_del1.Guitars.Martin;
import inlamning2_del1.Guitars.Washburn;

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
