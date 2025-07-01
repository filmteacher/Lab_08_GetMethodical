import java.util.Scanner;

/**
 *@author Matt Bennett matt.bennett@uc.edu
 * Check Out at the 10$ Store program for Lab08
 */

public class CheckOut
{
    public static void main(String[] args)
    {
        double item = 0.0;
        double total = 0.0;
        boolean goAgain = true;
        Scanner in = new Scanner(System.in);

        do
        {
            item = SafeInput.getRangedDouble(in, "Enter an item", 1.00, 10.00);
            total += item;
            item = 0.0;

            goAgain = SafeInput.getYNConfirm(in, "Would you like to enter another item");
        } while(goAgain);

        System.out.printf("Your total is $%.2f\n", total);
    }
}