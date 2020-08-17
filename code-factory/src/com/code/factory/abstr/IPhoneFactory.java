package com.code.factory.abstr;

import com.code.factory.IPhone;
import com.code.factory.Phone;

public class IPhoneFactory implements AbstractFactory {

    @Override
    public Phone getPhone() {
        return new IPhone();
    }
}
