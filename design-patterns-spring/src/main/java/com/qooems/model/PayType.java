package com.qooems.model;

public enum PayType {
    ALIPAY(1),
    WECHATPAY(2),
    UNIONPAY(3);

    private final int value;

    PayType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
