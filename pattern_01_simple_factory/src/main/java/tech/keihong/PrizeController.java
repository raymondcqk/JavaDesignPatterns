package tech.keihong;

import tech.keihong.common.AwardReq;
import tech.keihong.common.AwardRes;

public class PrizeController {

    public AwardRes awardToUser(AwardReq req) {

        AwardRes res = null;

        //代金券
        if (req.getType() == 1) {

            CouponService couponService = new CouponService();
            CouponResult couponResult = couponService.sendCoupon(req.getuId(), req.getAwardNum(), req.getBizId());

            if ("0000".equals(couponResult.getCode())) {
                res = new AwardRes("0000", "发送成功");
            } else {
                res = new AwardRes("0001", couponResult.getInfo());
            }
        //实物商品
        } else if (req.getType() == 2) {
            GoodsService goodsService = new GoodsService();
            DeliverReq deliverReq = new DeliverReq();
            deliverReq.setOrderId(req.getBizId());
            deliverReq.setSku(req.getAwardNum());
            deliverReq.setUserName(req.getDeliverInfo().getUsername());
            deliverReq.setUserPhone(req.getDeliverInfo().getUserPhone());

            boolean isSuccess = goodsService.deliverGoods(deliverReq);
            if (isSuccess) {
                res = new AwardRes("0000", "发送成功");
            } else {
                res = new AwardRes("0000", "失败");
            }
        //兑换卡
        } else if (req.getType() == 3) {
            IQiyiCardService iQiyiCardService = new IQiyiCardService();
            iQiyiCardService.grantToken(req.getBindPhone(), req.getAwardNum());
            res = new AwardRes("0000", "发送成功");
        }

        return res;

    }
}
