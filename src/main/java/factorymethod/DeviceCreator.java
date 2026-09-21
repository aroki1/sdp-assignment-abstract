package factorymethod;

public abstract class DeviceCreator {
    protected abstract Device createDevice();

    public String configureAndActivate() {
        Device device = createDevice();
        return "Device configured: " + device.activate();
    }
}
