package tech.keihong.abstract_factory;

import tech.keihong.product.PhoneProduct;

public interface AbstractFactory {

    PhoneProduct createPhone(String color);

    MaskProduct createMask(String color);

}
