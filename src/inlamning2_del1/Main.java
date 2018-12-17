package inlamning2_del1;

import inlamning2_del1.GuitarStore.GuitarFactory;
import inlamning2_del1.GuitarStore.GuitarStore;

public class Main {
    
    
    public static void main(String[] args) {
           
        /*
            En GuitarBuilder som tar in valfritt antal parametrar
            T.om. en helt specifikationslös gitarr. En luftgitarr.
        */
        
        GuitarBuilder airGuitar = new GuitarBuilder.Builder().build();
        GuitarBuilder Ibanez = new GuitarBuilder.Builder().brand("Ibanez").build();
        GuitarBuilder FenderStarCaster = new GuitarBuilder.Builder().brand("Fender").model("Starcaster").build();
        GuitarBuilder GibsonLesPaul = new GuitarBuilder.Builder().brand("Gibson").model("Les Paul").amountOfStrings(6).build();

        /*
            En gitarrsolo-factory.
        */

        SoloFactory soloFactory = new SoloFactory();
        
        ISolo solo1 = soloFactory.getGuitarModel("Les Paul");
        ISolo solo2 = soloFactory.getGuitarModel("Starcaster");
        ISolo solo3 = soloFactory.getGuitarModel("Xv500");
        
        solo1.playSolo();
        solo2.playSolo();
        solo3.playSolo();
        
        /*
            En gitarrbutiksom även som bygger nya gitarrer.
        */
        
        GuitarStore guitarStore = new GuitarStore(new GuitarFactory());
        guitarStore.createGuitar("Washburn");
        guitarStore.createGuitar("Martin");

    }
}
