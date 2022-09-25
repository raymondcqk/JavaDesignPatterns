package tech.keihong.business_1.builder;

import java.math.BigDecimal;

public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationMenuLeve1(BigDecimal.valueOf(area)).build();
    }

    public IMenu levelTwo(Double area) {
        return new DecorationMenuLeve2(BigDecimal.valueOf(area)).build();
    }
}
