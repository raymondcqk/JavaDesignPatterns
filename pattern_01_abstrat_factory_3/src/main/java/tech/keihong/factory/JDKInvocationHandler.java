package tech.keihong.factory;

import tech.keihong.application.CacheService;
import tech.keihong.util.ClassLoaderUtils;
import tech.keihong.workshop.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKInvocationHandler implements InvocationHandler {

    private final ICacheAdapter adapter;

    public JDKInvocationHandler(ICacheAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(adapter, args);

    }
}
