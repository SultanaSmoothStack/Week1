package com.sultana;

import java.util.ArrayList;
import java.util.List;
public class MultiplyByTwo {

    public static void main(String[] args) {
        MultiplyByTwo multiplyByTwo = new MultiplyByTwo();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(11);
        numbers.add(12);
        numbers.add(10);
        List<Integer> resultList = multiplyByTwo.getMultiplyByTwo(numbers);
        System.out.println(resultList);
    }
    private List<Integer> getMultiplyByTwo(List<Integer>inputList){
        List<Integer> resultList = new ArrayList<>();
        for (Integer num : inputList) {
            num = num * 2;
            resultList.add(num);
        }
        return resultList;
    }
}
