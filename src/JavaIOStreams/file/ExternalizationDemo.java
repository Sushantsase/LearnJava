package JavaIOStreams.file;

import java.io.*;

class ABC implements Externalizable {

    String name;
    String color;

    public ABC() {
    }

    public ABC(String name, String color) {
        this.name = name;
        this.color = color;

    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(color);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        color = (String) in.readObject();
    }
}

public class ExternalizationDemo {
    public static void main(String[] args) throws Exception {
        ABC a = new ABC("Alto", "blue");

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        outputStream.writeObject(a);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));

        ABC b = (ABC) objectInputStream.readObject();
        System.out.println(b.color);
        System.out.println(b.name);
    }
}
