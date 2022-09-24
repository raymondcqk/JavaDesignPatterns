package tech.keihong;


import org.junit.Test;

public class VideoUserServiceTest {

    @Test
    public void serviceGrade() {
        VideoUserService service = new VideoUserService();
        service.serviceGrade(UserType.VIP);
        service.serviceGrade(UserType.NORMAL);
        service.serviceGrade(UserType.GUEST);
    }
}