package tech.keihong.business_1.matter.floor;

import tech.keihong.business_1.matter.Matter;

import java.math.BigDecimal;

public class SengxiangFloor implements Matter {

    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣象";
    }

    @Override
    public String model() {
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("232");
    }
}
