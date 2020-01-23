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

<<<<<<< HEAD
    public double celsiusToFarenheit(final double C) {
        final double result = (C * (9 / 5)) + 32;
        return result;
    }

    public double farenheitToCelsius(final double F) {
        final double result = (F * (5 / 9)) - 32;
        return result;
=======
    
    private double celciusToFarenheit(double c){
          return (c * (1.8)) + 32;
    }
    
    private double farenheitToCelcius(double f){
        return (f - 32) * (0.56);
>>>>>>> e35a13d09d5241cefd1e06e99b947253514f4564
    }

    private double kilometersToMiles(final double M)
    {
        return (M*0.621371);
    }
<<<<<<< HEAD

    public static void main(final String[] args) {
        Converter temp = new Converter();
        System.out.println(temp.celciusToFarenheit(180));
        System.out.println(temp.farenheitToCelsius(250));
=======
    
    public static void main(String[] args) {
        Converter convVal = new Converter();
    
        double f = convVal.celciusToFarenheit(180);
        double c = convVal.farenheitToCelcius(250);
    
        System.out.print(c);
        System.out.println(" " + "degrees C");
        System.out.print(f);
        System.out.print(" " + "degrees F");
>>>>>>> e35a13d09d5241cefd1e06e99b947253514f4564
    }
}
    
