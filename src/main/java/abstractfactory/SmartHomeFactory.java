package abstractfactory;

public interface SmartHomeFactory {
    Sensor createSensor();

    Controller createController();

    AppIntegration createAppIntegration();
}
