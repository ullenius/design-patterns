package patterns.chainofresponsibillity.concretehandler;

import patterns.chainofresponsibillity.handler.FileChain;
import patterns.chainofresponsibillity.util.FileNotSupportedException;

import java.io.File;

public class NotSupportedProcessing implements FileChain {
    private FileChain nextFileChain;
    @Override
    public void processFile(File file) throws FileNotSupportedException {
            throw new FileNotSupportedException(file.getName() + " is a not-supported file");
    }

    @Override
    public void setNextFileChain(FileChain fileChain) {
        this.nextFileChain = fileChain;
    }
}
