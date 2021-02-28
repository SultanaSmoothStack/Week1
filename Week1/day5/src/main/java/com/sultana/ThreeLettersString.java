package main.java.com.sultana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ThreeLettersString {
    public static void main(String[] args) {
        ThreeLettersString threeLettersString = new ThreeLettersString();
        List<String> inputList = new ArrayList<String>();
        inputList.add("aaa");
        inputList.add("aaab");
        inputList.add("caaa");
        inputList.add("daaa");
        inputList.add("aaz");
                //Arrays.asList(new String[]{"aaa", "aaaer","baaa","daaa"});

        threeLettersString.filterList(inputList);
    }

    public  void filterList(List<String> inputList) {
        final List<String> outputList = inputList.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length()== 3)
                .collect(Collectors.toList());
        System.out.println(outputList);
    }
}
