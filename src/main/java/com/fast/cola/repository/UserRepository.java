package com.fast.cola.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fast.cola.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author WangHuiJie
 * @date 2023/4/26 16:46
 **/
@Repository
@Mapper
public interface UserRepository extends BaseMapper<User> {


    User testFindUser();

}
