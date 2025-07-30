package mockitoexercise;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class MyServiceInteractionOrderTest {

    @Test
    public void testInteractionOrder() {
        // 1. Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2. Call the methods in a specific order
        mockApi.sendData("First");
        mockApi.getData();
        mockApi.sendData("Second");

        // 3. Verify the interaction order
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).sendData("First");
        inOrder.verify(mockApi).getData();
        inOrder.verify(mockApi).sendData("Second");

        // Optional: visible console output
        System.out.println("Exercise 6: testInteractionOrder PASSED successfully!");
    }
}
