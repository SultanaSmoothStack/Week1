package main.java.com.sultana.lambda;
import java.util.Arrays;
import java.util.Comparator;

public class BasicLambda {

    public static void main(String[] args) {
        BasicLambda basicLambda = new BasicLambda();
        String[] names = new String[]{"Sultana","Soha", "Zoha","Zareeb", "Javed","Ezan"};
        basicLambda.sortByAscending(names);
        basicLambda.sortByDescending(names);
        basicLambda.sortByAlphabeticallyByFirst(names);
        basicLambda.sortByCharacter(names);
    }

    public void sortByDescending(String[] names) {
        if (names == null) {
            return;
        }
        Arrays.sort(names, (str1, str2) -> str2.length() - str1.length());
        System.out.println("Sorting a names array in descending order: \n" + Arrays.deepToString(names));
    }

    public void sortByAscending(String[] names) {
        if (names == null) {
            return;
        }
        Arrays.sort(names, (str1, str2) -> str1.length() - str2.length());
        System.out.println("Sorting a names array in ascending order: \n" + Arrays.deepToString(names));
    }
    public void sortByAlphabeticallyByFirst(String[] names){
        if (names == null) {
            return;
        }
        Arrays.sort(names, (str1, str2) -> str1.charAt(0) - str2.charAt(0));
        //Arrays.asList(names).forEach(System.out::println);
        System.out.println("Sorting a names array alphabetically by the first character: \n" + Arrays.deepToString(names) );
    }
    public void sortByCharacter(String[] names){
        if (names == null) {
            return;
        }
        Arrays.sort(names, Comparator.comparingInt(a -> (a.contains("E") || a.contains("e") ? 0 : 1)));
        for(String name : names)
            System.out.println("Strings that contain “e” first, everything else second: \n"+ Arrays.deepToString(names));
    }
}
