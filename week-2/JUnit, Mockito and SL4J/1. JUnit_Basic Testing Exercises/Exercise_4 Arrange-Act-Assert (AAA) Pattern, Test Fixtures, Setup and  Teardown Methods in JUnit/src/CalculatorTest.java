import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange: Create Calculator instance before each test
        calculator = new Calculator();
        System.out.println("Setup done.");
    }

    @After
    public void tearDown() {
        // Teardown: Optional cleanup after each test
        calculator = null;
        System.out.println("Teardown done.");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Act
        int result = calculator.subtract(10, 5);

        // Assert
        assertEquals(5, result);
    }
}
