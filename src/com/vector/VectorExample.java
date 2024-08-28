package com.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        List<Animal> zoo = new Vector<Animal>();

        Animal a1 = new Animal("Lion", 'c');
        zoo.add(a1);

        Animal a12 = new Animal("Horse", 'h');
        zoo.add(a12);

        Animal a13 = new Animal("OX", 'h');
        zoo.add(a13);

        Animal a14 = new Animal("Cow", 'h');
        zoo.add(a14);

        Animal a5 = new Animal("Tiger", 'c');
        zoo.add(a5);

        List<Animal> carnivours = new Vector<Animal>();
        List<Animal> harbivours = new Vector<Animal>();

        for (Animal a : zoo) {
            boolean b = filerAnimal(a);
            if (b) {
                carnivours.add(a);
            } else harbivours.add(a);

        }

        for (Animal a : carnivours) {
            System.out.println(a.getName());
        }

        for (Animal q : harbivours) {
            System.out.println(q.getName() );
        }
    }

    private static boolean filerAnimal(Animal a) {

        if (a.getType() == 'c') {
            return true;

        } else {
            return false;
        }
    }
}
