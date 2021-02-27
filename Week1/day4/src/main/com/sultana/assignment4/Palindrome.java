package main.com.sultana.assignment4;

import java.util.HashMap;
import java.util.Map;
public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.checkLambda();
    }

    private void checkLambda() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Soha");
        map.put("2", "Zoha");
        map.put("3", "Zareeb");
        map.forEach((key, value) -> System.out.println(value));
        if (map.containsKey("2")) {
            System.out.println("Zoha is here");
        }
        String name = map.get("3");
        System.out.println(name);
    }

    public boolean isOdd(int num) {
        return num % 2 != 0;
    }

}
