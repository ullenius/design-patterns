package patterns.interpreter.context;

public enum LanguageType {
    SWEDISH("Hej"),FRENCH("Bonjour"),GERMAN("Hallo");

    private String value;

    LanguageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
