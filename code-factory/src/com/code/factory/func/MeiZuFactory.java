package com.code.factory.func;

import com.code.factory.MeiZu;
import com.code.factory.Phone;

public class MeiZuFactory implements Factory {
    @Override
    public Phone getPhone() {
        return new MeiZu();
    }
}
