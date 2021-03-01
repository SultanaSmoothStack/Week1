package main.java.com.sultana.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
public class MonthsInYear {

    public static void main(String[] args) {
        /*LocalDate date = LocalDate.now();
        System.out.printf("%s: %d%n%n", date, date.lengthOfMonth());

        YearMonth yearMonth = YearMonth.of(2021, Month.FEBRUARY);
        System.out.printf("%s: %d%n%n", yearMonth, yearMonth.lengthOfMonth());

        for (int month = 1; month <=12 ; month++) {
            yearMonth = YearMonth.of(2021,Month.of(month));
            System.out.printf("%s: %d%n", yearMonth, yearMonth.lengthOfMonth());
        }
        */
        int year = 0;
        for (Month month : Month.values()) {
            YearMonth ym = YearMonth.of(year, month);
            System.out.printf("%s: %d days%n", month, ym.lengthOfMonth());

        }
    }
}
