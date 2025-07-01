/**
 * PrettyHeader program for Lab08
 * @author Matt Bennett matt.bennett@uc.edu
 */

public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        double celcius = 0;

        System.out.println("Celcius to Farenheit");
        System.out.println("====================");

        for (int i = -100; i < 101; i++)
        {
            celcius = i;
            double farenheit = convert(celcius);
            System.out.printf("%6.1fC is %6.1fF%n", celcius , farenheit);
        }
    }

    /**
     * @param celcius the message to be centered
     * @return farenheit the converted temp
     */
    public static double convert(double celcius)
    {
        double farenheit = 0.0;
        farenheit = (celcius * 9 / 5) + 32;
        return farenheit;
    }
}