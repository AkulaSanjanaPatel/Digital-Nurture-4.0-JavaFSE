package mockitoexercise;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;

public class MyServiceVoidTest {

    @Test
public void testVoidMethod() {
    ExternalApi mockApi = Mockito.mock(ExternalApi.class);
    doNothing().when(mockApi).sendData(anyString());

    MyService service = new MyService(mockApi);
    service.sendData("Sample Data");

    verify(mockApi).sendData("Sample Data");
    System.out.println("Exercise 4: testVoidMethod PASSED successfully!");
}
}
