package com.generic;

class MyBox<T, U> {
    private T first;
    private U second;

    public MyBox(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public void printType() {
        System.out.println(first.getClass().getName());
        System.out.println(second.getClass().getName());
    }
}

public class GenericClassMultipleParam {
    public static void main(String[] args) {
        MyBox<Integer,String> ins = new MyBox<>(100,"he4llo");
        ins.printType();

        MyBox<Double,String> inss = new MyBox<>(100.22,"he4llo");
        inss.printType();

        System.out.println(inss.getSecond());
        inss.setSecond("sdfdfsdf");
        inss.setFirst(21.22);
        System.out.println(inss.getSecond());
        System.out.println(inss.getFirst());
    }
}
