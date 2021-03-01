package main.java.com.sultana.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class ZoneDateTime {

    public static void main(String[] args) {
        zoneDateTimeInstance();
        InstanceToZoneDate();

    }

    public static void zoneDateTimeInstance() {
        ZonedDateTime zdt = Instant.now().atZone(ZoneId.systemDefault());
        System.out.println(zdt);
    }
    public static void InstanceToZoneDate() {
        Instant inst = ZonedDateTime.now().toInstant();
        System.out.println(inst);
    }
}
