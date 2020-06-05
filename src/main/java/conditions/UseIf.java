package conditions;

public class UseIf {
  public static void main(String[] args) {
    int x = 0;
    if (x > 0) {
      System.out.println("x has the value " + x
          + " which is greater than zero");
    } else if ( x == 0) {
      System.out.println("x is actually zero");
    } else {
      System.out.println("x is not greater than zero");
    }
  }
}
