package main.com.sultana.assignment1;

public class Test {
    public static void main(String[] args) {
        DemoSingleton s1 = DemoSingleton.getInstance();
        DemoSingleton s2 = DemoSingleton.getInstance();
        s1.value =10;
        System.out.println(s1 == s2);
        System.out.println("Value of s1 " + s1.value);

    }
}
