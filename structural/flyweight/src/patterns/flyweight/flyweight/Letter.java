package patterns.flyweight.flyweight;

import patterns.flyweight.concreteflyweight.constants.FontSizeType;
import patterns.flyweight.concreteflyweight.constants.FontType;

public abstract class Letter {
    // Extrinsic Attribute
    private final FontType font;
    // Extrinsic Attribute
    private final FontSizeType fontSize;

    public Letter(FontType font, FontSizeType fontSize) {
        this.font = font;
        this.fontSize = fontSize;
    }
    // Intrinsic Behaviour
   public abstract void whatLetterAmI();

    public FontType getFont() {
        return font;
    }

    public FontSizeType getFontSize() {
        return fontSize;
    }

}
