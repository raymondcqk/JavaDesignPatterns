package tech.keihong.abstract_factory;

import tech.keihong.product.PhoneProduct;

public class SuperBFactory implements AbstractFactory{
    @Override
    public PhoneProduct createPhone(String color) {
        return null;
    }

    @Override
    public MaskProduct createMask(String color) {
        return null;
    }
}
