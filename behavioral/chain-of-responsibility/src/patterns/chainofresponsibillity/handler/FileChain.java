package patterns.chainofresponsibillity.handler;

import patterns.chainofresponsibillity.util.FileNotSupportedException;

import java.io.File;

public interface FileChain {
    void processFile(File file) throws FileNotSupportedException;

    void setNextFileChain(FileChain fileChain);
}
