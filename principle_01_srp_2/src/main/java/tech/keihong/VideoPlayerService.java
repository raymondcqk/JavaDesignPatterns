package tech.keihong;

public class VideoPlayerService {

    public void play(String userType,IVideoUserService videoUserService){

        System.out.println("当前用类型: %s%n",userType);
        System.out.println("清晰度: %s%n",videoUserService.definition());
        System.out.println("广告: %s%n",videoUserService.advertisement());

    }
}
