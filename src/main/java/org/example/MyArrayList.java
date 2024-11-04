package org.example;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[5];
        int size = 0;
    }

    public void add (T some) {
        if (size == data.length){
            data = Arrays.copyOf(data, data.length  * 2);
        }
        data[size++] = size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size){
            System.out.println("invalid index");
        }
        for(int i  = 0; i < size-1; i++){
            data[i] = data[i + 1];
        }
        data[size--] = 0;
    }

    public T get(int index) {
        if(index < 0 || index >= size) {
            System.out.println("not valid index");
        }
        return (T) data[index];
    }

    public void clear() {
        for (int i = 0; i < size; i ++) {
            data[i] = 0;
        }
        size = 0;
    }

    public int size(){
        return size;
    }
}