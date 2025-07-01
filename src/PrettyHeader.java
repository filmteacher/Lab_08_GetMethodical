import java.util.Scanner;

/**
 * PrettyHeader program for Lab08
 * @author Matt Bennett matt.bennett@uc.edu
 */

public class PrettyHeader
{
    public static void main(String[] args)
    {
        String msg = "Message Centered Here";
        printHeader(msg);
    }

    /**
     * @param msg the message to be centered
     */
    public static void printHeader(String msg) {
        String fullLine = "";
        int leftSpace = 0;
        int rightSpace = 0;
        int lineLength = 54 - msg.length();
        int evenOdd = lineLength % 2;

        if (evenOdd == 0) {
            leftSpace = lineLength / 2;
            rightSpace = lineLength / 2;
        } else {
            leftSpace = lineLength / 2;
            rightSpace = (lineLength / 2) + 1;
        }

        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");

        for (int i = 0; i < leftSpace; i++) {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int j = 0; j < rightSpace; j++) {
            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();

        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}