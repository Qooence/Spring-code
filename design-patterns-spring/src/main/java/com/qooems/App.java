package com.qooems;

import com.qooems.config.InitConfig;
import com.qooems.model.PayType;
import com.qooems.model.WorkOrder;
import com.qooems.service.PayService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(InitConfig.class);
        PayService payService = context.getBean(PayService.class);
        WorkOrder workOrder = new WorkOrder();

        workOrder.setId("wo_2020_08_29_15_40_123");
        workOrder.setPrice(256.0);
        workOrder.setUserId("123");
        workOrder.setPayType(PayType.ALIPAY.getValue());
//        workOrder.setPayType(PayType.WECHATPAY.getValue());
//        workOrder.setPayType(PayType.UNIONPAY.getValue());

        payService.pay(workOrder);
    }

}
