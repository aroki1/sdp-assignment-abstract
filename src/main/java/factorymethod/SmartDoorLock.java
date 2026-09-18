package factorymethod;

public final class SmartDoorLock implements Device {
    @Override
    public String activate() {
        return "Smart door lock secures the front door.";
    }
}
