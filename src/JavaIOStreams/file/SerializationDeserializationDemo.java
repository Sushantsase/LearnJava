package JavaIOStreams.file;

import java.io.*;

class Car implements Serializable {
    String name;
    String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
}


public class SerializationDeserializationDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        Car car = new Car("ferrari", "Red");

        //Serialization
//
//
//        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("abc.txt"));
        objectOutputStream.writeObject(car);

        //Desrialization

        FileInputStream fileInputStream = new FileInputStream("abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Car car1 = (Car)objectInputStream.readObject();
        System.out.println(car1.color);
        System.out.println(car1.name);
    }
}
