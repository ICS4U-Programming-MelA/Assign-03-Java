// Import modules.
import java.lang.NumberFormatException;
import java.util.Scanner;

/** Copyright (c) 2022 Mel Aguoth All rights reserved.
 * This produces a numeric pattern symmetric about n (a user-inputted integer) where each half
 * before and after n is also symmetric around n-1.
 *
 * @author  Mel Aguoth
 * @version 11.0.13
 * @since 2022-02-01
 */

final class Recursion {
  private static void numberPattern(final int funcInt) {

    // If the user's integer is 1, display 1.
    if (funcInt == 1) {
      System.out.print(" " + funcInt + " ");

    // If the user's integer is above 1, display the pattern for their integer.
    } else {
      numberPattern(funcInt - 1);
      if (funcInt > 5) {
        System.out.println(funcInt);
      } else {
        System.out.print(funcInt);
      }
      numberPattern(funcInt - 1);
    }
  }

  public static void main(final String[] args) {

    // Declare an empty string for a NumberFormatException.
    String userString = "";

    try {

      // Introduce the program.
      System.out.println("This program displays a pattern using a user-inputted integer."
                       + " The integer has to be between 1 and 15.");

      // Get the user's integer.
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      userString = input.next();
      final int userInt = Integer.parseInt(userString);
      input.close();

      // If the user's integer isn't between 1 and 15, display an error to the user.
      if (userInt < 1 || userInt > 15) {
        System.out.println("\n" + userInt + " isn't between 1 and 15. Please try again.");
      } else {

        // Call numberPattern.
        System.out.println();
        numberPattern(userInt);
        System.out.println();
      }

      // If the user's input isn't an integer, display an error to the user.
    } catch (NumberFormatException e2) {
      System.out.println("\n" + "'" + userString + "' isn't an integer."
                       + " Please enter a proper integer.");
    }
  }
}
