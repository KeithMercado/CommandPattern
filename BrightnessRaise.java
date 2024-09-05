public class BrightnessRaise implements Command {
    private Light light;

    public BrightnessRaise(Light light){
        
        this.light = light;
    }
    @Override
    public String execute() {
        
        return light.increaseBrightness();
    }
}