package tech.keihong.cluster;

import com.alibaba.fastjson2.JSON;
import tech.keihong.Log;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class EGM {
    private Map<String, String> dataMap = new ConcurrentHashMap<String, String>();

    public String gain(String key) {
        System.out.println("EGM获取数据 key: " + key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        Log.info("EGM写入数据: key:%s, val:%s ", key, value);
        dataMap.put(key, value);
    }

    public void setEx(String key, String value, Long timeout, TimeUnit timeUnit) {
        Log.info("EGM 写入数据 key:%s val:%s timeout:%s timeUnit:%s", key, value, String.valueOf(timeout), JSON.toJSONString(timeUnit));
        dataMap.put(key, value);
    }

    public void delete(String key) {
        Log.info("EGM 删除数据 key:%s", key);
        dataMap.remove(key);
    }
}
