package command;

// Concrete Command
public class LightOffCommand implements Command{

    // Reference to Light
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }
}
