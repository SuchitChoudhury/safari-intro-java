package calendar;

public class UseDates {
  public static void main(String[] args) {
    System.out.println("Day of week of Jan 1, 2000 is " +
        Date.dayOfWeek(1, 1, 2000));
    System.out.println("Day of week of Jan 1, 2020 is " +
        Date.dayOfWeek(1, 1));

    Date today = new Date();
    today.day = 5;
    today.month = 6;
    today.year = 2020;



  }
}
