package tech.keihong.factory;

import tech.keihong.product.PhoneB;
import tech.keihong.product.PhoneBPro;
import tech.keihong.product.PhoneProduct;

public class PhoneBFactory implements Factory {
    @Override
    public PhoneProduct create(String color) {
        PhoneProduct phone = new PhoneB();
        phone.setName("红猪 H1 ");
        phone.setCamera("300万像素");
        phone.setScreen("5.7英寸");
        phone.setCommunication("4G");
        return phone;
    }
}
