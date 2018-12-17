package inlamning2_del1.GuitarStore;

import inlamning2_del1.ISolo;


public class GuitarStore {
    
    private GuitarFactory guitarFactory;
    
    public GuitarStore(GuitarFactory guitarFactory) {
        this.guitarFactory = guitarFactory;
    }
    
    public Guitar createGuitar(String guitarBrand) {
        Guitar guitar = new GuitarFactory().makeGuitar(guitarBrand);
        
        // Interface implementation av ISolo så att även den nya gitarren får riva av ett solo.
        guitar.playSolo();
        
        return guitar;
    }
    
    
    
}
