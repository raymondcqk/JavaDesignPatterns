package tech.keihong.factory;

import tech.keihong.product.PhoneAPro;
import tech.keihong.product.PhoneBPro;
import tech.keihong.product.PhoneProduct;

public class PhoneBProFactory implements Factory {
    @Override
    public PhoneProduct create(String color) {
        PhoneProduct phone = new PhoneBPro();
        phone.setName("红猪 H1 Pro ");
        phone.setCamera("800万像素");
        phone.setScreen("7.2英寸");
        phone.setCommunication("4G");
        return phone;
    }
}
