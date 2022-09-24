package tech.keihong;

public class StoreFactory {


    public ICommodity getCommodityService(int type) {
        if (type == 1) {
            return new CouponCommodityService();
        } else if (type == 2) {
            return new GoodsCommodityService();
        } else if (type == 3) {
            return new IqiCardCommodityService();
        } else {
            throw new RuntimeException("不存在的奖品服务类型");
        }
    }

    public ICommodity getCommodityService(Class<? extends ICommodity> clazz) throws InstantiationException, IllegalAccessException {
        if (null == clazz) {
            return null;
        }
        return clazz.newInstance();
    }


}
