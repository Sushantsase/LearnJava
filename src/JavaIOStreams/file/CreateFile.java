package JavaIOStreams.file;

import  java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File newFile = new File("abc.txt");  // File Object Creation
        System.out.println(newFile.exists());  //Checking existing file is there or not -> false

        String currentDirectory= System.getProperty("user.dir");
        System.out.println(currentDirectory);

        File newFilesrc = new File("src");  // File Object Creation
        System.out.println(newFilesrc.exists());  //Checking existing file is there or not -> true
    }
}
