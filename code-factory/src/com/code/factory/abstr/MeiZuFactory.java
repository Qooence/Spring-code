package com.code.factory.abstr;

import com.code.factory.MeiZu;
import com.code.factory.Phone;

public class MeiZuFactory extends AbstractFactory {
    @Override
    Phone getPhone() {
        return new MeiZu();
    }
}
