import java.util.Scanner;

/**
 *@author Matt Bennett matt.bennett@uc.edu
 * RegEx is Magic program for Lab08
 */

public class Reggie
{
    public static void main(String[] args)
    {
        String ssn = "";
        String ucid = "";
        String menu = "";
        Scanner in = new Scanner(System.in);

        //get a SSN from the user using this pattern: ^\\d{3}-\\d{2}-\\d{4}$
        ssn = SafeInput.getRegExString(in, "Enter your SSN in the format ###-##-####: ", "^\\d{3}-\\d{2}-\\d{4}$");

        //get a UC Student M number using this pattern ^(M|m)\\d{5}$
        ucid = SafeInput.getRegExString(in, "Enter your UC M number in the format M#####: ", "^(M|m)\\d{5}$");

        //get a menu choice using this pattern ^[OoSsVvQq]$ these letters are mnemonics for the menu choices Open Save View Quit
        menu = SafeInput.getRegExString(in, "Enter a menu choice. [O]pen [S]ave [V]iew [Q]uit: ", "^[OoSsVvQq]$");

        System.out.println("Your SSN is: " + ssn);
        System.out.println("Your UC M number is: " + ucid);
        System.out.println("Your menu choice was: " + menu);
    }
}