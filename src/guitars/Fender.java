package guitars;

import inlamning2_del1.ISolo;

public class Fender implements ISolo {
    
    @Override
    public void playSolo() {
        System.out.println("Funky soloing going on here!");
    }
    
}
