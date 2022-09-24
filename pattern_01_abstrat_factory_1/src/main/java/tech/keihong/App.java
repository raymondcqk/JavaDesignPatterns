package tech.keihong;

import tech.keihong.application.CacheService;
import tech.keihong.application.CacheServiceImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("user_name_01", "康康");
        String user_name_01 = cacheService.get("user_name_01");
        System.out.println("get = " + user_name_01);


    }
}
