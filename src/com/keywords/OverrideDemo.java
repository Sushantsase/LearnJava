package com.keywords;

public class OverrideDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Bark
    }
}
    class Animal {
        // Method in the superclass
        public void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

    class Dog extends Animal {
        // Overriding the makeSound method in the subclass
        @Override
//        public void makeound() {
//            System.out.println("Bark");
//        }

        public void makeSound() {
            System.out.println("Bark");
       }


    }


