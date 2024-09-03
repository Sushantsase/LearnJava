package com.generic.genericinterfacedemo;

public interface Repository<T> {
    void add(T item);
    T get(int id);
    void remove(T item);
}
