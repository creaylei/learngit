package com.example.demo.enums;

/**
 * Created by zhangleishuidihuzhu.com on 2019/6/4.
 */
public enum UserSex {
    MAN(0, "男"),
    WOMAN(1, "女");


    private int code;
    private String description;

    UserSex(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {return this.code;}

    public String getDescription() {return this.description;}
}
