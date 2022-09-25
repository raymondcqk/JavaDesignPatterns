package tech.keihong.factory;

import tech.keihong.product.PhoneA;
import tech.keihong.product.PhoneAPro;
import tech.keihong.product.PhoneProduct;

public class PhoneAProFactory implements Factory {
    @Override
    public PhoneProduct create(String color) {
        PhoneProduct phone = new PhoneAPro();
        phone.setName("大华A1 Pro");
        phone.setCamera("4800万像素");
        phone.setScreen("6.2英寸");
        phone.setCommunication("5G");
        return phone;
    }
}
