import java.util.Scanner;

/**
 *@author Matt Bennett matt.bennett@uc.edu
 * Fav Numbers program for Lab08
 */

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        double num2 = 0;

        num1 = SafeInput.getInt(in, "Enter your favorite integer");
        num2 = SafeInput.getDouble(in, "Enter your favorite double");

        System.out.println("Your favorite integer is: " + num1);
        System.out.println("Your favorite double is: " + num2);
    }
}
