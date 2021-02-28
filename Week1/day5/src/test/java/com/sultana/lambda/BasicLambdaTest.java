package test.java.com.sultana.lambda;

import main.java.com.sultana.lambda.BasicLambda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicLambdaTest {

    @Test
    public void testSortByDescending() {
        String[] names = new String[]{"Sultana","Sohaa", "Zoha","Zareeb", "Javed","Ezan"};
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByDescending(names);
        assertEquals(names[0], "Sultana");
        assertEquals(names[5], "Ezan");
    }

    @Test
    public void testSortByAscending() {
        String[] names = new String[]{"Sultana","Sohaa", "Zoha","Zareeb", "Javed","Ezan"};
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByAscending(names);
        assertEquals(names[0], "Zoha");
        assertEquals(names[5], "Sultana");
    }
    @Test
    public void testSortByAlphabeticallyByFirst() {
        String[] names = new String[]{"Sultana","Sohaa", "Zoha","Zareeb", "Javed","Ezan"};
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByAlphabeticallyByFirst(names);
        assertEquals(names[0], "Ezan");
        assertEquals(names[5], "Zareeb");
    }
@Test
    public void testSortByCharacter() {
        String[] names = new String[]{"Sultana","Sohaa", "Zoha","Zareeb", "Javed","Ezan"};
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByAlphabeticallyByFirst(names);
        assertEquals(names[0], "Ezan");
        assertEquals(names[5], "Zareeb");
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
    @Test
    public void testSortByDescendingForNull() {
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByAscending(null);
    }

    @Test
    public void testSortByAlphabeticallyByFirstForEmpty() {
        String[] names = new String[]{};
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByAscending(names);
        assertEquals(names.length, 0);
    }
    @Test
    public void testSortByAlphabeticallyByFirstForNull() {
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByAscending(null);
    }

    @Test
    public void testSortByDescendingForEmpty() {
        String[] names = new String[]{};
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByAscending(names);
        assertEquals(names.length, 0);
    }@Test
    public void testSortByCharacterFirstForNull() {
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByAscending(null);
    }

    @Test
    public void testSortByCharacterForEmpty() {
        String[] names = new String[]{};
        BasicLambda basicLambda = new BasicLambda();
        basicLambda.sortByAscending(names);
        assertEquals(names.length, 0);
    }
}
