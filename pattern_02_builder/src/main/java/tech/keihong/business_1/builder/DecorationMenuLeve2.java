package tech.keihong.business_1.builder;

import tech.keihong.business_1.matter.floor.DerFloor;
import tech.keihong.business_1.matter.floor.SengxiangFloor;
import tech.keihong.business_1.matter.tile.DongPengTile;
import tech.keihong.business_1.matter.tile.MarcoPoloTile;

import java.math.BigDecimal;

public class DecorationMenuLeve2 extends AbsDecorationMenu {


    public DecorationMenuLeve2(BigDecimal area) {
        super(area, 2);
    }


    public IMenu build() {
        this.appendFloor(new SengxiangFloor());
        this.appendTile(new MarcoPoloTile());
        return this;
    }
}
