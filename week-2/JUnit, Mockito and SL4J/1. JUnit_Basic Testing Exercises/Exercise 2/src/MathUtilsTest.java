import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    @Test
    public void testMultiply() {
        MathUtils mu = new MathUtils();
        assertEquals(20, mu.multiply(4, 5));
    }

    @Test
    public void testIsEven() {
        MathUtils mu = new MathUtils();
        assertTrue(mu.isEven(8));
        assertFalse(mu.isEven(7));
    }

    @Test
    public void testMax() {
        MathUtils mu = new MathUtils();
        assertEquals(10, mu.max(10, 5));
        assertEquals(20, mu.max(10, 20));
    }
}
