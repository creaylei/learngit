package com.example.demo.Service;

import com.example.demo.po.UserPo;

/**
 * Created by zhangleishuidihuzhu.com on 2019/6/5.
 */
public interface UserService {

    UserPo queryUserByPrimary(Long id);

    int addUserSelective(UserPo userPo);

    int updateUserSelective(UserPo userPo);
}
