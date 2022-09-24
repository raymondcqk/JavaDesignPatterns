package tech.keihong.common;

import tech.keihong.DeliverInfo;

public class AwardReq {

    private Integer type;
    private String uId;
    private String awardNum;
    private String bindPhone;
    private String bizId;
    private DeliverInfo deliverInfo;


    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAwardNum() {
        return awardNum;
    }

    public void setAwardNum(String awardNum) {
        this.awardNum = awardNum;
    }

    public String getBindPhone() {
        return bindPhone;
    }

    public void setBindPhone(String bindPhone) {
        this.bindPhone = bindPhone;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public DeliverInfo getDeliverInfo() {
        return deliverInfo;
    }

    public void setDeliverInfo(DeliverInfo deliverInfo) {
        this.deliverInfo = deliverInfo;
    }
}
