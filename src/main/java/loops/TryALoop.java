package loops;

public class TryALoop {
  public static void main(String[] args) {
    int x = 3;
    while (x > 0) { // must be a boolean type value (true or false)
      System.out.println("x is " + x);
//      x = x - 1;
      x -= 1;
      x--; // decrement by 1, ++, --, pre/post variants
    }

    for (int y = 0; y < 5; y++) {
      System.out.println("y is " + y);
    }
  }
}
