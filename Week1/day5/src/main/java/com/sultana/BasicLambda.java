package main.java.com.sultana;

import java.util.Arrays;
public class BasicLambda {

    public static void main(String[] args) {
        BasicLambda basicLambda = new BasicLambda();
        String[] names = new String[]{"Sultana","Soha", "Zoha","Zareeb", "Javed"};
        basicLambda.sortByAscending(names);
        basicLambda.sortByDescending(names);
    }

    public void sortByDescending(String[] names) {
        if (names == null) {
            return;
        }
        Arrays.sort(names, (str1, str2) -> str2.length() - str1.length());
        System.out.println("Sorting a names array in descending order  using Lamda: \n" + Arrays.deepToString(names));
    }

    public void sortByAscending(String[] names) {
        if (names == null) {
            return;
        }
        Arrays.sort(names, (str1, str2) -> str1.length() - str2.length());
        System.out.println("Sorting a names array in ascending order  using Lamda: \n" + Arrays.deepToString(names));
    }
}
