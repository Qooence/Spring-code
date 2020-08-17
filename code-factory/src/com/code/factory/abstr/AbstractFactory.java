package com.code.factory.abstr;

import com.code.factory.HuaWei;
import com.code.factory.IPhone;
import com.code.factory.MeiZu;
import com.code.factory.Phone;

public interface AbstractFactory {

    default Phone getPhone(String name){
        if (name.equalsIgnoreCase("IPhone")){
            return new IPhone();
        }else if (name.equalsIgnoreCase("HuaWei")){
            return new HuaWei();
        }else if (name.equalsIgnoreCase("MeiZu")){
            return new MeiZu();
        }else {
            System.out.println("无法生产该手机");
            return null;
        }
    }

    Phone getPhone();
}
