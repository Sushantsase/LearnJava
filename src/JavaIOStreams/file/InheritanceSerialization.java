package JavaIOStreams.file;

import java.io.*;

class CarInheritance implements Serializable {
    String name;
     String color;

    public CarInheritance(String name, String color) {
        this.color = color;
        this.name = name;
    }
}

class Ferrari extends CarInheritance {
    int wheels;

    public Ferrari(String name, String color, int wheels) {
        super(name, color);
        this.wheels = wheels;
    }
}

public class InheritanceSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Ferrari fw = new Ferrari("Ferrari","Black",5);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        objectOutputStream.writeObject(fw);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
        Ferrari fw1 = (Ferrari) objectInputStream.readObject();
        System.out.println(fw1.color);
        System.out.println(fw1.name);
        System.out.println(fw1.wheels);

    }
}
