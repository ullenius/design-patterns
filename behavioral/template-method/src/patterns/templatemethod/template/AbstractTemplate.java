package patterns.templatemethod.template;

public abstract class AbstractTemplate {

    private int anInt;
    private boolean aBoolean;

    public AbstractTemplate(int anInt, boolean aBoolean) {
        this.anInt = anInt;
        this.aBoolean = aBoolean;
    }

    abstract protected void primitiveOperation1();
    abstract protected void primitiveOperation2();

    // Can be added for an Operation that can be Overridden.
    public void hookMethod() {
        System.out.println("Default behaviour");
    }

    final public void templateMethod() {
        primitiveOperation1();
        if (aBoolean && anInt > 5) {
            primitiveOperation2();
        }
        hookMethod();
        System.out.println("Jobs done!");
        // return aObject; or invoke another method
    }
}
