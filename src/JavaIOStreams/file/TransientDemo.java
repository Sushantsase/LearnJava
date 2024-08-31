package JavaIOStreams.file;


import java.io.*;

class Car1 implements Serializable {
    String name;
    transient String color;

    public Car1(String name, String color) {
        this.color = color;
        this.name = name;

    }

}

public class TransientDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        Car1 car = new Car1("Audi","black");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        objectOutputStream.writeObject(car);

    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
    Car1 car1 = (Car1)objectInputStream.readObject();
        System.out.println(car1.name);
        System.out.println(car1.color);
    }
}
