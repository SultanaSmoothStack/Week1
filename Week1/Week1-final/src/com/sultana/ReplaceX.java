package com.sultana;

import java.util.ArrayList;

public class ReplaceX {
    public static void main(String[] args) {
        ReplaceX replaceX = new ReplaceX();

        ArrayList<String> inputStrings = new ArrayList<String>();
        inputStrings.add("axx");
        inputStrings.add("axbx");
        inputStrings.add("xcxx");
        inputStrings.add("bcxx");

        ArrayList<String> result =replaceX.removeX(inputStrings);
        System.out.println(result);
    }

    private ArrayList<String> removeX(ArrayList<String> removeInputStrings) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : removeInputStrings) {
            String replaced = word.replaceAll("x", "");
            result.add(replaced);
        }

        return result;
    }
}