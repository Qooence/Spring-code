package com.qooems.service;

import com.qooems.model.WorkOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class PayFactory {

    @Autowired
    private List<IPay> pays;

    public IPay getPay(Integer type){
        for (IPay pay : pays) {
            if(pay.support(type)){
                return pay;
            }
        }
        throw new UnsupportedOperationException("Unsupported Pay");
    }
}
