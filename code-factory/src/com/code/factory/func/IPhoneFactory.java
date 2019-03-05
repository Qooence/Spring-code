package com.code.factory.func;

import com.code.factory.IPhone;
import com.code.factory.Phone;

public class IPhoneFactory implements Factory {

    @Override
    public Phone getPhone() {
        return new IPhone();
    }
}
