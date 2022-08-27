package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 用户实体类
 * @author hp
 */
@ApiModel(value = "用户实体类")
public class User implements Serializable {


    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名", dataType="varchar")
    private String userName;


    /**
     * 年龄
     */
    @ApiModelProperty("年龄")
    private Integer age;


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }
}