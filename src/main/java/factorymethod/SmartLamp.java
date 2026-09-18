package factorymethod;

public final class SmartLamp implements Device {
    @Override
    public String activate() {
        return "Smart lamp turns on with a warm light.";
    }
}
