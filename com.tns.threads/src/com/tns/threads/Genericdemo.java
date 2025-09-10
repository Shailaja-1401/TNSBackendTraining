package com.tns.threads;

// Generic class
class GenericDemoClass<T> {
    private T message;

    public void setMessage(T message) {
        this.message = message;
    }

    public T getMessage() {
        return message;
    }
}

public class Genericdemo {
    public static void main(String[] args) {
        // Using Integer type
        GenericDemoClass<Integer> obj1 = new GenericDemoClass<>();
        obj1.setMessage(100);
        System.out.println("Integer Message: " + obj1.getMessage());

        // Using String type
        GenericDemoClass<String> obj2 = new GenericDemoClass<>();
        obj2.setMessage("Hello Generics!");
        System.out.println("String Message: " + obj2.getMessage());
    }
}
