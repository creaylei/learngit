package com.example.demo.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhangleishuidihuzhu.com on 2019/6/4.
 */

@Data
public class BaseEntity implements Serializable{

    private Long id;

    private Boolean isDelete;

    private Date createTime;

    private Date updateTime;

}
