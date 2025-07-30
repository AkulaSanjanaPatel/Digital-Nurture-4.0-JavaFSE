package mockitoexercise;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceVoidExceptionTest {

    @Test
    public void testVoidMethodWithException() {
        // 1. Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2. Stub the void method to throw an exception
        doThrow(new RuntimeException("Send failed"))
            .when(mockApi).sendData("Error");

        // 3. Verify the interaction
        MyService service = new MyService(mockApi);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            service.sendData("Error");
        });

        assertEquals("Send failed", exception.getMessage());
        verify(mockApi).sendData("Error");
        System.out.println("Exercise 7: testVoidMethodWithException PASSED successfully!");
    }
}
