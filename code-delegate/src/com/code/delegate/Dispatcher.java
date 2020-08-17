package com.code.delegate;

import java.util.Random;

public class Dispatcher implements IExecutor{

    @Override
    public void doing() {
        IExecutor executor;
        System.out.println("开始委派策略....");
        if(new Random().nextBoolean()){
            executor = new ExecutorA();
        }else{
            executor = new ExecutorB();
        }
        executor.doing();
    }
}
