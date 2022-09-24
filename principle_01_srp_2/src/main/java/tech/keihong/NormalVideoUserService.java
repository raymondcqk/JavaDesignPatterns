package tech.keihong;

public class NormalVideoUserService implements IVideoUserService{

    @Override
    public String definition() {
        return "720P";
    }

    @Override
    public String advertisement() {
        return "无广告";
    }
}
