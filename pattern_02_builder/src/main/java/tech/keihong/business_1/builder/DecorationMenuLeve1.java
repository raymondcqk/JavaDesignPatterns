package tech.keihong.business_1.builder;

import tech.keihong.business_1.matter.Matter;
import tech.keihong.business_1.matter.floor.DerFloor;
import tech.keihong.business_1.matter.floor.SengxiangFloor;
import tech.keihong.business_1.matter.tile.DongPengTile;

import java.math.BigDecimal;

public class DecorationMenuLeve1 extends AbsDecorationMenu {


    public DecorationMenuLeve1(BigDecimal area) {
        super(area, 1);
    }


    public IMenu build() {
        this.appendFloor(new DerFloor());
        this.appendTile(new DongPengTile());
        return this;
    }
}
