package tech.keihong;


public interface ICommodity {

    void sendCommodity(String userId, String bizId, String commodityId, String bindMobile,DeliverInfo deliverInfo);
}
