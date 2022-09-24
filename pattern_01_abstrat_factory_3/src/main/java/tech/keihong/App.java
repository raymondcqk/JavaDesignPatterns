package tech.keihong;

import tech.keihong.application.CacheServiceImpl;
import tech.keihong.factory.JDKProxyFactory;
import tech.keihong.workshop.EGMCacheAdapter;
import tech.keihong.application.CacheService;
import tech.keihong.workshop.IIRCacheAdapter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {


//        System.out.println("========未使用集群=========");
//        CacheService cacheService = new CacheServiceImpl();
//        cacheService.set("user_name_00", "康康");
//        String user_name_0 = cacheService.get("user_name_00");
//        System.out.println("get = " + user_name_0);


        System.out.println("========改用用集群=========");
        CacheService cacheService = JDKProxyFactory.getProxy(CacheService.class,EGMCacheAdapter.class);
        cacheService.set("user_name_00", "康康");
        String user_name_0 = cacheService.get("user_name_00");
        System.out.println("get = " + user_name_0);

        System.out.println("========已使用集群  EGM=========");


        CacheService proxy_EGM = JDKProxyFactory.getProxy(CacheService.class, EGMCacheAdapter.class);
        proxy_EGM.set("user_name_01", "康康");
        String user_name_01 = proxy_EGM.get("user_name_01");
        System.out.println("get = " + user_name_01);

        System.out.println("========已使用集群  IIR=========");

        CacheService proxy_IIR = JDKProxyFactory.getProxy(CacheService.class, IIRCacheAdapter.class);
        proxy_IIR.set("user_name_02", "康康IIR");
        String user_name_02 = proxy_IIR.get("user_name_02");
        System.out.println("get = " + user_name_02);
    }
}
