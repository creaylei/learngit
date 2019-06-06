package com.example.demo.dao;

import com.example.demo.po.UserPo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhangleishuidihuzhu.com on 2019/6/4.
 */

@Component
public interface UserDao {

    UserPo queryByPrimary(@RequestParam("id") Long id);

    int addUserSelective(UserPo userPo);

    int updateUserSelective(UserPo userPo);
}
