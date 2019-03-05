package com.dode.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 租房中介
 */
public class HouseAgencyJDK implements InvocationHandler{

    private Person target;//被代理对象的引用作为一个成员变量保存下来了

    public Object getInstance(Person target)throws Exception{
        this.target = target;
        Class clazz = target.getClass();
        System.out.println("被代理对象的class是:"+clazz);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces() , this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("你的要求是");
        method.invoke(this.target,args);
        System.out.println("================");
        System.out.println("开始给你寻找...");
        System.out.println("寻找到符合要求的房子有X处，供你挑选，若有合适的，请您与我联系");
        return null;
    }
}
