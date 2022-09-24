package tech.keihong.commodity_service;


import tech.keihong.DeliverInfo;
import tech.keihong.ICommodity;
import tech.keihong.IQiyiCardService;

public class IqiCardCommodityService implements ICommodity {
    @Override
    public void sendCommodity(String userId, String bizId, String commodityId, String bindMobile, DeliverInfo deliverInfo) {
        IQiyiCardService iQiyiCardService = new IQiyiCardService();
        iQiyiCardService.grantToken(bindMobile, commodityId);

    }
}
