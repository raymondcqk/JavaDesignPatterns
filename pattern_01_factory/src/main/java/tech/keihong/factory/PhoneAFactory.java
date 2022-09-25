package tech.keihong.factory;

import tech.keihong.product.PhoneA;
import tech.keihong.product.PhoneProduct;

public class PhoneAFactory implements Factory {
    @Override
    public PhoneProduct create(String color) {
        PhoneProduct phone = new PhoneA();
        phone.setName("大华A1");
        phone.setCamera("2000万像素");
        phone.setScreen("5.6英寸");
        phone.setCommunication("5G");
        return phone;
    }
}
