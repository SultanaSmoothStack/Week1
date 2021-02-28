package main.java.com.sultana.lambda;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.joining;

public class ListToString {
    public static void main(String[] args) {
        ListToString listToString = new ListToString();
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(344);
        intList.add(20);
        intList.add(33);
        intList.add(11);
        intList.add(21);
        intList.add(34);
        listToString.listToCommaSeparatedString(intList);
    }

    public String listToCommaSeparatedString(List<Integer> intList) {
        final String commaSeparatedString = intList.stream()
                .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
                .collect(joining(","));
        System.out.println(commaSeparatedString);
        return commaSeparatedString;
    }

    public String listToCommaSeparatedStringUsingBuilder(List<Integer> intList) {
        StringBuilder stringBuilder = new StringBuilder();
        intList.forEach(integer -> stringBuilder.append(integer % 2 == 0 ? "e" : "o").append(integer));
        return stringBuilder.toString();
    }

    /*private String getPrefix(Integer integer) {
        return integer % 2 == 0 ? "e" : "o";
    }*/
}
