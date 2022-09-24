package tech.keihong;

public class GuestVideoUserService implements IVideoUserService{

    @Override
    public String definition() {
        return "480P";
    }

    @Override
    public String advertisement() {
        return "有广告";
    }
}
