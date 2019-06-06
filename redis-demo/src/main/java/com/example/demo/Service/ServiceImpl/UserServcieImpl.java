package com.example.demo.Service.ServiceImpl;

import com.example.demo.Service.UserService;
import com.example.demo.dao.UserDao;
import com.example.demo.po.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by zhangleishuidihuzhu.com on 2019/6/5.
 */
@Service
public class UserServcieImpl implements UserService{

    public static final String USER_INFO_KEY = "user:%s";

    @Autowired
    private JedisPool jedisPool;

    @Autowired
    private UserDao userDao;

    public UserPo queryUserByPrimary(@RequestParam("id") Long id) {
        return userDao.queryByPrimary(id);
    }

    public int addUserSelective(UserPo userPo) {
        String key = String.format(USER_INFO_KEY, userPo.getUserName());
        try(Jedis jedis = jedisPool.getResource()) {
            jedis.set(key, userPo.toString());
            System.out.println(jedis.get(key));
        }
        return userDao.addUserSelective(userPo);
    }

    public int updateUserSelective(UserPo userPo) {
        return userDao.updateUserSelective(userPo);
    }


}
