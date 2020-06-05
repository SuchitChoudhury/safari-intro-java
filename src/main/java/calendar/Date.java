package calendar;

public class Date {
  public int day;
  public int month;
  public int year;

  public static boolean isLeapYear(int year) {
    return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
  }

  public static int daysInMonth(int month, int year) {
    switch (month) {
      case 9:
      case 4:
      case 6:
      case 11:
        return 30;
        // Normally need "break" to avoid "fall through"
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        return 31;
      case 2:
//        if (isLeapYear(year)) return 29;
//        else return 28;
        return isLeapYear(year) ? 29 : 28;
      default:
         throw new IllegalArgumentException("Bad month value");
    }
  }

  // method overloading (same name, different argument list)
  public static int dayOfWeek(int day, int month) {
    return dayOfWeek(day, month, 2020);
  }

  // Saturday = 0 ... Friday = 6
  public static int dayOfWeek(int day, int month, int year) {
    // Zeller's congruence -- wikipedia
    if (month < 3) {
      month += 12;
      year--;
    }
    return (day + (13 * (month + 1) / 5) + year + year/4 - year/100 + year/400) % 7;
  }
}
