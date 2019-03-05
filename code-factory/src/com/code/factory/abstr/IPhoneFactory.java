package com.code.factory.abstr;

import com.code.factory.IPhone;
import com.code.factory.Phone;

public class IPhoneFactory extends AbstractFactory {

    @Override
    Phone getPhone() {
        return new IPhone();
    }
}
