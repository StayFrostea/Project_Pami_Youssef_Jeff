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

    private double celsiusToFarenheit(final double C) {
        final double result = (C * (9 / 5)) + 32;
        return result;
    }

    private double farenheitToCelsius(final double F) {
        final double result = (F * (5 / 9)) - 32;
        return result;
    }

    public static void main(final String[] args) {
        System.out.println(celciusToFarenheit(180));
        System.out.println(farenheitToCelsius(250));
    }
}