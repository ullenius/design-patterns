package patterns.chainofresponsibillity.concretehandler;

import patterns.chainofresponsibillity.handler.FileChain;
import patterns.chainofresponsibillity.util.FileNotSupportedException;
import patterns.chainofresponsibillity.util.FileUtil;

import java.io.File;

public class TxtProcessing implements FileChain {
    private FileChain nextFileChain;
    @Override
    public void processFile(File file) throws FileNotSupportedException {
        if (FileUtil.getFileExtension(file).equals("txt")) {
            System.out.println("Processing " + file.getName() + " in the " + getClass().getSimpleName());
        } else {
            if (nextFileChain != null) {
                System.out.println("Wont process " + file.getName() + " in the " + getClass().getSimpleName());
                nextFileChain.processFile(file);
            }
        }
    }

    @Override
    public void setNextFileChain(FileChain fileChain) {
        this.nextFileChain = fileChain;
    }
}
