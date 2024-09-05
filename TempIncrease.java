public class TempIncrease implements Command {

    private Thermostat thermostat;

    public TempIncrease(Thermostat thermostat){
        
        this.thermostat = thermostat;
    }
    @Override
    public String execute() {
        
        return thermostat.increaseTemp();
    }
}