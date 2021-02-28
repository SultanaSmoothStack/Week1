package main.java.com.sultana.datetime;

import java.time.LocalDate;
import java.time.Month;
public class Birthday {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1982,Month.OCTOBER,10);
        System.out.println(localDate);
    }
}
