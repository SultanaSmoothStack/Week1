package main.java.com.sultana;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.joining;

public class ListToString {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(33);
        intList.add(11);
        intList.add(21);
        intList.add(34);

        final String collect = intList.stream()
                .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
                .collect(joining(","));
        System.out.println(collect);
    }
}
