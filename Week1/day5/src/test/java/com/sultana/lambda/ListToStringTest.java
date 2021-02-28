package test.java.com.sultana.lambda;

import main.java.com.sultana.lambda.ListToString;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ListToStringTest {

    @Test
    public void testListToString(){
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(33);

        ListToString listToString = new ListToString();

        String commaSeparatedString = listToString.listToCommaSeparatedString(intList);
        assertEquals(commaSeparatedString, "e10,o33");

    }
}
