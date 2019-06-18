package com.abelein;

import redis.clients.jedis.Jedis;

public class jedis {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("192.168.199.157",6379);
        //jedis.auth("jbgsn");
        System.out.println(jedis.ping());

        jedis.zadd("a",100,"aa");
        System.out.println(jedis.zrange("a",0,-1));

    }
}
