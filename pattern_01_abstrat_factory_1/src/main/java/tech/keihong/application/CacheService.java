package tech.keihong.application;

import java.util.concurrent.TimeUnit;

public interface CacheService {

    String get(String key);


    void set(String key, String value);

    void set(String key, String value, Long timeout, TimeUnit timeUnit);

    void del(String key);

}
