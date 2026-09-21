package abstractfactory;

public final class HomeSphereApp implements AppIntegration {
    @Override
    public String connect() {
        return "HomeSphere app connects the home to the owner's phone.";
    }
}
