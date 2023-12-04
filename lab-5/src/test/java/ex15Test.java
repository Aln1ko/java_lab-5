import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.function.Supplier;

public class ex15Test {

    @Test
    public void testCalculateLength() {
        ex15 line = new ex15(0, 0, 3, 4);
        double expectedLength = 5.0; // Тріугольник 3-4-5
        double actualLength = line.calculateLength();
        assertEquals(expectedLength, actualLength, 0.0001);
    }

    @Test
    public void testMoveLine() {
        ex15 line = new ex15(0, 0, 3, 4);
        line.moveLine(2, 3);
        double[] expectedStart = {2, 3};
        double[] expectedEnd = {5, 7};
        assertArrayEquals(expectedStart, line.getStartPoint(), 0.0001);
        assertArrayEquals(expectedEnd, line.getEndPoint(), 0.0001);
    }

    @Test
    public void testSetStartPoint() {
        ex15 line = new ex15();
        line.setStartPoint(2, 3);
        double[] expectedStart = {2, 3};
        assertArrayEquals(expectedStart, line.getStartPoint(), 0.0001);
    }

    @Test
    public void testSetEndPoint() {
        ex15 line = new ex15();
        line.setEndPoint(5, 7);
        double[] expectedEnd = {5, 7};
        assertArrayEquals(expectedEnd, line.getEndPoint(), 0.0001);
    }
}
