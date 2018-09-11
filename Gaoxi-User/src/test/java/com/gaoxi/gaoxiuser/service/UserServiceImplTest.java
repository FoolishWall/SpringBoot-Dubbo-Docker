package com.gaoxi.gaoxiuser.service;

import com.gaoxi.gaoxicommonservicefacade.entity.UserEntity;
import com.gaoxi.gaoxiuser.dao.UserDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author wall
 * @date 2018/9/5  11:13
 * @description 测试service
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;
    @Test
    public void queryUser() throws Exception {
        UserEntity userEntity = new UserEntity();
        System.out.println(userService.queryUser(userEntity));
    }

}