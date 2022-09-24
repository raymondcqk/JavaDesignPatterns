package tech.keihong.redis;

import com.alibaba.fastjson2.JSON;
import tech.keihong.Log;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class RedisUtils {

    private Map<String, String> dataMap = new ConcurrentHashMap<String, String>();

    public String get(String key) {
        System.out.println("Redis获取数据 key: " + key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        System.out.println(String.format("Redis写入数据 %s : %s", key, value));
        dataMap.put(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        Log.info("Redis写入数据 key:%s val:%s timeout:%s timeUnit:%s", key, value, String.valueOf(timeout), JSON.toJSONString(timeUnit));
        dataMap.put(key, value);
    }

    public void del(String key) {
        Log.info("Redis删除 key：%s", key);
        dataMap.remove(key);
    }
}
