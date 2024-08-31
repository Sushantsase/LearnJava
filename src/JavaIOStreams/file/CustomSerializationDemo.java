package JavaIOStreams.file;

import java.io.*;

class Car3 implements Serializable {
    String name;
    transient String color;

    public Car3(String name, String color) {
        this.color = color;
        this.name = name;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        String colorTemp = "aa" + color;
        objectOutputStream.writeObject(colorTemp);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String colorTempo = (String) objectInputStream.readObject();
        color = colorTempo.substring(2);
    }

}

public class CustomSerializationDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Car3 car = new Car3("Audi", "black");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        objectOutputStream.writeObject(car);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
        Car3 car4 = (Car3) objectInputStream.readObject();
        System.out.println(car4.name);
        System.out.println(car4.color);
    }
}
