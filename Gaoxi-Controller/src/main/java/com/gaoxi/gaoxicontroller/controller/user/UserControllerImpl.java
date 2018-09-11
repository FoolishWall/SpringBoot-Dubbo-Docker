package com.gaoxi.gaoxicontroller.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaoxi.gaoxicommonservicefacade.entity.UserEntity;
import com.gaoxi.gaoxicommonservicefacade.facade.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wall
 * @date 2018/9/9  15:10
 * @description
 */

@RestController
@RequestMapping("/demo")
public class UserControllerImpl implements UserController {

    @Reference
    private UserService userService;

    @Override
    @GetMapping(value = "/test")
    public List<UserEntity> testDubbo() {
        UserEntity userEntity = new UserEntity();
        return userService.queryUser(userEntity);
    }
}
