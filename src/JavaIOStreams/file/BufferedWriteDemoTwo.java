package JavaIOStreams.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteDemoTwo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("hello");
        bw.newLine();
        bw.write("hello");
        bw.newLine();

        char[] arr = new char[]{'a','b','c'};
        bw.write(arr);

        bw.write('l');

        bw.close();

    }
}
