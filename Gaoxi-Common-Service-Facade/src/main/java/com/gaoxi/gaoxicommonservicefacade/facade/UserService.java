package com.gaoxi.gaoxicommonservicefacade.facade;

import com.gaoxi.gaoxicommonservicefacade.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wall
 * @date 2018/9/5  10:55
 * @description 在Gaoxi-Common-Service-Facade中定义UserService的接口
 *              服务的发布和引用都依赖于接口
 */
public interface UserService {

    /**
     * 查询用户
     * @return
     */
    List<UserEntity> queryUser(UserEntity userEntity);
}
