package com.gaoxi.gaoxiuser.dao;

import com.gaoxi.gaoxicommonservicefacade.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOTest {

    @Autowired
    private UserDAO userDAO;
    @Test
    public void selectUser() throws Exception {
        UserEntity userEntity = new UserEntity();
        System.out.println(userDAO.selectUser(userEntity));
    }

}