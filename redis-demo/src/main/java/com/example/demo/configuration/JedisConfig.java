package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by zhangleishuidihuzhu.com on 2019/6/5.
 */
@Configuration
public class JedisConfig {

    @Bean
    public JedisPoolConfig jedisPoolConfig() {
        return  new JedisPoolConfig();
    }

    @Bean(destroyMethod = "close")
    public JedisPool jedisPool(@Value("${spring.redis.host}") String host) {
        return new JedisPool(jedisPoolConfig(), host);
    }
}
