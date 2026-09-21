package factorymethod;

public final class LampCreator extends DeviceCreator {
    @Override
    protected Device createDevice() {
        return new SmartLamp();
    }
}
