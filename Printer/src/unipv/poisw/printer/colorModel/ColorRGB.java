package unipv.poisw.printer.colorModel;

import unipv.poisw.printer.exeptions.IllegalColorExeption;

public class ColorRGB implements Comparable<ColorRGB> {
    // Fields
    private final int red, green, blue;
    public final static int MAX_VALUE = 256;
    public final static int MIN_VALUE = 0;
    // Constructors
    // Random Color
    public ColorRGB() {
        this.red = (int)(MAX_VALUE * Math.random());
        this.green = (int)(MAX_VALUE * Math.random());
        this.blue = (int)(MAX_VALUE * Math.random());
    }
    //Specific Color
    public ColorRGB(int red, int green, int blue) throws IllegalColorExeption {
    if (red < MIN_VALUE || green < MIN_VALUE || blue < MIN_VALUE || red >= MAX_VALUE || green >= MAX_VALUE || blue >= MAX_VALUE) {
        throw new IllegalColorExeption();
    } else {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
}
    // Getters
    public int getRed() {return red;}
    public int getGreen() {return green;}
    public int getBlue() {return blue;}
    // Gives back the color component passed as parameter
    public int getColor(Color color) {
        return switch (color) {
            case RED -> red;
            case GREEN -> green;
            case BLUE -> blue;
            default -> 0;
        };
    }
    // Converts the color in a hexadecimal number
    @Override
    public String toString() {return "(" + String.format("%02x",red) + "," + String.format("%02x",green) + "," + String.format("%02x",blue) + ')';}
    // Compare to ordinate shapes based on color
    @Override
    public int compareTo(ColorRGB colorRGB) {
        if(colorRGB.getRed() != this.red){return this.red - colorRGB.getRed();
        }else if(colorRGB.getGreen() != this.green){return this.green - colorRGB.getGreen();
        }else{return this.blue - colorRGB.getBlue();}
    }
    @Override
    public boolean equals(Object object) {
        // Controlla se i due riferimenti puntano allo stesso oggetto in memoria.
        if (this == object) {return true;}
        // Controlla se l'oggetto passato è nullo o di una classe diversa.
        if(object == null || getClass() != object.getClass()) {return false;}
        // Esegue un cast sicuro, sapendo che l'oggetto è della classe RGBColor.
        final ColorRGB colorRGB = (ColorRGB) object;
        // Confronta i valori delle componenti red, green e blue.
        if(this.red != colorRGB.red){return false;}
        if(this.green != colorRGB.green){return false;}
        if(this.blue != colorRGB.blue){return false;}
        // Se tutti i confronti sono superati, i due oggetti sono uguali.
        return true;
    }
}

