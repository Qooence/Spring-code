package com.dode.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HouseAgencyCglib implements MethodInterceptor {
    public Object getInstance(Class clazz)throws Exception{
        Enhancer enhancer = new Enhancer();
        //把父类设置为谁？
        //这一步就是告诉cglib，生成的子类需要继承哪个类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);
        //第一步、生成源代码
        //第二步、编译成class文件
        //第三步、加载到JVM中，并返回被代理对象
        return enhancer.create();
    }
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("你的要求是");
        //这个obj的引用是由CGLib给我们new出来的
        //cglib new出来以后的对象，是被代理对象的子类（继承了我们自己写的那个类）
        //OOP, 在new子类之前，实际上默认先调用了我们super()方法的，
        //new了子类的同时，必须先new出来父类，这就相当于是间接的持有了我们父类的引用
        //子类重写了父类的所有的方法
        //我们改变子类对象的某些属性，是可以间接的操作父类的属性的
        proxy.invokeSuper(obj, args);
        System.out.println("================");
        System.out.println("开始给你寻找...");
        System.out.println("寻找到符合要求的房子有X处，供你挑选，若有合适的，请您与我联系");
        return null;
    }
}
