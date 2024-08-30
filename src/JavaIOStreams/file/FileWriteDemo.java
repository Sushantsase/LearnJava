package JavaIOStreams.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("abc.txt");
        FileWriter fw = new FileWriter("abc.txt", true);  //data append

        fw.write("ABC");
        fw.write("\n");
        char[] ch = new char[]{'a', 'b', 'c', 'x', 'y', 'z'};
        fw.write(ch);
        fw.write("\n");
        fw.write('z');
        fw.write("\n");
        fw.flush();
        fw.close();
    }
}
