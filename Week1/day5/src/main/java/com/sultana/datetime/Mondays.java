package main.java.com.sultana.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAdjuster;
import java.time.DateTimeException;

public class Mondays {
    public static void main(String[] args) {

        Month month = null;

        LocalDate date = Year.now().atMonth(month).atDay(1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month mi = date.getMonth();
        while(mi == month){
            System.out.printf("%s%n", date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = date.getMonth();
        }
    }
}
