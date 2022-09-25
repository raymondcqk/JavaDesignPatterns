package tech.keihong.factory;

import tech.keihong.product.*;

public class PhoneFactory {

    public static PhoneProduct create(String type) {
        PhoneProduct phone = null;
        switch (type) {
            case "A":
                phone = new PhoneAFactory().create(null);
                break;

            case "A_pro":
                phone = new PhoneAProFactory().create(null);
                break;

            case "B":
                phone = new PhoneBFactory().create(null);
                break;

            case "B_pro":
                phone = new PhoneBProFactory().create(null);
                break;

        }
        return phone;
    }
}
