package exceptions;

import java.util.Scanner;

public class ReadInput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.print("enter a number: ");
      String numberText = input.nextLine();
      System.out.println("Your number plus ten is "
          + (Integer.parseInt(numberText) + 10));
    } catch (NumberFormatException nfe) {
      System.out.println("oops, that wasn't a number!");
    }
  }
}
