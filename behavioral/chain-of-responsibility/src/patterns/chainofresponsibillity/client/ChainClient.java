package patterns.chainofresponsibillity.client;

import patterns.chainofresponsibillity.chainhelper.FileProcessor;
import patterns.chainofresponsibillity.concretehandler.NotSupportedProcessing;
import patterns.chainofresponsibillity.concretehandler.PdfProcessing;
import patterns.chainofresponsibillity.concretehandler.TxtProcessing;
import patterns.chainofresponsibillity.handler.FileChain;
import patterns.chainofresponsibillity.model.Message;
import patterns.chainofresponsibillity.util.FileNotSupportedException;

import java.io.File;

public class ChainClient {

    public static void main(String[] args) {
        FileChain firstChain = new PdfProcessing();
        FileChain secondChain = new TxtProcessing();
        FileChain thirdChain = new NotSupportedProcessing();

        FileProcessor fileProcessor = new FileProcessor(firstChain);
        fileProcessor.createChain(secondChain, thirdChain);

        Message msg1 = new Message("Hejsan!", null);
        Message msg2 = new Message("Hey! Whats up look at this Cool picture", new File("vacation.pdf"));
        Message msg3 = new Message("Wow soo good article!", new File("article.txt"));
        Message msg4 = new Message("Just made this cool program", new File("myprogram.jar"));

        try {
            fileProcessor.processFile(msg1.getFile());
            fileProcessor.processFile(msg2.getFile());
            fileProcessor.processFile(msg3.getFile());
            fileProcessor.processFile(msg4.getFile());
        } catch (FileNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
