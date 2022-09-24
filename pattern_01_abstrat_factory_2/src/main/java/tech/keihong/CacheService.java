package tech.keihong;

import java.util.concurrent.TimeUnit;

public interface CacheService {


    String get(String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, Long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);

}
