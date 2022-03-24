package user;

import com.lagou.entity.User;
import mapper.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

/**
 * @BelongsProject: lagou-edu
 * @Author: GuoAn.Sun
 * @CreateTime: 2020-09-07 17:59
 * @Description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml" })
public class TestUser {

    @Autowired
    private UserDao userDao;
    
    @Test
    public void login(){
        User user = userDao.login("110", "123");
        System.out.println("user = " + user);
    }


    @Test
    public void checkPhone(){
        Integer i = userDao.checkPhone("1101");
        System.out.println("i = " + i); //0：未注册 ， 1：已注册
    }
//
//    @Test
//    public void register(){
//        Integer i = userDao.register("113", "123");
//        System.out.println("i = " + i); //0：注册失败 ， 1：注册成功
//    }
        @Test
    public void updateUserInfo(){
//            User user = new User();
//            user.setUserid(100030011);
//            user.setPortrait("图片地址");
//            user.setName("凯");
//            Integer integer = userDao.updateUserInfo(user);
//            System.out.println("i = " + integer);
    }
    @Test
    public void updatePassword(){
//        User user = new User();
//        user.setUserid(100030011);
//        user.setPassword("88888");
//        Integer integer = userDao.updatePassword(user);
//        System.out.println("i = " + integer);
    }

}
