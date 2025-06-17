public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void input(String message) {
        System.out.println("Input: " + message);
    }
}
