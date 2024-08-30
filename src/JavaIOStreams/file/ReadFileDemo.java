package JavaIOStreams.file;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("abc.txt");
//        int i = fr.read();
//        while (i != -1){
//            System.out.println((char)i);
//            i = fr.read();
//        }

//        char[] c = new char[100];
//        fr.read(c);
//        System.out.println(c);

        char[] c = new char[100];
        fr.read(c,0,10);
       // System.out.println(c);

        for(char i:c){
            System.out.println("char ->"+i);
        }
        fr.close();
    }
}
