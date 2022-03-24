package com.lagou.user;



import com.lagou.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户表(User)表服务接口
 *
 * @author LaoSun
 * @since 2020-09-08 10:55:48
 */
public interface UserService {

    /**
     * @param phone 手机号
     * @param password 密码
     * @return 用户对象
     */
    User login(String phone,String password);

    /**检查手机号是否注册过
     *
     * @param phone 手机号
     * @return 0：未注册 ， 1：已注册
     */
    Integer checkPhone(String phone);

    /**
     * 用户注册
     *
     * @param phone    手机号
     * @param password 密码
     * @return 受影响的行数
     */
    Integer register( String phone, String password);

    /**
     * 修改用户昵称和头像
     *
     * @return
     */
    Integer updateUserInfo( User user);


    /**
     * 修改密码
     * @return
     */
    //Integer updatePassword(@Param("password") String password,@Param("userid") Integer userid );
    Integer updatePassword(User user);

}