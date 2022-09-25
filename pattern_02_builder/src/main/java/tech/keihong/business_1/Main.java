package tech.keihong.business_1;

import tech.keihong.business_1.builder.Builder;
import tech.keihong.business_1.builder.Builder2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
//        DecorationPackageController1 controller = new DecorationPackageController1();
//        String detail1 = controller.getPackage(new BigDecimal("288.3"), 1);
//        System.out.printf(detail1);
//
//        String detail2 = controller.getPackage(new BigDecimal("288.3"), 2);
//        System.out.printf(detail2);


//        Builder builder = new Builder();
        Builder2 builder = new Builder2();
        System.out.printf(builder.levelOne(288.3).details());
        System.out.printf(builder.levelTwo(288.3).details());


    }
}
