package tech.keihong;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    public void testApp() {
        VideoPlayerService playerService = new VideoPlayerService();
        //VIP会员
        playerService.play(UserType.VIP, new VipVideoUserService());
        //普通会员
        playerService.play(UserType.NORMAL, new NormalVideoUserService());
        //访客用户
        playerService.play(UserType.GUEST, new GuestVideoUserService());
    }
}
