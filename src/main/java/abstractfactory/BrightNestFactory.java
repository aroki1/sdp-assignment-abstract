package abstractfactory;

public final class BrightNestFactory implements SmartHomeFactory {
    @Override
    public Sensor createSensor() {
        return new BrightNestSensor();
    }

    @Override
    public Controller createController() {
        return new BrightNestController();
    }

    @Override
    public AppIntegration createAppIntegration() {
        return new BrightNestApp();
    }
}
