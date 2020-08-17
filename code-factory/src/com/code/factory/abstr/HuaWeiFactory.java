package com.code.factory.abstr;

import com.code.factory.HuaWei;
import com.code.factory.Phone;

public class HuaWeiFactory implements AbstractFactory{
    @Override
    public Phone getPhone() {
        return new HuaWei();
    }
}
