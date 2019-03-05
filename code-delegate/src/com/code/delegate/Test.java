package com.code.delegate;

public class Test {
    public static void main(String[] args) {
        new Dispatcher(new ExectorA()).doing();
        new Dispatcher(new ExectorB()).doing();
    }
}
