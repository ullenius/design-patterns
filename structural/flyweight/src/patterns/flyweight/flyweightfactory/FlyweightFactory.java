package patterns.flyweight.flyweightfactory;

import patterns.flyweight.concreteflyweight.A;
import patterns.flyweight.concreteflyweight.B;
import patterns.flyweight.concreteflyweight.C;
import patterns.flyweight.concreteflyweight.constants.FontSizeType;
import patterns.flyweight.concreteflyweight.constants.FontType;
import patterns.flyweight.concreteflyweight.constants.LetterType;
import patterns.flyweight.flyweight.Letter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlyweightFactory {
    private static Map<LetterRequest, Letter> lettersCache = new HashMap<>();

    public static Letter factoryMethod(LetterType request, FontType font, FontSizeType fontSize) {
        LetterRequest newRequest = new LetterRequest(request, font, fontSize);
        Letter letter;
        if (lettersCache.containsKey(newRequest)) {
            System.out.println("Getting Letter from cache...");
            return lettersCache.get(newRequest);
        }
        System.out.println("Creating a new Letter...");
        switch (request) {
            case A:
                letter = new A(font, fontSize);
                lettersCache.put(newRequest, letter);
                break;
            case B:
                letter = new B(font, fontSize);
                lettersCache.put(newRequest, letter);
                break;
            case C:
                letter = new C(font, fontSize);
                lettersCache.put(newRequest, letter);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + request);
        }
        return letter;
    }
    // Helper class
    private static class LetterRequest {
        private LetterType request;
        private FontType font;
        private FontSizeType fontSize;

        public LetterRequest(LetterType request, FontType font, FontSizeType fontSize) {
            this.request = request;
            this.font = font;
            this.fontSize = fontSize;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof LetterRequest)) return false;
            LetterRequest that = (LetterRequest) o;
            return fontSize == that.fontSize &&
                    request == that.request &&
                    font == that.font;
        }

        @Override
        public int hashCode() {
            return Objects.hash(request, font, fontSize);
        }

        @Override
        public String toString() {
            return request + " " + font + " " + fontSize;
        }
    }
}