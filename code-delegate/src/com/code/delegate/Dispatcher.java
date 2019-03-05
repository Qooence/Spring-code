package com.code.delegate;

public class Dispatcher implements IExector{
    private IExector exector;

    @Override
    public void doing() {
        this.exector.doing();
    }

    public Dispatcher(IExector exector){
        this.exector = exector;
    }
}
