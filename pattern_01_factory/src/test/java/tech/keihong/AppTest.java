package tech.keihong;

import junit.framework.TestCase;
import tech.keihong.factory.PhoneFactory;
import tech.keihong.product.PhoneProduct;
import tech.keihong.simple.SimpleFactory;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    public void testApp() {

        PhoneProduct a = SimpleFactory.create("A");
        a.show();
        a.charge();

        PhoneProduct a_pro = SimpleFactory.create("A_pro");
        a_pro.show();
        a_pro.charge();

        PhoneProduct b = SimpleFactory.create("B");
        b.show();
        b.charge();

        PhoneProduct b_pro = SimpleFactory.create("B_pro");
        b_pro.show();
        b_pro.charge();
    }

    public void test2() {

        PhoneProduct a = PhoneFactory.create("A");
        a.show();
        a.charge();

        PhoneProduct a_pro = PhoneFactory.create("A_pro");
        a_pro.show();
        a_pro.charge();

        PhoneProduct b = PhoneFactory.create("B");
        b.show();
        b.charge();

        PhoneProduct b_pro = PhoneFactory.create("B_pro");
        b_pro.show();
        b_pro.charge();
    }
}
