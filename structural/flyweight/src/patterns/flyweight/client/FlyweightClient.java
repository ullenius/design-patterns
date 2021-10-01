package patterns.flyweight.client;

import patterns.flyweight.concreteflyweight.constants.FontSizeType;
import patterns.flyweight.concreteflyweight.constants.FontType;
import patterns.flyweight.concreteflyweight.constants.LetterType;
import patterns.flyweight.flyweightfactory.FlyweightFactory;

public class FlyweightClient {

    public static void main(String[] args) {
        FlyweightFactory.factoryMethod(LetterType.A, FontType.ROBOTO, FontSizeType.TWENTY);
        FlyweightFactory.factoryMethod(LetterType.A, FontType.ROBOTO, FontSizeType.TWENTY);
        FlyweightFactory.factoryMethod(LetterType.A, FontType.ROBOTO, FontSizeType.TWENTY);
        System.out.println();
        FlyweightFactory.factoryMethod(LetterType.B, FontType.ARIAL, FontSizeType.TEN);
        FlyweightFactory.factoryMethod(LetterType.B, FontType.ROBOTO, FontSizeType.TEN);
        FlyweightFactory.factoryMethod(LetterType.B, FontType.ROBOTO, FontSizeType.TWENTY);
        System.out.println();
        FlyweightFactory.factoryMethod(LetterType.B, FontType.ARIAL, FontSizeType.TEN);
        FlyweightFactory.factoryMethod(LetterType.B, FontType.ROBOTO, FontSizeType.TEN);
        FlyweightFactory.factoryMethod(LetterType.B, FontType.ROBOTO, FontSizeType.TWENTY);
    }
}
