package app;

import abstractfactory.BrightNestFactory;
import abstractfactory.HomeSphereFactory;
import abstractfactory.SmartHomeFactory;
import abstractfactory.SmartHomeHub;
import factorymethod.DeviceCreator;
import factorymethod.DoorLockCreator;
import factorymethod.LampCreator;
import factorymethod.ThermostatCreator;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        demonstrateFactoryMethod();
        System.out.println();
        demonstrateAbstractFactory();
    }

    private static void demonstrateFactoryMethod() {
        System.out.println("PART A - FACTORY METHOD");
        DeviceCreator[] creators = {
                new LampCreator(),
                new ThermostatCreator(),
                new DoorLockCreator()
        };

        for (DeviceCreator creator : creators) {
            System.out.println(creator.configureAndActivate());
        }
    }

    private static void demonstrateAbstractFactory() {
        System.out.println("PART B - ABSTRACT FACTORY");

        SmartHomeFactory selectedFactory = selectFactory("homesphere");
        SmartHomeHub hub = new SmartHomeHub(selectedFactory);

        System.out.println(hub.installKit());
    }

    private static SmartHomeFactory selectFactory(String vendor) {
        return switch (vendor.toLowerCase()) {
            case "homesphere" -> new HomeSphereFactory();
            case "brightnest" -> new BrightNestFactory();
            default -> throw new IllegalArgumentException("Unknown smart-home vendor: " + vendor);
        };
    }
}
