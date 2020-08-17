package com.qooems.service;

import com.qooems.model.PayType;
import com.qooems.model.WorkOrder;
import org.springframework.stereotype.Component;

@Component
public class WeChatPay implements IPay{

    @Override
    public boolean support(Integer type) {
        return type == PayType.WECHATPAY.getValue();
    }

    @Override
    public void pay(WorkOrder workOrder) {
        System.out.println("微信支付成功");
    }
}
