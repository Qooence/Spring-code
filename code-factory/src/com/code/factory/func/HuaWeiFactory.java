package com.code.factory.func;

import com.code.factory.HuaWei;
import com.code.factory.Phone;

public class HuaWeiFactory implements Factory {
    @Override
    public Phone getPhone() {
        return new HuaWei();
    }
}
