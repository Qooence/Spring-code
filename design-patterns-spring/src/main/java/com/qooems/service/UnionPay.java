package com.qooems.service;

import com.qooems.model.PayType;
import com.qooems.model.WorkOrder;
import org.springframework.stereotype.Component;

@Component
public class UnionPay implements IPay{

    @Override
    public boolean support(Integer type) {
        return type == PayType.UNIONPAY.getValue();
    }

    @Override
    public void pay(WorkOrder workOrder) {
        System.out.println("银行卡支付成功");
    }
}
