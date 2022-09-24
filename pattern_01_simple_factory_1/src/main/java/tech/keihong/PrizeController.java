package tech.keihong;


import tech.keihong.common.AwardReq;

public class PrizeController {

    public void sendPrice(AwardReq awardReq) {
        StoreFactory storeFactory = new StoreFactory();
        ICommodity commodityService = storeFactory.getCommodityService(awardReq.getType());
        commodityService.sendCommodity(awardReq.getuId(), awardReq.getBizId(), awardReq.getAwardNum(), awardReq.getBindPhone(), awardReq.getDeliverInfo());
    }
}
