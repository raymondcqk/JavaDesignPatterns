package tech.keihong.simple;

import tech.keihong.product.*;

/**
 * 工厂模式
 */
public class SimpleFactory {


    public static PhoneProduct create(String type) {
        PhoneProduct phone = null;
        switch (type) {
            case "A":
                phone = new PhoneA();
                phone.setName("大华A1");
                phone.setCamera("2000万像素");
                phone.setScreen("5.6英寸");
                phone.setCommunication("5G");
                break;

            case "A_pro":
                phone = new PhoneAPro();
                phone.setName("大华A1 Pro");
                phone.setCamera("4800万像素");
                phone.setScreen("6.2英寸");
                phone.setCommunication("5G");
                break;

            case "B":
                phone = new PhoneB();
                phone.setName("红猪 H1 ");
                phone.setCamera("300万像素");
                phone.setScreen("5.7英寸");
                phone.setCommunication("4G");
                break;

            case "B_pro":
                phone = new PhoneBPro();
                phone.setName("红猪 H1 Pro ");
                phone.setCamera("800万像素");
                phone.setScreen("7.2英寸");
                phone.setCommunication("4G");
                break;

        }
        return phone;
    }


}


