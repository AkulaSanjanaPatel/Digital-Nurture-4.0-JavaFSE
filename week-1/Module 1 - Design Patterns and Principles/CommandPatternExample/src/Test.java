public class Test {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOnCommand);
        remote.pressButton();  // Output: Light is ON.

        remote.setCommand(lightOffCommand);
        remote.pressButton();  // Output: Light is OFF.
    }
}
