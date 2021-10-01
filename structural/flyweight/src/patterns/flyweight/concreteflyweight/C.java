package patterns.flyweight.concreteflyweight;

import patterns.flyweight.concreteflyweight.constants.FontSizeType;
import patterns.flyweight.concreteflyweight.constants.FontType;
import patterns.flyweight.flyweight.Letter;

public class C extends Letter {

    public C(FontType font, FontSizeType fontSize) {
        super(font, fontSize);
    }

    @Override
    public void whatLetterAmI() {
        System.out.println(getClass().getSimpleName());
    }
}
