package hello; // must come first

import java.util.Scanner; // must follow package

public class Hello { // follow imports
  //  public static void main(String [] args)
  public static void main(String[] args) {
//    java.lang.System.out.println("Hello World!");
    System.out.println("Hello World!"); // literal string
    System.out.println(2 + 2); // literal numbers
    int numberOfBananas = 4;
    int priceOfBananas = 39;
    int totalPrice = numberOfBananas * priceOfBananas;
    // + - * /
    System.out.println(totalPrice);

    System.out.println("integer division");
    System.out.println(4 / 3);

    double pi = 3.1415926;
    System.out.println(pi);

//    java.util.Scanner scanner = new java.util.Scanner(System.in);
    // import java.util.scanner (must come right after package)
    Scanner scanner = new Scanner(System.in);
    String theText = scanner.nextLine();
    System.out.println(theText);
    System.out.println(scanner.nextLine());
  }
}
