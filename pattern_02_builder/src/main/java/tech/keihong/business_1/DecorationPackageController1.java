package tech.keihong.business_1;

import tech.keihong.business_1.matter.*;
import tech.keihong.business_1.matter.floor.DerFloor;
import tech.keihong.business_1.matter.floor.SengxiangFloor;
import tech.keihong.business_1.matter.tile.DongPengTile;
import tech.keihong.business_1.matter.tile.MarcoPoloTile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DecorationPackageController1 {


    String getPackage(BigDecimal area, Integer level) {
        List<Matter> matterList = new ArrayList<>();
        BigDecimal price = BigDecimal.ZERO;
        if (level == 1) {
            Matter floor = new DerFloor();
            matterList.add(floor);
            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(floor.price()));

            Matter tile = new DongPengTile();
            matterList.add(tile);
            price = price.add(area.multiply(tile.price()));
        } else if (level == 2) {
            Matter floor = new SengxiangFloor();
            matterList.add(floor);
            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(floor.price()));
            Matter tile = new MarcoPoloTile();
            matterList.add(tile);
            price = price.add(area.multiply(tile.price()));

        } else {
            return "套餐参数有误";
        }

        StringBuilder sb = new StringBuilder(
                "\r\n-----------------------\r\n" + "装修清单:" + "\r\n"
                        + "装修套餐：" + level + "\r\n"
                        + "面积：" + area.doubleValue() + "平方米" + "\r\n"
                        + "装修价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + "元" + "\r\n"
                        + "材料清单：" + "\r\n"
        );
        for (Matter matter : matterList) {
            sb.append(matter.scene() + ":" + matter.brand() + "/" + matter.model() + "/" + matter.price().toString() + "\r\n");
        }
        return sb.toString();

    }


}
