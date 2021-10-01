package patterns.chainofresponsibillity.util;

import java.io.File;

public interface FileUtil {
     static String getFileExtension(File file) {
        int index = file.getName().lastIndexOf('.');
        return file.getName().substring(index+1);
    }

}
