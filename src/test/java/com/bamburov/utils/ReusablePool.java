package com.bamburov.utils;

import com.bamburov.models.Props;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeoutException;

import static com.bamburov.utils.Constants.LOCAL_CONFIG_PROPERTIES_PATH;

public class ReusablePool {
    private static ReusablePool instance;

    private Map<Class, Object> pool = new HashMap<>();

    private ReusablePool() {

    }

    public static ReusablePool getInstance() {
        if (instance == null) {
            instance = new ReusablePool();
        }
        return instance;
    }

    public <T> T get(Class<T> clazz) {
        if (clazz.isAssignableFrom(Props.class)) {
            if (!pool.containsKey(Props.class)) {
                pool.put(Props.class, loadProperties());
            }
            return (T) pool.get(Props.class);
        } else {
            throw new IllegalArgumentException();
        }
    }

    private Props loadProperties() {
        try {
            InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(LOCAL_CONFIG_PROPERTIES_PATH);
            Properties properties = new Properties();
            properties.load(input);
            Props props = new Props();
            props.setBaseUrl(properties.getProperty("base.url"));
            props.setImplicitWaitInSeconds(Long.parseLong(properties.getProperty("implicit.wait.in.seconds")));
            input.close();
            return props;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
