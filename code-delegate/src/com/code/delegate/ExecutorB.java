package com.code.delegate;

public class ExecutorB implements IExecutor {
    @Override
    public void doing() {
        System.out.println("执行者B执行任务");
    }
}
