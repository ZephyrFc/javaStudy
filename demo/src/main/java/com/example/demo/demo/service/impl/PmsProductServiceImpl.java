package com.example.demo.demo.service.impl;

import com.example.demo.demo.mapper.PmsProductMapper;
import com.example.demo.demo.model.PmsProduct;
import com.example.demo.demo.service.PmsProductService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @authorzephyr
 * @date2020/8/1310:52
 */
@Service
public class PmsProductServiceImpl implements PmsProductService, ApplicationContextAware {
    @Autowired
    private PmsProductMapper productMapper;
    private RedisTemplate<Object, Object> redisTemplate;
    private ApplicationContext applicationContext;
    @Override
    public List<PmsProduct> getPmsProduct() {
        //redis 字符串序列化

        RedisSerializer stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        //从redis中获取数据
        //保存至redis中时必须要进行序列化操作
        //高并发条件下存在缓存穿透的问题
        List<PmsProduct> getAllProduct = (List<PmsProduct>) redisTemplate.opsForValue().get("getAllProduct");
        //双重检测锁
        if (getAllProduct == null) {
         synchronized (this) {
             getAllProduct = (List<PmsProduct>) redisTemplate.opsForValue().get("getAllProduct");
             if (getAllProduct == null) {
                 getAllProduct = productMapper.selectAllProduct();
                 //保存redis
                 redisTemplate.opsForValue().set("getAllProduct", getAllProduct);
             }
         }
     }
        return getAllProduct;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
