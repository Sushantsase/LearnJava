package JavaIOStreams.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {

            FileWriter fw = new FileWriter("abc.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            // Use BufferedWriter to write data
//            bw.write("Hello, world!");
//            bw.newLine();  // Adds a new line
//            bw.write("This is a test.");

            // Close BufferedWriter to flush and release resources
            bw.close();

    }
}
