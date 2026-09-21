package factorymethod;

public final class ThermostatCreator extends DeviceCreator {
    @Override
    protected Device createDevice() {
        return new SmartThermostat();
    }
}
