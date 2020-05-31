package top.caker.gmall.lock.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.stereotype.Component;
import top.caker.gmall.common.lock.LockCostant;
import top.caker.gmall.lock.LockService;

import java.util.Collections;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author cakeralter
 * @date 2020/5/31
 */
@Service
@Component
public class LockServiceImpl implements LockService {

    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private RedissonClient client;

    /**
     * 分布式锁使用：
     * 1、setnx命令判断是否可以获取锁
     * 2、执行业务代码
     * 3、释放锁
     *
     * @return
     */
    @Override
    public String lock() {
        // 获取锁 token防止锁超时后释放了其他人的锁
        String token = UUID.randomUUID().toString();
        Boolean lock = redisTemplate.opsForValue()
                .setIfAbsent(LockCostant.KEY, token, LockCostant.EXPIRE, TimeUnit.SECONDS);
        if (Objects.equals(lock, true)) {
            // TODO 业务
            increment();

            // 释放锁
            Long execute = redisTemplate.execute(new DefaultRedisScript<>(LockCostant.DELETE_SCRIPT, Long.class),
                    Collections.singletonList(LockCostant.KEY), token);
            System.out.println(execute);
        } else {
            lock();
        }
        return "OK";
    }

    @Override
    public String redissonLock() {
        RLock lock = client.getLock(LockCostant.KEY);
        try {
            lock.lock();

            // TODO 业务
            increment();

            return "OK";
        } finally {
            lock.unlock();
        }
    }

    /**
     * 模拟业务
     */
    private void increment() {
        String num = redisTemplate.opsForValue().get("num");
        Integer n = Integer.valueOf(num);
        n++;
        redisTemplate.opsForValue().set("num", String.valueOf(n));
    }
}
