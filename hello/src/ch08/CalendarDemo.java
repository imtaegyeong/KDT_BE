package ch08;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
  public static void main(String[] args) {
    Date now = new Date();
    System.out.println(now);

    Calendar c = Calendar.getInstance() ;
    System.out.println(c);

    System.out.println(c.get(Calendar.MONTH) + 1);

  }
}
