package ndk.utils_android1;

public abstract class ApplicationSpecification {

    public final String applicationName = configureApplicationName();

    public abstract String configureApplicationName();
}
