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
        return result;
    }

    private double farenheitToCelsius(double F) {
        double result = (F * (5 / 9)) - 32;
        return result;
    }

    public static void main(String[] args) {
        println(celciusToFarenheit(180));
        println(farenheitToCelsius(250));
    }
}