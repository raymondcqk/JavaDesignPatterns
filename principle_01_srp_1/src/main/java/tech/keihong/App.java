package tech.keihong;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        VideoUserService service = new VideoUserService();
        service.serviceGrade(UserType.VIP);
        service.serviceGrade(UserType.NORMAL);
        service.serviceGrade(UserType.GUEST);
    }
}
