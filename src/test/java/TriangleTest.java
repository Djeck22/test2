import static example.TriangleType.EQUILATERAL;
import static example.TriangleType.INVALID;
import static example.TriangleType.ISOSCELES;
import static example.TriangleType.SCALENE;
import static org.junit.Assert.assertEquals;

import example.Triangle;
import example.TriangleType;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void test1() {
        final TriangleType type = Triangle.classify(5, 6, 7);
        assertEquals(SCALENE, type);
    }

    @Test
    public void testInvalid1() {
        final TriangleType type = Triangle.classify(5, 12, 14);
        assertEquals(INVALID, type);
    }


    @Test
    public void testEquiliteral() {
        final TriangleType type = Triangle.classify(1, 1, 1);
        assertEquals(EQUILATERAL, type);
    }

    @Test
    public void testIsoceles1() {
        final TriangleType type = Triangle.classify(5, 8, 9);
        assertEquals(ISOSCELES, type);
    }

}
