package mockitoexercise;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceMultipleReturnsTest {

    @Test
    public void testMultipleReturns() {
        // 1. Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2. Stub method to return different values on consecutive calls
        when(mockApi.getData())
            .thenReturn("First Call")
            .thenReturn("Second Call")
            .thenReturn("Third Call");

        // 3. Test the service using the mock
        MyService service = new MyService(mockApi);

        assertEquals("First Call", service.fetchData());
        assertEquals("Second Call", service.fetchData());
        assertEquals("Third Call", service.fetchData());

        // Optional: Print for visible console output
        System.out.println("Exercise 5: testMultipleReturns PASSED successfully!");
    }
}
