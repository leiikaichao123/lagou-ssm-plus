package com.lagou.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @BelongsProject: lagou-edu
 * @Author: GuoAn.Sun
 * @CreateTime: 2020-09-08 11:44
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO<User> implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer state;  // 操作状态
    private String message;  // 状态描述
    private Object content;  // 响应内容
    private Boolean success; //是否成功

    public UserDTO(Integer state, String message, Boolean success) {
        this.state = state;
        this.message = message;
        this.success = success;
    }
}
