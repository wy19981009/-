package com.wy.studypromptingservice.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 用户ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 加密后的密码
     */
    private String password;

    /**
     * 密码加密盐值（如果使用Salt加密）
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 头像URL
     */
    private String avatar;

    /**
     * 账户状态（0:禁用, 1:正常, 2:冻结）
     */
    private Integer status;

    /**
     * 用户角色
     */
    private Object role;

    /**
     * 注册时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 上次登录时间
     */
    private Date lastLogin;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}