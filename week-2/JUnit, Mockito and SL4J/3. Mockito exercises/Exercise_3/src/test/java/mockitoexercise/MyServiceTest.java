package mockitoexercise;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;

public class MyServiceTest {
    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.sendData("Hello Mockito");

        verify(mockApi).sendData(eq("Hello Mockito"));
        verify(mockApi, never()).sendData(eq("Wrong Data"));
    }
}
