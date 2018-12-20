package guitars;

import inlamning2_del1.GuitarStore.Guitar;
import inlamning2_del1.ISolo;

public class Martin extends Guitar implements ISolo {
   
    @Override
    public void playSolo() {
        System.out.println("A nice acoustic solo from this old Martin.");
    }
}
