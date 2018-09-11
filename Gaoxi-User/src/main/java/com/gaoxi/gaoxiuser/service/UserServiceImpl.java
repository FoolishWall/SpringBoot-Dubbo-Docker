package com.gaoxi.gaoxiuser.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaoxi.gaoxicommonservicefacade.entity.UserEntity;
import com.gaoxi.gaoxicommonservicefacade.facade.UserService;
import com.gaoxi.gaoxiuser.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * @author wall
 * @date 2018/9/5  11:09
 * @description 实现Gaoxi-Common-Service-Facade中的UserService接口
 */

@Service
public class UserServiceImpl implements UserService{

    //依赖注入DAO
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<UserEntity> queryUser(UserEntity userEntity) {
        return userDAO.selectUser(userEntity);
    }
}
