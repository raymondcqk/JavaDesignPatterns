package tech.keihong;

public class VipVideoUserService  implements IVideoUserService{

    @Override
    public String definition() {
        return "1080P";
    }

    @Override
    public String advertisement() {
        return "无广告";
    }
}
