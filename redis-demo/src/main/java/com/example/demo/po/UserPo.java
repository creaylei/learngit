package com.example.demo.po;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by zhangleishuidihuzhu.com on 2019/6/4.
 */
@Data
@NoArgsConstructor
public class UserPo extends BaseEntity{

    private String userName;

    private Integer sex;

    private Integer age;
}
