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

    private double celsiusToFarenheit(double C) {
        double result = (C * (9 / 5)) + 32;
    }

    private double farenheitToCelsius(double F) {
        double result = (F * (5 / 9)) - 32;
    }

    public static void main(String[] args) {
        println(celciusToFarenheit(180));
        println(farenheitToCelsius(250));
    }
}