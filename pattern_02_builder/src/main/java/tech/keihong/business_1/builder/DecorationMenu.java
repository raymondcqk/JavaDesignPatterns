package tech.keihong.business_1.builder;

import tech.keihong.business_1.matter.Matter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DecorationMenu implements IMenu {

    protected BigDecimal area;
    protected int level;
    protected BigDecimal price;
    protected List<Matter> matterList;

    public DecorationMenu(BigDecimal area, int level) {
        this.area = area;
        this.level = level;
        this.price = BigDecimal.ZERO;
        this.matterList = new ArrayList<>();
    }

    @Override
    public IMenu appendFloor(Matter matter) {
        this.matterList.add(matter);
        this.price = this.price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendTile(Matter matter) {
        this.matterList.add(matter);
        this.price = this.price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public String details() {
        StringBuilder sb = new StringBuilder(
                "\r\n-----------------------\r\n" + "装修清单:" + "\r\n"
                        + "装修套餐：" + this.level + "\r\n"
                        + "面积：" + this.area.doubleValue() + "平方米" + "\r\n"
                        + "装修价格：" + this.price.setScale(2, BigDecimal.ROUND_HALF_UP) + "元" + "\r\n"
                        + "材料清单：" + "\r\n"
        );
        for (Matter matter : matterList) {
            sb.append(matter.scene() + ":" + matter.brand() + "、" + matter.model() + "、" + matter.price().toString() + "\r\n");
        }
        return sb.toString();
    }




}
