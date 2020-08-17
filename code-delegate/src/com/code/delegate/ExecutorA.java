package com.code.delegate;

public class ExecutorA implements IExecutor{

    @Override
    public void doing() {
        System.out.println("执行者A执行任务");
    }
}
