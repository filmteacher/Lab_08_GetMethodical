import java.util.Scanner;

/**
 *@author Matt Bennett matt.bennett@uc.edu
 * Birth Date Time program for Lab08
 */

public class BirthDateTime
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;

        year = SafeInput.getRangedInt(in, "Enter a year", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter a month", 1, 12);

        switch (month) {
            case 9, 4, 6, 11:
                day = SafeInput.getRangedInt(in, "Enter a day", 1, 30);
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                day = SafeInput.getRangedInt(in, "Enter a day", 1, 31);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "Enter a day", 1, 29);
                break;
        }

        hours = SafeInput.getRangedInt(in, "Enter the hours", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter the minutes", 1, 59);

        System.out.println("You were born on " + month + "-" + day + "-" + year + ", at " + hours + ":" + minutes + " o'clock.");
    }
}
