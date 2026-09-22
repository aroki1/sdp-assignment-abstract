package abstractfactory;

public final class BrightNestSensor implements Sensor {
    @Override
    public String monitor() {
        return "BrightNest sensor monitors air quality and energy usage.";
    }
}
