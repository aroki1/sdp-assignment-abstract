package abstractfactory;

public final class HomeSphereFactory implements SmartHomeFactory {
    @Override
    public Sensor createSensor() {
        return new HomeSphereSensor();
    }

    @Override
    public Controller createController() {
        return new HomeSphereController();
    }

    @Override
    public AppIntegration createAppIntegration() {
        return new HomeSphereApp();
    }
}
