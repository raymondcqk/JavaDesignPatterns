package tech.keihong.business_1.builder;

import tech.keihong.business_1.matter.Matter;

public interface IMenu {

    IMenu appendFloor(Matter matter);

    IMenu appendTile(Matter matter);


    String details();


}
