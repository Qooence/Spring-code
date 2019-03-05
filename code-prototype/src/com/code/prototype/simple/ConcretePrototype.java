package com.code.prototype.simple;

import java.util.ArrayList;

public class ConcretePrototype implements Cloneable {

    private int age;

    private String name;

    public ArrayList<String>  list = new ArrayList<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 基于字节码的
        ConcretePrototype prototype = null;
        try {
            prototype = (ConcretePrototype)super.clone();
            prototype.list = (ArrayList<String>) list.clone();
        }catch (Exception e){

        }

        return prototype;
        //return super.clone();
    }
}
