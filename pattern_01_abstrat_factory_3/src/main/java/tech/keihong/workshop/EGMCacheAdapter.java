package tech.keihong.workshop;

import tech.keihong.cluster.EGM;

import java.util.concurrent.TimeUnit;

public class EGMCacheAdapter implements ICacheAdapter {
    private EGM redisCluster = new EGM();

    @Override
    public String get(String key) {
        return redisCluster.gain(key);
    }

    @Override
    public void set(String key, String value) {
        redisCluster.set(key, value);
    }

    @Override
    public void set(String key, String value, Long timeout, TimeUnit timeUnit) {
        redisCluster.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisCluster.delete(key);
    }
}
