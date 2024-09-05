public class TempDecrease implements Command{

    private Thermostat thermostat;

    public TempDecrease(Thermostat thermostat){
        
        this.thermostat = thermostat;
    }
    @Override
    public String execute() {
        
        return thermostat.decreaseTemp();
    }
}