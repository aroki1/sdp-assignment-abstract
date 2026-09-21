package abstractfactory;

public final class BrightNestApp implements AppIntegration {
    @Override
    public String connect() {
        return "BrightNest app shows energy reports and remote controls.";
    }
}
