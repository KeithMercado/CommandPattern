public class LightsPowerOn implements Command {
    private Light light;

    public LightsPowerOn(Light light){
        
        this.light = light;
    }
    @Override
    public String execute() {
        
        return light.lightsOn();
    }
}