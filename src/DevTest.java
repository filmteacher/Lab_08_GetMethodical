import java.util.Scanner;

/**
 * Scratch test file
 * @author Matt Bennett matt.bennett@uc.edu
 */

public class DevTest
{
    public static void main(String[] args)
    {
        // test getNonZeroLenString
        Scanner in = new Scanner(System.in);
        String input = "";

        input = SafeInput.getNonZeroLenString(in, "Enter a String");
        System.out.println("You entered " + input);

        // test getInt
        //Scanner in = new Scanner(System.in);
        //int num = 0;

        //num = SafeInput.getInt(in, "Enter an integer");
        //System.out.println("You entered " + num);

        // test getDouble
        //Scanner in = new Scanner(System.in);
        //double num = 0;

        //num = SafeInput.getDouble(in, "Enter a double");
        //System.out.println("You entered " + num);

        // test getRangedInt
        //Scanner in = new Scanner(System.in);
        //int num = 0;

        //num = SafeInput.getRangedInt(in, "Enter an integer", 5, 20);
        //System.out.println("You entered " + num);

        // test getRangedDouble
        //Scanner in = new Scanner(System.in);
        //double num = 0;

        //num = SafeInput.getRangedDouble(in, "Enter a double", 1.5, 50.5);
        //System.out.println("You entered " + num);

        // test getYNConfirm
        //Scanner in = new Scanner(System.in);
        //boolean confirm = false;

        //confirm = SafeInput.getYNConfirm(in, "Enter Y for yes or N for no");

        //if (confirm==true)
        //{
        //    System.out.println("You entered yes.");
        //}
        //else
        //{
        //    System.out.println("You entered no.");
        //}

        //test getRegExString
        //Scanner in = new Scanner(System.in);
        //String input = "";

        //input = SafeInput.getRegExString(in, "Enter your birthday in the format MM-DD-YYYY: ", "\\d{2}-\\d{2}-\\d{4}");
        //System.out.println("You entered " + input);
    }
}
