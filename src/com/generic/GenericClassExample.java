package com.generic;

class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent(){
        return content;
    }

    public void printType(){
        if(content == null){
            System.out.println("Null Content");
        } else {
            System.out.println("Type of Content is "+content.getClass().getName());
        }

    }
}

public class GenericClassExample {
    public static void main(String[] args) {
Box<Integer> integerBox = new Box<Integer>();
integerBox.setContent(null);
integerBox.printType();

        Box<String> stringBox = new Box<String>();
        stringBox.setContent("Hello");
        stringBox.printType();

    }
}
