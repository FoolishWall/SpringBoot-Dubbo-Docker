package com.gaoxi.gaoxiuser.dao;

import com.gaoxi.gaoxicommonservicefacade.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;



import java.util.List;

@Mapper
public interface UserDAO {
    /**
     * 查询
     * @param userEntity
     * @return
     */
    List<UserEntity> selectUser(UserEntity userEntity);

}
