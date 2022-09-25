package tech.keihong.business_1.matter.tile;

import tech.keihong.business_1.matter.Matter;

import java.math.BigDecimal;

public class MarcoPoloTile implements Matter {

    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马可波罗";
    }

    @Override
    public String model() {
        return "B级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("25");
    }
}
