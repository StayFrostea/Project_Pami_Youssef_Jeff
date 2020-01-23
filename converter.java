package com.company;
public class Converter {
    /*
     * 
     * @Author: Jeff Roszell
     * 
     * @Author: Jesupamilerin Falade
     * 
     * @Author: Youssef Maksoud
     * 
     */

    
    private double celciusToFarenheit(double c){
          return (c * (1.8)) + 32;
    }
    
    private double farenheitToCelcius(double f){
        return (f - 32) * (0.56);
    }

    private double kilometersToMiles(final double M)
    {
        return (M*0.621371);
    }
    
    public static void main(String[] args) {
        Converter convVal = new Converter();
    
        double f = convVal.celciusToFarenheit(180);
        double c = convVal.farenheitToCelcius(250);
    
        System.out.print(c);
        System.out.println(" " + "degrees C");
        System.out.print(f);
        System.out.print(" " + "degrees F");
    }
}
    
