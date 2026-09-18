package factorymethod;

public final class SmartThermostat implements Device {
    @Override
    public String activate() {
        return "Smart thermostat starts regulating the room temperature.";
    }
}
