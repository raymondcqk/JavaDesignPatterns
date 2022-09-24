package tech.keihong;

import tech.keihong.cluster.EGM;
import tech.keihong.cluster.IIR;
import tech.keihong.redis.RedisUtils;

import java.util.concurrent.TimeUnit;

public class CacheClusterServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();
    private EGM egm = new EGM();
    private IIR iir = new IIR();


    @Override
    public String get(String key, int redisType) {
        if (redisType == 1) {
            return egm.gain(key);
        } else if (redisType == 2) {
            return iir.get(key);

        }
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value, int redisType) {
        if (redisType == 1) {
            egm.set(key, value);
            return;
        } else if (redisType == 2) {
            iir.set(key, value);
            return;
        }
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, Long timeout, TimeUnit timeUnit, int redisType) {

        if (redisType == 1) {
            egm.setEx(key, value, timeout, timeUnit);
            return;
        } else if (redisType == 2) {
            iir.setExpire(key, value, timeout, timeUnit);
            return;
        }
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key, int redisType) {
        if (redisType == 1) {
            egm.delete(key);
            return;
        } else if (redisType == 2) {
            iir.del(key);
            return;
        }
        redisUtils.del(key);
    }
}
