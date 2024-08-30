package JavaIOStreams.file;

import java.io.*;

//Merge two files in third
public class codingChallenge {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        PrintWriter pw = new PrintWriter("output.txt");
        File file = new File("src/JavaIOStreams/file/fileChallenge");
        String[] s = file.list();
        for (String s1 : s) {
            BufferedReader br = new BufferedReader(new FileReader("src/JavaIOStreams/file/fileChallenge/" + s1));
            String line = br.readLine();
            while (line != null) {
                pw.println(line);
                line = br.readLine();
            }
        }
        pw.flush();

    }
}
