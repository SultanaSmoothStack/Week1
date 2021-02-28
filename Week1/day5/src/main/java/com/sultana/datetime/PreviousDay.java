package main.java.com.sultana.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class PreviousDay {
    //private static Object date;

    public static void main(String[] args) {
        previousDay();
    }

    public static void previousDay() {
        LocalDate date = LocalDate.of(2021,Month.FEBRUARY,28);
        LocalDate previous = date.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));

        System.out.println(previous);
    }
}
