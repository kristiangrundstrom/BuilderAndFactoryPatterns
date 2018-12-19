package guitars;

import inlamning2_del1.GuitarStore.Guitar;
import inlamning2_del1.ISolo;

public class Washburn extends Guitar implements ISolo {
    
    @Override
    public void playSolo() {
        System.out.println("New Washburn can also play a solo!");
    }
    
}
