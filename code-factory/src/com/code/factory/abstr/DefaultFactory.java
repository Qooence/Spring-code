package com.code.factory.abstr;

import com.code.factory.HuaWei;
import com.code.factory.Phone;

public class DefaultFactory extends AbstractFactory{

    @Override
    Phone getPhone() {
        return new HuaWei();
    }
}
