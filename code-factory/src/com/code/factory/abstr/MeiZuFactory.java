package com.code.factory.abstr;

import com.code.factory.MeiZu;
import com.code.factory.Phone;

public class MeiZuFactory implements AbstractFactory {
    @Override
    public Phone getPhone() {
        return new MeiZu();
    }
}
