public class LightsPowerOff implements Command {
    private Light light;

    public LightsPowerOff(Light light){
        
        this.light = light;
    }
    @Override
    public String execute() {
        
        return light.lightsOff();
    }
}