package tech.keihong.business_1.matter.floor;

import tech.keihong.business_1.matter.Matter;

import java.math.BigDecimal;

public class DerFloor implements Matter {

    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔Der";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("119");
    }
}
