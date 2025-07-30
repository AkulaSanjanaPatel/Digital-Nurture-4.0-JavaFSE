package mockitoexercise;
public class MyService {
    private ExternalApi api;
    public MyService(ExternalApi api) { this.api = api; }
    public void sendData(String data) { api.sendData(data); }
}
