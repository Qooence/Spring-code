package com.code.prototype.simple;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ConcretePrototype cp = new ConcretePrototype();
        cp.setAge(18);
        cp.setName("Qooence");

        cp.list.add("Qooence");

        try {
            ConcretePrototype copy = (ConcretePrototype) cp.clone();

            // 克隆list 只是克隆了地址的引用,并未产生新的list
            System.out.println(cp.list == copy.list);
            System.out.println(copy.getAge() + "," + copy.getName() + "," + copy.list.size());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // 就是一个现成的对象，这个对象里面有已经设置好的值
        // 当我要新建一个对象，并且要给新建的对象赋值，而且赋值内容要跟之前的一模一样


        // 能够直接拷贝其实际内容的数据类型，只支持9种，八大基本数据类型+String，浅拷贝

        // 深拷贝  所有的都能拷贝


        //拷贝 就是字节码复制
    }
}
