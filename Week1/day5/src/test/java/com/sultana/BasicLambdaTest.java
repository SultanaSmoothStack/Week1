package test.java.com.sultana;

import main.java.com.sultana.BasicLambda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicLambdaTest {

    @Test
    public void testSortByDescending() {
        String[] names = new String[]{"Sultana","Sohaa", "Zoha","Zareeb", "Javed"};
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByDescending(names);
        assertEquals(names[0], "Sultana");
        assertEquals(names[4], "Zoha");
    }

    @Test
    public void testSortByAscending() {
        String[] names = new String[]{"Sultana","Sohaa", "Zoha","Zareeb", "Javed"};
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByAscending(names);
        assertEquals(names[0], "Zoha");
        assertEquals(names[4], "Sultana");
    }

    @Test
    public void testSortByAscendingForNull() {
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByAscending(null);
    }

    @Test
    public void testSortByAscendingForEmpty() {
        String[] names = new String[]{};
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByAscending(names);
        assertEquals(names.length, 0);
    }
}
