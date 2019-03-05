package com.code.factory.abstr;

public class Test {
    public static void main(String[] args) {
        DefaultFactory defaultFactory = new DefaultFactory();
        System.out.println(defaultFactory.getPhone().getName());
        System.out.println(defaultFactory.getPhone("Iphone").getName());
    }
}
