package com.qooems.service;

import com.qooems.model.WorkOrder;

public interface IPay {

    boolean support(Integer type);

    void pay(WorkOrder workOrder);
}
