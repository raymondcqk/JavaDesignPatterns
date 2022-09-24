package tech.keihong;

/**
 * 服务类
 * <p>
 * 2022/08/22
 */
public class VideoUserService {

    public void serviceGrade(String userType) {
        if (UserType.VIP.equals(userType)) {
            System.out.println("VIP会员：\n1. 视频清晰度:1080P\n2. 广告:无广告");
        } else if (UserType.NORMAL.equals(userType)) {
            System.out.println("普通会员：\n1. 视频清晰度:720P\n2. 广告:有");
        } else if (UserType.GUEST.equals(userType)) {
            System.out.println("访客用户：\n1. 视频清晰度:480P\n2. 广告:有广告");
        }
    }

}
