package patterns.chainofresponsibillity.chainhelper;

import patterns.chainofresponsibillity.handler.FileChain;
import patterns.chainofresponsibillity.util.FileNotSupportedException;

import java.io.File;

public class FileProcessor {
    private FileChain firstFileChain;

    public FileProcessor(FileChain firstFileChain) {
        this.firstFileChain = firstFileChain;
    }

    public void processFile(File file) throws FileNotSupportedException {
        if (firstFileChain != null) {
            if (file != null) {
                firstFileChain.processFile(file);
            }
        }
    }

    public void createChain(FileChain...fileChains) {
        firstFileChain.setNextFileChain(fileChains[0]);
        for (int i = 0; i < fileChains.length; i++) {
            int plusIndex = i + 1;
            if (plusIndex == fileChains.length) {
                break;
            }
            fileChains[i].setNextFileChain(fileChains[plusIndex]);
        }
    }
}
