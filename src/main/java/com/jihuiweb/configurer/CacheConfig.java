package com.jihuiweb.configurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by ljx on 2017/9/28.
 */
@Configuration
public class CacheConfig {

    @Bean
    public CacheManager getCacheManager() {
        //所有缓存的名字
        List<String> cacheNames = new ArrayList();
        GuavaCacheManager cacheManager = new GuavaCacheManager();

        //最多缓存500 条，失效时间30分钟
        cacheManager.setCacheSpecification("maximumSize=500,expireAfterWrite=360m");
        //GuavaCacheManager 的数据结构类似  Map<String,Map<Object,Object>>  map =new HashMap<>();

        return cacheManager;
    }
}
