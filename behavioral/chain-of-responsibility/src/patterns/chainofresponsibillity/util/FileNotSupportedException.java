package patterns.chainofresponsibillity.util;

import java.io.IOException;

public class FileNotSupportedException extends IOException {
    public FileNotSupportedException(String s) {
        super(s);
    }
}

