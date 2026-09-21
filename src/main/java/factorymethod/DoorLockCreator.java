package factorymethod;

public final class DoorLockCreator extends DeviceCreator {
    @Override
    protected Device createDevice() {
        return new SmartDoorLock();
    }
}
