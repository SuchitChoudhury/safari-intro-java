package many;

import java.util.ArrayList;
import java.util.List;

public class UseAList {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Fred");

    System.out.println(names);
    System.out.println(names.size());
    names.add("Jim");
    names.add("Sheila");
    System.out.println(names);
    System.out.println(names.size());

    for (int i = 0; i < names.size(); i++) {
      System.out.println("item at index " + i + " is " + names.get(i));
    }
  }
}
