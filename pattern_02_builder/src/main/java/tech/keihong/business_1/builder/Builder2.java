package tech.keihong.business_1.builder;

import tech.keihong.business_1.matter.floor.DerFloor;
import tech.keihong.business_1.matter.floor.SengxiangFloor;
import tech.keihong.business_1.matter.tile.DongPengTile;
import tech.keihong.business_1.matter.tile.MarcoPoloTile;

import java.math.BigDecimal;

public class Builder2 {

    public IMenu levelOne(Double area) {
        return new DecorationMenu(BigDecimal.valueOf(area), 1).appendFloor(new DerFloor()).appendTile(new DongPengTile());
    }

    public IMenu levelTwo(Double area) {
        return new DecorationMenu(BigDecimal.valueOf(area), 1).appendFloor(new SengxiangFloor()).appendTile(new MarcoPoloTile());
    }
}
