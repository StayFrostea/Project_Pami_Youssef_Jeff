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

    public double celsiusToFarenheit(final double C) {
        final double result = (C * (9 / 5)) + 32;
        return result;
    }

    public double farenheitToCelsius(final double F) {
        final double result = (F * (5 / 9)) - 32;
        return result;
    }

    private double kilometersToMiles(final double M)
    {
        return (M*0.621371);
    }

    public static void main(final String[] args) {
        Converter temp = new Converter();
        System.out.println(temp.celciusToFarenheit(180));
        System.out.println(temp.farenheitToCelsius(250));
    }
}