package com.gaoxi.gaoxicontroller.controller.user;

import com.gaoxi.gaoxicommonservicefacade.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wall
 * @date 2018/9/9  15:02
 * @description
 */

public interface UserController {

    List<UserEntity> testDubbo();
}
