package com.arthaszeng.categoryapi.service.impl;

import com.arthaszeng.categoryapi.entity.User;
import com.arthaszeng.categoryapi.mapper.UserMapper;
import com.arthaszeng.categoryapi.service.IUserService;
import org.springframework.stereotype.Service;

import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends SuperServiceImpl<UserMapper, User> implements IUserService {


}