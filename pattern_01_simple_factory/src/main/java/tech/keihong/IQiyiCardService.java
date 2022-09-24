package tech.keihong;

public class IQiyiCardService {

    public void grantToken(String bindPhone, String awardNum) {

        if (awardNum == null)
            throw new RuntimeException("会员卡绑定失败");

    }
}
