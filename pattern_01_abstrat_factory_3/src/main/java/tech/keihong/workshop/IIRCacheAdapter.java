package tech.keihong.workshop;

import tech.keihong.cluster.EGM;
import tech.keihong.cluster.IIR;

import java.util.concurrent.TimeUnit;

public class IIRCacheAdapter implements ICacheAdapter {

    private IIR redisCluster = new IIR();

    @Override
    public String get(String key) {
        return redisCluster.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisCluster.set(key, value);
    }

    @Override
    public void set(String key, String value, Long timeout, TimeUnit timeUnit) {
        redisCluster.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisCluster.del(key);
    }

}
