package patterns.programtointerface;

public class ProgramToInterfaceClient {
    public static void main(String[] args) {
        LetterInterface letterInterfaceA = new A();
        LetterInterface letterInterfaceB = new B();
        getLetter(letterInterfaceA);
        getLetter(letterInterfaceB);
    }

    static void getLetter(LetterInterface letterInterface) {
        letterInterface.whatLetterAmI();
        letterInterface.defaultMethod();
        LetterInterface.staticMethod(); // Needs to be class-level invocation
    }
}

class A implements LetterInterface {
    @Override
    public void whatLetterAmI() {
        System.out.println(getClass().getSimpleName());
    }
}

class B implements LetterInterface {
    @Override
    public void whatLetterAmI() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public void defaultMethod() {
        System.out.println("Iam Overriden!");
    }
}

interface LetterInterface {
    void whatLetterAmI();

    default void defaultMethod() {
        System.out.println("Im a default method with a body! I can be Overriden!");
    }

    static void staticMethod() {
        System.out.println("Im a static method and I cant be Overriden!");
    }
}
