package com.sultana;

import java.util.ArrayList;
import java.util.List;
public class RightMostDigit {
    public static void main(String[] args) {
        RightMostDigit rightMostDigit = new RightMostDigit();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(16);
        numbers.add(11);
        numbers.add(112);
        numbers.add(104);
        List<Integer> resultList = rightMostDigit.getRightMostDigit(numbers);
        System.out.println(resultList);
    }

    private List<Integer> getRightMostDigit(List<Integer> inputList) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer num : inputList) {
            num = num % 10;
            resultList.add(num);
        }
        return resultList;
    }


}
