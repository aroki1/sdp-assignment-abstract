package abstractfactory;

public final class HomeSphereSensor implements Sensor {
    @Override
    public String monitor() {
        return "HomeSphere sensor monitors motion and room conditions.";
    }
}
