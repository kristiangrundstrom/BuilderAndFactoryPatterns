package inlamning2_del1;

public class SoloFactory {
    
    public ISolo getGuitarModel(String guitarModel) {
        
        switch (guitarModel) {
            case "Les Paul":
                return new LesPaul();
                
            case "Starcaster":
                return new Starcaster();
                
            case "Xv500":
                return new Xv500();
        }

        return null;
    }
}
