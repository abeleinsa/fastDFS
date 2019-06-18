package com.abelein;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jedisTest {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("192.168.199.157",6379);
        jedis.auth("123");
        System.out.println(jedis.ping()+"---------->");

    //五种数据类型了练习测试
    //String
        jedis.set("name","熊大");
        jedis.mset("a","aaa","b","bbb");
        System.out.println(jedis.get("name"));
        System.out.println(jedis.mget("name","a","b"));

        //hash
        jedis.hset("x","price","1000");

        Map<String,String> map=new HashMap<String, String>();
        map.put("id","1002");
        map.put("title","en");
        map.put("price","6000");
        jedis.hmset("items",map);

        List<String> hmget = jedis.hmget("items", "id", "title", "price");
        System.out.println(hmget);

    }
}
