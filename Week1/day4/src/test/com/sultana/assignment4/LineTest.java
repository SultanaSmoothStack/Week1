package test.com.sultana.assignment4;

import main.com.sultana.assignment4.Line;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class LineTest {
    @Test
    void testGetDistance() {
        Line line = new Line(1.0, 1.0, 1.0, 10);
        double distance = line.getDistance();
        assertEquals(distance, 9.0);
    }
}
