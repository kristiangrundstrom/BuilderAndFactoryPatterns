package inlamning2_del1.GuitarStore;

public class GuitarStore {
    
    private final GuitarFactory guitarFactory;
    
    public GuitarStore(GuitarFactory guitarFactory) {
        this.guitarFactory = guitarFactory;
    }
    
    public Guitar createGuitar(String guitarBrand) {
        Guitar guitar = new GuitarFactory().makeGuitar(guitarBrand);
        
        return guitar;
    }
    
    
    
}
