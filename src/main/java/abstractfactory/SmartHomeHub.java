package abstractfactory;

public final class SmartHomeHub {
    private final SmartHomeFactory factory;

    public SmartHomeHub(SmartHomeFactory factory) {
        this.factory = factory;
    }

    public String installKit() {
        Sensor sensor = factory.createSensor();
        Controller controller = factory.createController();
        AppIntegration app = factory.createAppIntegration();

        return String.join(System.lineSeparator(),
                "Installing a compatible smart-home kit:",
                "- " + sensor.monitor(),
                "- " + controller.control(),
                "- " + app.connect());
    }
}
