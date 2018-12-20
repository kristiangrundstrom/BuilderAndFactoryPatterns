package inlamning2_del1;

import inlamning2_del1.GuitarStore.Guitar;
import inlamning2_del1.GuitarStore.GuitarFactory;
import inlamning2_del1.GuitarStore.GuitarStore;

public class Main {

    public static void main(String[] args) {
        
        /*
            En GuitarBuilder som tar in valfritt antal parametrar
            T.om. en helt specifikationslös gitarr. En luftgitarr.
        */
        
        GuitarBuilder airGuitar = new GuitarBuilder.Builder().build();
        GuitarBuilder ibanez = new GuitarBuilder.Builder().brand("Ibanez").build();
        GuitarBuilder fenderStarCaster = new GuitarBuilder.Builder().brand("Fender").model("Starcaster").build();
        GuitarBuilder gibsonLesPaul = new GuitarBuilder.Builder().brand("Gibson").model("Les Paul").amountOfStrings(6).build();

        /*
            En enklare gitarrsolo-factory som implementerar ett ISolo interface så varje gitar kan dra av ett solo.
        */

        SoloFactory soloFactory = new SoloFactory();
        
        ISolo LP = soloFactory.getGuitarModel("Les Paul","White",6);
        ISolo Starcaster = soloFactory.getGuitarModel("Starcaster","Pearl White",6);
        ISolo XV500 = soloFactory.getGuitarModel("Xv500","Blue",6);
        
        LP.playSolo();
        Starcaster.playSolo();
        XV500.playSolo();
        
        /*
            En gitarrbutik som även bygger gitarrer. ISolo är implementerat även här för gitarrsolon.
        */
        
        GuitarStore guitarStore = new GuitarStore(new GuitarFactory());
        Guitar washburn = guitarStore.createGuitar("Washburn");
        Guitar martin = guitarStore.createGuitar("Martin");

        washburn.playSolo();
        martin.playSolo();
    }
}
