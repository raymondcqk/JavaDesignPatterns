package tech.keihong.factory;

import tech.keihong.product.PhoneProduct;

public interface Factory {

    PhoneProduct create(String color);

}
