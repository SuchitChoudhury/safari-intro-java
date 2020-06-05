package many;

public class UseArrays {
  public static void main(String[] args) {
    int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("number at position zero is " + numbers[0]);

    numbers[4] = 99;

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("number at position " + i + " is " + numbers[i]);
    }
  }
}
