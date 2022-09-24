package tech.keihong.commodity_service;


import tech.keihong.CouponResult;
import tech.keihong.CouponService;
import tech.keihong.DeliverInfo;
import tech.keihong.ICommodity;

public class CouponCommodityService  implements ICommodity {

    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String userId, String bizId, String commodityId, String bindMobile, DeliverInfo deliverInfo) {
        CouponResult couponResult = couponService.sendCoupon(userId, commodityId, bizId);

//        if ("0000".equals(couponResult.getCode())) {
//            res = new AwardRes("0000", "发送成功");
//        } else {
//            res = new AwardRes("0001", couponResult.getInfo());
//        }

        if (!"0000".equals(couponResult.getCode())){
            throw new RuntimeException(couponResult.getInfo());
        }

    }


}
