package methods;

public class Examples {
// java passes ALL arguments by VALUE
// BUT the value of anything except a primitive (int, long, double...)
// is a REFERENCE VALUE
  public static double fToC(double f) {
    double c = 5 * (f - 32) / 9;
    return c;
  }

  public static void main(String[] args) {
    double fahrenheit = 98.4;

//    double celsius = 5 * (fahrenheit - 32) / 9;
    double celsius = fToC(fahrenheit);

    System.out.println("Celsius is " + celsius);
  }
}
