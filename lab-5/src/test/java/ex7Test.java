import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ex7Test {

    @Test
    void testIncreaseHour() {
        ex7 time = new ex7();
        time.setTime(12, 0, 0);
        time.increaseHour();
        assertEquals(13, time.getHour());
    }

    @Test
    void testDecreaseHour() {
        ex7 time = new ex7();
        time.setTime(8, 0, 0);
        time.decreaseHour();
        assertEquals(7, time.getHour());
    }

    @Test
    void testIncreaseMinute() {
        ex7 time = new ex7();
        time.setTime(5, 45, 0);
        time.increaseMinute();
        assertEquals(5, time.getHour());
        assertEquals(46, time.getMinute());
    }

    @Test
    void testDecreaseMinute() {
        ex7 time = new ex7();
        time.setTime(9, 15, 0);
        time.decreaseMinute();
        assertEquals(9, time.getHour());
        assertEquals(14, time.getMinute());
    }

    @Test
    void testIncreaseSecond() {
        ex7 time = new ex7();
        time.setTime(14, 20, 30);
        time.increaseSecond();
        assertEquals(14, time.getHour());
        assertEquals(20, time.getMinute());
        assertEquals(31, time.getSecond());
    }

    @Test
    void testDecreaseSecond() {
        ex7 time = new ex7();
        time.setTime(18, 40, 10);
        time.decreaseSecond();
        assertEquals(18, time.getHour());
        assertEquals(40, time.getMinute());
        assertEquals(9, time.getSecond());
    }


}
