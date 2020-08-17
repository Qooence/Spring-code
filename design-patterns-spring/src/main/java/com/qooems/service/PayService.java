package com.qooems.service;

import com.qooems.model.WorkOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {

    @Autowired
    private PayFactory factory;

    public void pay(WorkOrder workOrder){
        factory.getPay(workOrder.getPayType()).pay(workOrder);
    }
}
