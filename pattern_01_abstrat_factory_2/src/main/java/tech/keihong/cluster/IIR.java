package tech.keihong.cluster;

import com.alibaba.fastjson2.JSON;
import tech.keihong.Log;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class IIR {
    private Map<String, String> dataMap = new ConcurrentHashMap<String, String>();

    public String get(String key) {
        System.out.println("IIR获取数据 key: " + key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        Log.info("IIR写入数据: key:%s, val:%s ", key, value);
        dataMap.put(key, value);
    }

    public void setExpire(String key, String value, Long timeout, TimeUnit timeUnit) {
        Log.info("IIR 写入数据 key:%s val:%s timeout:%s timeUnit:%s", key, value, String.valueOf(timeout), JSON.toJSONString(timeUnit));
        dataMap.put(key, value);
    }

    public void del(String key) {
        Log.info("IIR 删除数据 key:%s", key);
        dataMap.remove(key);
    }
}
