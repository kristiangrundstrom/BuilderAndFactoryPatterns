package guitars;

import inlamning2_del1.ISolo;

public class LesPaul implements ISolo {
    
    @Override
    public void playSolo() {
        System.out.println("Screaming rock guitar solo from the Les Paul!");
    }
}
