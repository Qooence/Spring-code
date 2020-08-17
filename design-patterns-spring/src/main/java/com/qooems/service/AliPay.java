package com.qooems.service;

import com.qooems.model.PayType;
import com.qooems.model.WorkOrder;
import org.springframework.stereotype.Component;

@Component
public class AliPay implements IPay{

    @Override
    public boolean support(Integer type) {
        return type == PayType.ALIPAY.getValue();
    }

    @Override
    public void pay(WorkOrder workOrder) {
        System.out.println("支付宝支付成功");
    }
}
