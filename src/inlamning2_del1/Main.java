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
        
        GuitarBuilder airGuitar = new GuitarBuilder.Builder().pickguard("transparent").build();
        GuitarBuilder ibanez = new GuitarBuilder.Builder().brand("Ibanez").color("green").pickguard("red").build();
        GuitarBuilder fenderStarCaster = new GuitarBuilder.Builder().brand("Fender").model("Starcaster").color("Pearl White").pickups("single coil").build();
        GuitarBuilder gibsonLesPaul = new GuitarBuilder.Builder().brand("Gibson").model("Les Paul").color("cherry Sunburst").pickguard("black").pickups("humbuckers").amountOfStrings(6).build();

        // Gitarrerna ihopsatta.
        System.out.println("The airguitar's pickguard is: " + airGuitar.getPickguard());
        System.out.println(ibanez.getBrand() + " is " + ibanez.getColor() + ".");
        System.out.println(fenderStarCaster.getBrand() + " is a " + fenderStarCaster.getModel() + " and is in " + fenderStarCaster.getColor() + ".");
        System.out.println(gibsonLesPaul.getBrand() + " " + gibsonLesPaul.getModel() + " has " + gibsonLesPaul.getAmountOfStrings() + " strings" + " and "+
                "the " + gibsonLesPaul.getPickups() + " are just below the " + gibsonLesPaul.getPickguard() + " pickguard.");
        
        System.out.println("");
        
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
        System.out.println("");
        
        System.out.println("The Washburn guitar is: " + washburn.getColor() + " with a " + washburn.getPickguard() + " pickguard and " + washburn.getPickups() + " pickups.");
        System.out.println("The Martin guitar is: " + martin.getColor() + " with " + martin.getAmountOfStrings() + " strings and " + martin.getPickguard() + " pickguard.");
        System.out.println("");
        
        washburn.playSolo();
        martin.playSolo();
    }
}
