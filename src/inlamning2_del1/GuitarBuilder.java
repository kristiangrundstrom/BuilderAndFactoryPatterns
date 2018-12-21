package inlamning2_del1;
/*
    1. GuitarBuilder är en public class som ska kunna instantieras.

    2. Builder är en static inner class till GuitarBuilder.

    3. Varje metod i Builder sätter respektive argument till Builderns field variable och sen returnerar sig själv.
    Detta för att sätta värden på Builders variabler och sen om just metoden kallas så returnar den en variabel.

    4. I GuitarBuilders konstruktor (som tar Builder builder) får GuitarBuilder field variablerna från Builders metoder.
*/

public class GuitarBuilder {
    
        private String brand;
        private String model;
        private String color;
        private int amountOfStrings;

    public static class Builder {
        
        private String brand;
        private String model;
        private String color;
        private int amountOfStrings;
        
        public Builder color(String color) {
            this.color = color;
            return this;
        }
        
        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }
        
        public Builder model(String model) {
            this.model = model;
            return this;
        }
        
        public Builder amountOfStrings(int num) {
            this.amountOfStrings = num;
            return this;
        }
        
        public GuitarBuilder build() {
        
            GuitarBuilder guitar = new GuitarBuilder();
            guitar.brand = this.brand;
            guitar.model = this.model;
            guitar.color = this.color;
            guitar.amountOfStrings = this.amountOfStrings;

            return guitar;
        }
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getAmountOfStrings() {
        return amountOfStrings;
    }

    public String getColor() {
        return color;
    }    
}
