public class BrightnessLower implements Command {

    private Light light;

    public BrightnessLower(Light light){

        this.light = light;
    }
    @Override
    public String execute() {

        return light.decreaseBrightness();
    }
}