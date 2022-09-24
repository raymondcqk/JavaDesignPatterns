package tech.keihong.commodity_service;


import tech.keihong.DeliverInfo;
import tech.keihong.DeliverReq;
import tech.keihong.GoodsService;
import tech.keihong.ICommodity;

public class GoodsCommodityService implements ICommodity {

    GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String userId, String bizId, String commodityId, String bindMobile, DeliverInfo deliverInfo) {

        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setOrderId(bizId);
        deliverReq.setSku(commodityId);
        deliverReq.setUserName(deliverInfo.getUsername());
        deliverReq.setUserPhone(deliverInfo.getUserPhone());

        boolean isSuccess = goodsService.deliverGoods(deliverReq);
//        if (isSuccess) {
//            res = new AwardRes("0000", "发送成功");
//        } else {
//            res = new AwardRes("0000", "失败");
//        }

        if (!isSuccess) {
            throw new RuntimeException("实物商品发放失败");
        }

    }
}
