package com.code.prototype.greatestsage;

import java.io.*;
import java.util.Date;

/**
 * 齐天大圣
 */
public class TheGreatestSage extends Monkey implements Cloneable, Serializable {
    // 金箍棒
    private GoldRingedStaff staff;

    // 从石头缝里蹦出来
    public TheGreatestSage(){
        this.staff = new GoldRingedStaff();
        this.birthday = new Date();
        this.height = 150;
        this.weight = 30;
    }

    //分身技能
    public Object clone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // return super.clone(); //默认浅拷贝 八大基本数据类型 + String
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            TheGreatestSage copy = (TheGreatestSage)ois.readObject();
            copy.birthday = new Date();

            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {

            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void change(){
        TheGreatestSage copySage = (TheGreatestSage) clone();
        System.out.println("大圣本尊生日：" + this.getBirthday().getTime());
        System.out.println("克隆大圣生日：" + copySage.getBirthday().getTime());
        System.out.println("大圣本尊和克隆的大圣是否为同一个对象：" + (this == copySage));
        System.out.println("大圣本尊持有的金箍棒和克隆大圣持有的金箍棒是否为同一个对象：" + (this.staff == copySage.getStaff()));
    }

    public GoldRingedStaff getStaff() {
        return staff;
    }

    public void setStaff(GoldRingedStaff staff) {
        this.staff = staff;
    }
}
